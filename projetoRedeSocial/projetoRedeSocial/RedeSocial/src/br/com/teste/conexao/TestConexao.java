package br.com.teste.conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.projeto.redesocial.Conexao;

public class TestConexao {

	public static void main(String[] args) throws Exception {
		
		Conexao conexao =  new Conexao();
		Connection con = conexao.getConnection();
		Statement statement = con.createStatement();
		String query = "SELECT * FROM Cad_Usuario";
		ResultSet resultSet = statement.executeQuery(query);
	
		
		
	}

}
