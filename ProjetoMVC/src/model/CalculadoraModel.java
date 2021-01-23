package model;

public class CalculadoraModel {
	
	private int resultado;
	
	public void somar(int nmro1, int nmro2) {
		resultado = nmro1 + nmro2;
	}
	
	public int retornaResultado() {
		return resultado;
	}

}
