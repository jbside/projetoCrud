package br.com.apex.aula05.exercicios;

import javax.swing.JOptionPane;

public class Empresa {
	
	private String nome;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	
	public Empresa() {
		
	}

	public Empresa(String nome, String cidade, String estado, String cep, String telefone) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void inserirDados() {
		this.nome = JOptionPane.showInputDialog("Digite o nome da empresa:");
		this.cidade = JOptionPane.showInputDialog("Digite a cidade da empresa:");
		this.estado = JOptionPane.showInputDialog("Digite o estado da empresa");
		this.cep = JOptionPane.showInputDialog("Digite o CEP da empresa");
		this.telefone = JOptionPane.showInputDialog("Digite o telefone da empresa");
	}
	
	public String exibirDados() {
		String dados = "";
		dados+= "\nNome: " + getNome();
		dados+= "\nCidade: " + getCidade();
		dados += "\nEstado: " + getEstado();
		dados += "\nCEP: " + getCep();
		dados += "\nTelefone: " + getTelefone();
		
		return dados;
	}

}
