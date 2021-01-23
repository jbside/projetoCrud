package principal;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class PessoaDAO {
	
	public void cadastrarPessoa(PessoaBean pessoa) throws SQLException {
		Conexao conexao = new Conexao();
		String sql = "insert into pessoas (nomePessoa,emailPessoa,enderecoPessoa) values (?,?,?)";
		PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
		pstmt.setString(1,pessoa.getNomePessoa());
		pstmt.setString(2,pessoa.getEmailPessoa());
		pstmt.setString(3,pessoa.getEnderecoPessoa());
		pstmt.execute();
		
	}
	
	public void selecionarPessoa(){
		
	}
	
	public void alterarPessoa(PessoaDAO pessoa) {
		
	}
	
	public void excluirPessoa(PessoaDAO pessoa) {
		
	}

}
