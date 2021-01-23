package br.com.apex.aula04;

public class FiguraGeometrica {

	public String getDadosFigura(IFiguraGeometrica figura) {
		String relatorio = "";
		
		relatorio += "Nome: " + figura.getNomeFigura();
		relatorio += "\nÁrea: " + figura.getArea();
		relatorio += "\nPerímetro: " + figura.getPerimetro(); 
		return relatorio; 
	}
	
}
