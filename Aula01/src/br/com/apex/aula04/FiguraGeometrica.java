package br.com.apex.aula04;

public class FiguraGeometrica {

	public String getDadosFigura(IFiguraGeometrica figura) {
		String relatorio = "";
		
		relatorio += "Nome: " + figura.getNomeFigura();
		relatorio += "\n�rea: " + figura.getArea();
		relatorio += "\nPer�metro: " + figura.getPerimetro(); 
		return relatorio; 
	}
	
}
