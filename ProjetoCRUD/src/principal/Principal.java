package principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.Conexao;

public class Principal {

	public static void main(String args[]) throws SQLException {

		Conexao conexao = new Conexao();

		// Statement
		String sql1 = "SELECT * FROM clientes";
		String sql2 = "select count(*) from clientes";
		String sql3 = "select count(idade) from clientes";
		String sql4 = "select avg(idade) from clientes";
		String sql11 = "truncate table clientes";
		String sql12 = "drop table clientes";

		//PrepareStatement
		String sql5 = "select * from clientes where nome = ?";
		String sql6 = "select * from clientes where nome = ? and idade >= ?";
		String sql7 = "select * from clientes where idade > ? and idade < ?";
		String sql8 = "insert into clientes (codigo,nome,sobrenome,idade) values (?,?,?,?)";
		String sql9 = "update clientes set nome = ? where codigo = ?";
		String sql10 = "delete from clientes where codigo = ?";
		
	//	PreparedStatement pstmt = conexao.conectar().prepareStatement(sql10);
		
	//	pstmt.setInt(1,5);
		
		
	//	pstmt.execute();
		
	//	System.out.println("Atualização realizada com Sucesso");
		
	//	 ResultSet rs = pstmt.executeQuery();
		
	//	while(rs.next()) {
	//		System.out.println(rs.getInt("codigo") + " - " + rs.getString("nome") + " "  + rs.getString("sobrenome"));
	//	}
		Statement stmt = conexao.conectar().createStatement();
		stmt.execute(sql12);

		// ResultSet rs = stmt.executeQuery(sql4);
		
			
		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) );
//		}
		
	
	 
	}
}
