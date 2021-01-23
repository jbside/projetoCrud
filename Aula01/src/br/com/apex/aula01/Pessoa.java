package br.com.apex.aula01;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String cpf;
	private double peso;
	private double altura;
	private double tamanhoPe;
	private int idade;
	
	public void setNome(String nome) {
		nome = nome.trim();
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getTamanhoPe() {
		return tamanhoPe;
	}

	public void setTamanhoPe(double tamanhoPe) {
		this.tamanhoPe = tamanhoPe;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa() {

	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;

	}
	

	public void andar() {
		System.out.println("Estou andando");
	}

	public void dormir() {
		System.out.println("Estou dormindo");
	}

}
