package br.com.apex.aula02;

public class Exercicios3 {

	public static void main(String[] args) {

		int[] a = { 7, -1, 4, 0,5,-6,10,-18 };

		boolean[] b = Exercicios3.atribuirValores(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static boolean[] atribuirValores(int[] numeros) {
		boolean[] b = new boolean[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= 0) {
				b[i] = false;
			} else {
				b[i] = true;
			}
		}

		return b;
	}
}
