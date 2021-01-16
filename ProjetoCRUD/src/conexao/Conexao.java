package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static void main(String args[]) {
		
		Conexao c = new Conexao();
		
		c.conectar();
	}

	@SuppressWarnings("unused")
	public Connection conectar() {

		Connection retornoConexao = null;

		try {
			String url = "jdbc:mysql://localhost:3306/crud";
			String usuario = "root";
			String senha = "apex";

			retornoConexao = DriverManager.getConnection(url, usuario, senha);
			
			System.out.println("Conectado com sucesso!");
			
		} catch (Exception erro) {
			
			System.out.println("\n Falha ao conectar com o banco \n" + erro.getMessage() + "\n");
			erro.printStackTrace();
		}

		return retornoConexao;
		
		

	}

}
