package br.com.apex.aula05.exercicios;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {
	
	private String tipoComida;
	private double precoMedioPrato;
	
	public Restaurante() {
		
	}

	public Restaurante(String tipoComida, double precoMedioPrato) {
		super();
		this.tipoComida = tipoComida;
		this.precoMedioPrato = precoMedioPrato;
	}
	
	public void inserirDados() {
		super.inserirDados();
		this.tipoComida = JOptionPane.showInputDialog("Insira o tipo de comida:");
		this.precoMedioPrato = Double.parseDouble(JOptionPane.showInputDialog("Insira o tipo medio do prato:"));
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public double getPrecoMedioPrato() {
		return precoMedioPrato;
	}

	public void setPrecoMedioPrato(double precoMedioPrato) {
		this.precoMedioPrato = precoMedioPrato;
	}
	
	public String exibirDados() {
		String dados = "";
		dados += super.exibirDados();
		dados += "\nTipo comida: " + getTipoComida();
		dados +="\nPreco medio do prato: " + getPrecoMedioPrato();
		return dados;
	}

}
