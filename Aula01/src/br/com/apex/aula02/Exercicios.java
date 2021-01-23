package br.com.apex.aula02;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		double[] numeros = new double[10];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Informe o numero " + (i + 1) + "ª numero:");
			numeros[i] = s.nextDouble();

		}
		s.close();

		System.out.println("................");
		System.out.println(" ");
		imprimeVetor(numeros);

	}

	public static void imprimeVetor(double[] vetor) {
		System.out.println("Conteúdo do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
