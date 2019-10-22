package br.com.projeto.redesocial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.projeto.bens.UsuarioDois;

public class UsuarioDAODois {
	private Connection con = Conexao.getConnection();
	
	public void cadastro(UsuarioDois usuario) {
		String sql = "INSERT INTO Cad_UsuarioPago(nome_usuario, senha, data_nascimento, data_ciencia, estado, cidade, salario, nivelInstrucao, empresa, num_cartao, nome_resp, dt_validade, cvc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
			preparador.setString(10, usuario.getNum_Cartao());
			preparador.setString(11, usuario.getNome_Resp());
			preparador.setString(12, usuario.getDt_Validade());
			preparador.setString(13, usuario.getCvc());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cadastrado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
		
	public UsuarioDois autenticacao(UsuarioDois usuario) {
		UsuarioDois usuRetorno = null;
		String sql = "SELECT * FROM Cad_UsuarioPago WHERE nome_usuario = ? AND senha = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome_usuario());
			preparador.setString(2,  usuario.getSenha());
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				usuRetorno = new UsuarioDois();
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
