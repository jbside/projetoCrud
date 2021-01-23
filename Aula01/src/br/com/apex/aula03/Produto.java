package br.com.apex.aula03;

public class Produto {

	private long codigo;
	private String descricao;
	private String marca;
	private double peso;
	private float valor;

	public Produto() {
	}

	public Produto(long codigo, String descricao, String marca, double peso, float valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
		this.peso = peso;
		this.valor = valor;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public void exibirProduto() {
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Marca: " + getMarca());
		System.out.println("Valor: " + getValor());
		System.out.println("Pedo: " + getPeso());
	}
}
