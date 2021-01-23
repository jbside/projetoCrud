package br.com.apex.aula02;

public class Exercicios6 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][10];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = j;
			}
		}

		// 2

		int[][] matriz2 = new int[5][10];

		for (int i = 0; i < matriz2.length; i++) {

			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = j * j;
			}
		}
	

		// 3

		int[][] matriz3 = new int[6][6];

		for (int i = 0; i < matriz3.length; i++) {

			for (int j = 0; j < matriz3[i].length; j++) {
				matriz3[i][j] = i;
			}
		}


		// 4
		

		int[][] matriz4 = new int[9][6];

		for (int i = 0; i < matriz4.length; i++) {
			for (int j = 0; j < matriz4[i].length; j++) {
				if((i % 2) == 0) {
					matriz4[i][j] = -1;
				} else {
					matriz4[i][j] = 0;
				}
		}
			
		}
		
		Exercicios6.imprimeMatriz(matriz);
		System.out.println("-------------------");
		Exercicios6.imprimeMatriz(matriz2);
		System.out.println("-------------------");
		Exercicios6.imprimeMatriz(matriz3);
		System.out.println("-------------------");
		Exercicios6.imprimeMatriz(matriz4);

	} // metodo
	
	public static void imprimeMatriz(int[][] matriz) {
		
		for (int l = 0; l < matriz.length; l++) {
			for (int j = 0; j < matriz[l].length; j++) {
				System.out.print(matriz[l][j] + " ");
			}
			System.out.println();
		}
	}

	}

