package br.com.extracaoDadosPgmbox;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Princial {
	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
				
		new ConnectionFactory();
		Connection con = ConnectionFactory.getConnection("postgres","postgres" , "t5p3y7t7");
		String consulta = "select * from pg_am";
		PreparedStatement stmt = con.prepareStatement(consulta);
		
		ResultSet rs = stmt.executeQuery();
		

		while (rs.next()){
			
			String nome = rs.getString("amname");
			String handler = rs.getString("amhandler");
			String type = rs.getString("amtype");
			
			int a = rs.getRow();
			if (a == 1) {
				System.out.println("|-------------------------------------------------------|");
			}
			
			System.out.println("|	" + nome +"	|	"+ handler +"	|	"+ type + "	|");
			System.out.println("|-------------------------------------------------------|");
			
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
}
