package br.com.apex.aula01;

public class ClientePF extends Cliente {

	private String cpf;

	public ClientePF(String nome) {
		super(nome);

	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCPF() {
		return this.cpf;
	}

}
