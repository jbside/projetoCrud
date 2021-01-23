package br.com.apex.aula02;

public class Exercicios4 {
	
	public static void main(String[] args) {
	
		int[] numeros = {500,-500,10,5,1000};
		
		System.out.println("O numero maior deste array se encontra na posição: " + Exercicios4.verificaPosicaoMaior(numeros));
	}
	
	public static int verificaPosicaoMaior (int[] numeros) {
		int posicaoMaior = 0;
		int numeroMaior = -0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > numeroMaior ) {
				numeroMaior = numeros[i];
				posicaoMaior = i;
			
			}
		}
		
		return posicaoMaior;
	}
	
	

}
