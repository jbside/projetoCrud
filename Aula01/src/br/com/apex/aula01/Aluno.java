package br.com.apex.aula01;

public class Aluno extends Pessoa{
	
	private double[] notas;
	private int nmroMatricula;
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public void SetNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNmroMatricula(int nmroMatricula) {
		this.nmroMatricula = nmroMatricula;
	}
	
	public int getNmroMatricula() {
		return this.nmroMatricula;
	}

}
