package br.com.projeto.redesocial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "nobrega", "Qwerty22");
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro! - Conexão! " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Erro! - Driver! " + e.getMessage());
		}
		return con;
	}

}
