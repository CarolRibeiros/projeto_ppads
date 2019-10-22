package br.com.projeto.redesocial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.bens.Usuario;

public class UsuarioDAO {

	private Connection con = Conexao.getConnection();
	
	public void cadastro(Usuario usuario) {
		String sql = "INSERT INTO Cad_Usuario(nome_usuario, senha, data_nascimento, data_ciencia, estado, cidade, salario, nivelInstrucao, empresa) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome_usuario());
			preparador.setString(2, usuario.getSenha());
			preparador.setString(3, usuario.getData_nascimento());
			preparador.setString(4, usuario.getData_ciencia());
			preparador.setString(5, usuario.getEstado());
			preparador.setString(6, usuario.getCidade());
			preparador.setString(7, usuario.getSalario());
			preparador.setString(8, usuario.getNivelInstrucao());
			preparador.setString(9, usuario.getEmpresa());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cadastrado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public Usuario buscaporId(String nome_usuario) {
		Usuario usuRetorno = null;
		String sql = "SELECT * FROM Cad_Usuario WHERE nome_usuario=?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, nome_usuario);
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				usuRetorno = new Usuario();
				usuRetorno.setNome_usuario(resultado.getString("nome_usuario"));
				usuRetorno.setSenha(resultado.getString("senha"));
				usuRetorno.setData_nascimento(resultado.getString("data_nascimento"));
				usuRetorno.setData_ciencia(resultado.getString("data_ciencia"));
				usuRetorno.setEstado(resultado.getString("estado"));
				usuRetorno.setCidade(resultado.getString("cidade"));
				usuRetorno.setSalario(resultado.getString("salario"));
				usuRetorno.setNivelInstrucao(resultado.getString("nivelInstrucao"));
				usuRetorno.setEmpresa(resultado.getString("empresa"));
			}
			System.out.println("Encontrado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro de SQL: " + e.getMessage());
		}
		return usuRetorno;
	}
	
	public List<Usuario> buscaTodos(Usuario usuario) {
		String sql = "SELECT * FROM Cad_Usuario";
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			while(resultados.next()) {
				Usuario usu = new Usuario();
				usu.setNome_usuario(resultados.getString("nome_usuario"));
				usu.setSenha(resultados.getString("senha"));
				usu.setData_nascimento(resultados.getString("data_nascimento"));
				usu.setData_ciencia(resultados.getString("data_ciencia"));
				usu.setEstado(resultados.getString("estado"));
				usu.setCidade(resultados.getString("cidade"));
				usu.setSalario(resultados.getString("salario"));
				usu.setNivelInstrucao(resultados.getString("nivelInstrucao"));
				usu.setEmpresa(resultados.getString("empresa"));
				lista.add(usu);
			}
		}
		catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return lista;
		
	}
	
	public void update(Usuario usuario) {
		String sql = "UPDATE Cad_Usuario SET nome_usuario = ?, senha = ?, data_nascimento = ?, data_ciencia = ?, estado = ?, cidade = ?, salario = ?, nivelInstrucao = ?, empresa = ?";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			preparador.setString(1,  usuario.getNome_usuario());
			preparador.setString(2,  usuario.getSenha());
			preparador.setString(3,  usuario.getData_nascimento());
			preparador.setString(4,  usuario.getData_ciencia());
			preparador.setString(5,  usuario.getEstado());
			preparador.setString(6,  usuario.getCidade());
			preparador.setString(7,  usuario.getSalario());
			preparador.setString(8,  usuario.getNivelInstrucao());
			preparador.setString(9,  usuario.getEmpresa());
			
			preparador.execute();
			preparador.close();
			System.out.println("Alterado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
	}
		
	public Usuario autenticacao(Usuario usuario) {
		Usuario usuRetorno = null;
		String sql = "SELECT * FROM Cad_Usuario WHERE nome_usuario = ? AND senha = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome_usuario());
			preparador.setString(2,  usuario.getSenha());
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				usuRetorno = new Usuario();
				usuRetorno.setNome_usuario(resultado.getString("nome_usuario"));
				usuRetorno.setSenha(resultado.getString("senha"));
			}
			System.out.println("Encontrado com sucesso!");
		}
		catch(SQLException e) {
			System.out.println("Erro de SQL: " + e.getMessage());
		}
		return usuRetorno;	
		
	}
}

