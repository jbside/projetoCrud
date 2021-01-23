package br.com.apex.aula02;

public class Exercicios5 {

	public static void main(String[] args) {
		
		int[] a = {6,3,1,8};
		
		int[] b = Exercicios5.atribuirValores(a);
		
		for (int i = 0; i < b.length; i++) {
			if(b[i] >= 0) {
				System.out.println("+" + b[i]);
		} else {
			System.out.println(b[i]);
		}
	}

}	
	public static int[] atribuirValores(int[] numeros) {
		int[] b = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			if ((numeros[i] % 2) == 0) {
				b[i] = +1;
			} else {
				b[i] = -1;
			}
		}

		return b;
	}

}

