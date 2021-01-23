package br.com.apex.aula03;

import java.util.Scanner;

public class ExercicioVogais {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int qtdVogais = 0;
		
		System.out.println("Digite uma palavra ou uma frase: ");
		String[] palavra = entrada.nextLine().split("");
		
		for (int i = 0; i < palavra.length; i++) {
			
			if (palavra[i].equalsIgnoreCase("a") ||
							palavra[i].equalsIgnoreCase("e")||
							palavra[i].equalsIgnoreCase("i") ||
							palavra[i].equalsIgnoreCase("o") ||
							palavra[i].equalsIgnoreCase("u")){
		qtdVogais++;
	}
}
		
		System.out.println(qtdVogais);

	}
}
