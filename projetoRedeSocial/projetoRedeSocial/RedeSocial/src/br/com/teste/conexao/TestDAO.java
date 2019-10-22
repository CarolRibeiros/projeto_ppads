package br.com.teste.conexao;

import br.com.projeto.bens.Usuario;
import br.com.projeto.redesocial.UsuarioDAO;

public class TestDAO {

	public static void main(String[] args) {
		
		testCadastro();
	}
	
	public static void testCadastro() {
		Usuario usu = new Usuario();
		usu.setNome_usuario("Fernando");
		usu.setSenha("123456");
		usu.setData_nascimento("04/04/1997");
		usu.setData_ciencia("06/07/2017");
		usu.setEstado("SP");
		usu.setCidade("Guaratinguetá");
		usu.setSalario("12000");
		usu.setNivelInstrucao("Superior completo");
		usu.setEmpresa("Microsoft");
		
		UsuarioDAO usuDao = new UsuarioDAO();
		usuDao.cadastro(usu);
		
	}

}
