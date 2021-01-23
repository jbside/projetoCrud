package principal;

import java.sql.SQLException;

public class TestePessoa {
	
	public static void main(String[] args) throws SQLException {
		
		PessoaBean p1 = new PessoaBean();
		
		p1.setNomePessoa("Maria");
		p1.setEmailPessoa("mariadasdores@gmail.com");
		p1.setEnderecoPessoa("Blumenau");
	
		PessoaDAO dao = new PessoaDAO();
		dao.cadastrarPessoa(p1);
	}

}
