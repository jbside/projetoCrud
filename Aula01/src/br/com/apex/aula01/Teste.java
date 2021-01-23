package br.com.apex.aula01;

public class Teste {

	public static void main(String[] args) {

			Cliente c = new Cliente("Jorge");
			c.getNmroInscricao();
			
			ClientePJ pj = new  ClientePJ("Marcos");
			pj.getCnpj();
			
			ClientePF pf = new ClientePF("Ana");
			pf.getCpf();
	}

}
