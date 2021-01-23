package br.com.apex.aula04;

import javax.swing.JOptionPane;

public class FabricaFigurasGeometricas {

	public static void main(String[] args) {
	
		int figura = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma figura: \n1 - Quadrado \n2  - Triângulo \n3  - Circulo"));
		
		switch (figura) {
		case 1:
			Quadrado quadrado = new Quadrado();
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado:"));
			quadrado.setLado(lado);
			JOptionPane.showMessageDialog(null,quadrado.getDadosFigura(quadrado));
			break;
			
			
		case 2:
			
			Triangulo triangulo = new Triangulo();
			int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado A do triangulo:"));
			int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado B do triangulo:"));
			int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do triangulo:"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do triangulo:"));
			
			triangulo.setAltura(ladoA);
			triangulo.setLadoB(ladoB);
			triangulo.setAltura(altura);
			triangulo.setBase(base);
			JOptionPane.showMessageDialog(null,triangulo.getDadosFigura(triangulo));
			break;
			
		case 3:
			Circulo circulo = new Circulo();
			double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo:"));
			
			circulo.setRaio(raio);
			JOptionPane.showMessageDialog(null,circulo.getDadosFigura(circulo));
			break;
		}
		
		
		
		
	}

}
