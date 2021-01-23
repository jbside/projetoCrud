package br.com.apex.aula01;

public class Cliente extends Pessoa {
	
	private int nmroInscricao;
	
	public int getNmroInscricao() {
		return nmroInscricao;
	}

	public void setNmroInscricao(int nmroInscricao) {
		this.nmroInscricao = nmroInscricao;
	}

	public Cliente(String nome) {
		super(nome);
	}

}
