package br.com.apex.aula01;

public class Matrizes {
	
	public static void main(String[] args) {
		
		int[][] numeros = new int[3][3];
		
		for(int linha = 0; linha < numeros.length; linha++) {
			for(int coluna = 0; coluna < numeros[linha].length; coluna++) {
				numeros[linha][coluna] = linha * coluna;
			}
		}
		
		for(int linha = 0; linha < numeros.length; linha++) {
			for(int coluna = 0; coluna < numeros[linha].length; coluna++) {
				System.out.print(numeros[linha][coluna]+" ");
			}
			System.out.println();
		}
	}

}
