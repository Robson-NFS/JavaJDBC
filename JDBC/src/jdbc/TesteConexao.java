package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException{
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "159753864a";
		
		Connection conexao =
				DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conex�o Efetuada Com Sucesso!");
		conexao.close();
		
	}

}
