package br.com.apex.aula03;

import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {

		Produto[] produto = new Produto[5];
		Scanner entrada = new Scanner(System.in);

		Produto p1 = new Produto();
		p1.setCodigo(001);
		p1.setDescricao("Calçado");
		p1.setMarca("Rafaello");
		p1.setPeso(3.500);
		p1.setValor(49.90f);

		produto[0] = p1;
		
		Produto p2 = new Produto();
		p2.setCodigo(002);
		p2.setDescricao("Calça");
		p2.setMarca("Dudalina");
		p2.setPeso(5.00);
		p2.setValor(249.90f);
		
		produto[1] = p2;
		
		Produto p3 = new Produto();
		
		p3.setCodigo(003);
		p3.setDescricao("Camisa");
		p3.setMarca("Hering");
		p3.setPeso(1.0);
		p3.setValor(39.90f);

		produto[2] = p3;
		

		long codEscolhido = 0;

		while (codEscolhido >= 0) {

			System.out.println("Digite o codigo do produto ou um numero negativo para sair:");
			codEscolhido = entrada.nextLong();

			for (int i = 0; i < produto.length; i++) {
				if (codEscolhido == produto[i].getCodigo()) {
					produto[i].exibirProduto();
					break;
				} 

			} // for

		} // whilw
		
		entrada.close();

	} // metodo

} // main
