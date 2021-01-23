package br.com.apex.aula01;

import javax.swing.JOptionPane;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[] idades = new int[3];
		
		
		for (int i = 0; i < idades.length; i++) {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade " + (i+1) + "ª"));
			idades[i] = idade; 
		}
		
		String[] nomes = {"Maria","Pedro","Thiago","João","Barquinho"};
		
		System.out.println(idades.length);
		System.out.println(nomes.length);
		
		System.out.println("--------");
		
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		System.out.println("--------");
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
	
	

}
