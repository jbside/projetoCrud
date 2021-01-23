package br.com.apex.aula01;

import javax.swing.JOptionPane;

public class DesviosDeFluxo {

		public static void main(String[] args) {
			
			int idade = 15;
			
			String status = idade >= 18 ? "Maior de idade" : "Menor de idade";
			
			System.out.println(status);
			
			int opcao = 0;
			
			do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Sacar\n2 - Depositar\n3 - Saldo\n4 - Sair"));
			} while (opcao != 4);
		}
}
