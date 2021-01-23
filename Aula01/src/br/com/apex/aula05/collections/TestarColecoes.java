package br.com.apex.aula05.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestarColecoes {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Jesiel");
		nomes.add("Verônica");
		
		System.out.println(nomes.size());
		System.out.println(nomes.get(2));
		
		System.out.println("----------------");
		
		nomes.set(0, "Jotinha");
		nomes.remove(0);
		nomes.clear();
		
		if(nomes.isEmpty()) {
			System.out.println("A lista está vazia\n");
		}
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		
		HashMap<String,String> estados = new HashMap<String, String>();
		
		estados.put("SC", "Florianópolis");
		estados.put("PR", "Curitiba");
		estados.put("MG", "Belo Horizonte");
		estados.put("SC", "Floripa");
		
		System.out.println(estados);
		
		System.out.println(estados.get("SC"));
		
		estados.remove("PR");
		
		System.out.println(estados);
		
		
		Integer[] x = {18,22,31,27,17};
		Double[] z = {1.50,1.77,1.64,1.80};
		String[] y = {"Vanessa","Rubens","Larissa","Gabriel","Paloma"};
		
		exibir(x);
		exibir(z);
		exibir(y);
		
	} // main
	
	public static <E> void exibir(E[] vetores) {
		
		for (E elemento : vetores) {
			System.out.println(elemento);
		}
	}

}
