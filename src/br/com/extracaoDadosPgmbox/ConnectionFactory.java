package br.com.extracaoDadosPgmbox;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
	public static java.sql.Connection getConnection( String base, String login, String password){
		
		Connection connection = null;
		
				try{
			
					Class.forName("org.postgresql.Driver");
					String url = "jdbc:postgresql://localhost:5432/"+ base;
					String usuario = login;
					String senha = password;
					
					/*
					String usuario = "postgres";
					String senha = "t5p3y7t7";
					*/
			
					connection = DriverManager.getConnection(url,usuario,senha);
					return connection;
					
				}catch (ClassNotFoundException e) {
					
					System.out.println("O Driver Expecificado não foi encontrado.");
					return null;
					
				}catch (SQLException e) {
					
					System.out.println("Não foi possivel conectar ao banco de dados.");
					return null;
		}

	}
}