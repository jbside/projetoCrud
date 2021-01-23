package br.com.apex.aula04;

public class Quadrado extends FiguraGeometrica implements IFiguraGeometrica {
	
	private int lado;
	

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String getNomeFigura() {
	
		return "Quadrado";
	}

	@Override
	public int getArea() {
		int area = 0;
		area  = lado * lado;
		return area;
	}

	@Override
	public int getPerimetro() {
		int perimetro = 0;
		perimetro = lado * 4;
		return perimetro;
	}

}
