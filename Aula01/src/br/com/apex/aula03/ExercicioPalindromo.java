package br.com.apex.aula03;

import java.util.Scanner;

public class ExercicioPalindromo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite uma palavra ou uma frase qualquer:");
		String palavraoriginal = entrada.nextLine();
		String palavra[] = palavraoriginal.split("");
		String[] comparador = new String[palavra.length];
		
		
		for (int i = 0; i < comparador.length; i++) {
			
			
			comparador[i] = palavra[i];
			
		}
		
		String novafrase= "";
		
		for (int i = (comparador.length -1); i >= 0; i--) {
			novafrase = novafrase + comparador[i];
		}
		
		if(novafrase.replaceAll(" ","").equalsIgnoreCase(palavraoriginal.replaceAll(" ", ""))) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Nao é palindromo");
		}
		
		entrada.close();
	} //metodo
} // classe
