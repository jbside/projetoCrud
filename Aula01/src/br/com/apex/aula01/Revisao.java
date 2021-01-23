package br.com.apex.aula01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Revisao {
	
	public static void main(String[] args) {
		
// 		int total = Revisao.soma(2,21);
		
// 		System.out.println(total);
		
//		System.out.println(Revisao.calculaImposto(100, 15));

/* 		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Informe seu peso");
		double peso = teclado.nextDouble();
		
		System.out.println("Informe sua altura");
		double altura = teclado.nextDouble();
		
*/
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		double imc = Revisao.calculaImc(peso,altura);
		
		if (imc < 18) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso\n" + "Seu imc: " + imc);
		} else if(imc >= 18 && imc <= 23) {
			JOptionPane.showMessageDialog(null, "Peso normal\n" + "Seu imc: " + imc);
		} else {
			JOptionPane.showMessageDialog(null, "Acima do peso\n" + "Seu imc: " + imc);
		}
		
//		teclado.close();
	}
	
	public static int soma(int numero1, int numero2) {
		int total = numero1 + numero2;
		
		return total;
	}
	
	public static double calculaImposto(double valor, double percentual) {
		
		double totalImposto = valor - (valor * percentual / 100);
		
		return totalImposto;
	}
	
	public static double calculaImc(double peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	}
	
}	
