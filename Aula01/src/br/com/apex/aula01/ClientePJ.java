package br.com.apex.aula01;

public class ClientePJ extends Cliente{
	
	private String cnpj;

	public ClientePJ(String nome) {
		super(nome);
		
		
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}
