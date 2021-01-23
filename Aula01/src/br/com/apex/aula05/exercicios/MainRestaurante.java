package br.com.apex.aula05.exercicios;

import javax.swing.JOptionPane;

public class MainRestaurante {
	
	public static void main(String[] args) {
		
		Empresa restaurante = new Restaurante();
		
		restaurante.inserirDados();
		JOptionPane.showMessageDialog(null,restaurante.exibirDados());
	}

}
