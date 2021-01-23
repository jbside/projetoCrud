package br.com.apex.aula01;

public class TrabalhandoStrings {
	
	public static void main(String[] args) {
		
		String frase = "Java no sabado!";
		
		System.out.println(frase.charAt(14));
		
		System.out.println(frase.length());
		
		System.out.println(frase.indexOf('a'));
		
		System.out.println(frase.concat(" à tarde!"));
		
		System.out.println(frase.replace('a','e'));
		
		System.out.println(frase.replaceAll("Java","C#"));
		
		System.out.println(frase.startsWith("Java"));
		
		System.out.println(frase.endsWith("bado!"));
		
		System.out.println(frase.contains("no"));
		
		System.out.println(frase.equalsIgnoreCase("JAVA NO SABADO!"));
		
		System.out.println(frase.substring(3));
		
		System.out.println(frase.substring(6,11));
		
		String nome = "   Jesiel";
		
		System.out.println(nome.trim());
		
		String dados = "Jesiel;Borges;45;Blumenau;SC";
		
		String[] info = dados.split(";");
		
		System.out.println(info[0]);
		System.out.println(info[1]);
		System.out.println(info[2]);
		System.out.println(info[3]);
		System.out.println(info[4]);
		
		System.out.println(frase.toUpperCase());
		System.out.println(frase.toLowerCase());
		
		
	}

}
