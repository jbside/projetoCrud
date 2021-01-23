package br.com.apex.aula02;

public class Exercicios2 {

	public static void main(String[] args) {

		int[] numeros = { 3, -8, 12, 10, -18 };

		int qtd = Exercicios2.retornaQtdNegativos(numeros);
		
		System.out.println(qtd);

	}

	public static int retornaQtdNegativos(int[] numeros) {
		int totalNegativos = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				totalNegativos++;
			}
		}
		return totalNegativos;
	}
}
