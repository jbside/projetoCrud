package br.com.apex.aula04.poo;

public class MainTeste {
	
	public void fazerAnimalComer(Animal animal) {
		animal.comer();
	}
	
	public static void main(String[] args) {
		
		MainTeste t = new MainTeste();
		
		Animal x = new Gato();
		
		Cachorro c = new Cachorro();
		
		Animal y = c;
		
		Animal v = new Gato();
		
		if (y instanceof Cachorro) {
			System.out.println("SIM");
		}
	}

}
