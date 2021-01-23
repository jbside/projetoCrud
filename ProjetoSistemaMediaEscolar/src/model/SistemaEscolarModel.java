package model;

public class SistemaEscolarModel {

	private double media;

	public void somar(double nota1, double nota2, double nota3, double nota4) {
		media = (nota1 + nota2 + nota3 + nota4) / 4;

	}

	public double retornaMedia() {
		return media;
	}

}
