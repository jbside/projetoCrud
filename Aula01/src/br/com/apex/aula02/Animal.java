package br.com.apex.aula02;

public class Animal {
	
	private String nome;
	private float comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;
	
	
	
	
	
	public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public void dados() {
		System.out.println("Nome: "+getNome());
		System.out.println("Comprimento "+ getComprimento());
		System.out.println("Numero de patas " + getNumeroPatas());
		System.out.println("Cor: "+ getCor());
		System.out.println("Ambiente: " + getAmbiente());
		System.out.println("Velocidade media " + getVelocidadeMedia());
	}
	
	
	

}
