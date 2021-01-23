package br.com.apex.aula04;

import javax.swing.JOptionPane;

public class FabricaCarro {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("INFORME O NOME DO CARRO:");
		String marca = JOptionPane.showInputDialog("INFORME A MARCA DO CARRO:");
		String categoria = JOptionPane.showInputDialog("INFORME A CATEGORIA DO CARRO:");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("INFORME O ANO DO CARRO:"));
		String cor = JOptionPane.showInputDialog("INFORME A COR DO CARRO:");
		int qtdPortas = Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DE PORTAS DO CARRO:"));
		int temOpcionais = JOptionPane.showConfirmDialog(null, "O CARRO TEM OPCIONAIS?","OPCIONAIS",JOptionPane.YES_NO_OPTION);
		boolean opcionais = false;
		if(temOpcionais == JOptionPane.YES_OPTION) {
			opcionais = true;
		}
		String tipoCombustivel = JOptionPane.showInputDialog("INFORME O TIPO DE COMBUSTIVEL:");
	
		Carro c1 = new Carro();
		c1.setNome(nome);
		c1.setMarca(marca);
		c1.setCategoria(categoria);
		c1.setAno(ano);
		c1.setCor(cor);
		c1.setQtdPortas(qtdPortas);
		c1.setOpcionais(opcionais);
		c1.setTipoCombustivel(tipoCombustivel);
		
		Motor m1 = new Motor();
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("INFORME A POTENCIA DO MOTOR:"));
		int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("INFORME A CILINDRADA DO MOTOR:"));
		int qtdValvulas = Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DE VALVULAS DO MOTOR:"));
		m1.setPotencia(potencia);
		m1.setCilindrada(cilindrada);
		m1.setQtdValvulas(qtdValvulas);
		c1.setMotor(m1);
		
		Pneu p1 = new Pneu();
	
		int largura = Integer.parseInt(JOptionPane.showInputDialog("INFORME A LARGURA DO PNEU:"));
		int altura = Integer.parseInt(JOptionPane.showInputDialog("INFORME A ALTURA DO PNEU:"));
		int aro = Integer.parseInt(JOptionPane.showInputDialog("INFORME O ARO DO PNEU:"));
		String tipo = JOptionPane.showInputDialog("INFORME O TIPO DO PNEU:");
		String marcaPneu = JOptionPane.showInputDialog("INFORME A MARCA DO PNEU:");
		p1.setAltura(altura);
		p1.setLargura(largura);
		p1.setAro(aro);
		p1.setMarca(marcaPneu);
		p1.setTipo(tipo);
		
		c1.setPneu(p1);
		
		//Relatorio
		System.out.println("Ficha técnica do carro " + nome);
		System.out.println("NOME: " + c1.getNome());
		System.out.println("MARCA: " + c1.getMarca());
		System.out.println("CATEGORIA: " + c1.getCategoria());
		System.out.println("ANO: " + c1.getAno());
		System.out.println("CATEGORIA: " + c1.getCor());
		System.out.println("QUANTIDADE DE PORTAS: " + c1.getQtdPortas());
		System.out.println("COMBUSTÍVEL: " + c1.getTipoCombustivel());
		System.out.println("OPCIONAIS: " + c1.isOpcionais());
		System.out.println("POTÊNCIA: " + c1.getMotor().getPotencia() + "cv");
		System.out.println("CILINDRADAS: " + c1.getMotor().getCilindrada());
		System.out.println("QUANTIDADE VALVULAS: " + c1.getMotor().getQtdValvulas() + "v");
		System.out.println("ALTURA PNEU: " + c1.getPneu().getAltura() + "mm");
		System.out.println("LARGURA PNEU: " + c1.getPneu().getLargura() + "mm");
		System.out.println("ALTURA PNEU: " + c1.getPneu().getAro() + "\"");
		System.out.println("MARCA PNEU: " + c1.getPneu().getMarca());
		System.out.println("TIPO PNEU: " + c1.getPneu().getTipo());
	} // Main

}
