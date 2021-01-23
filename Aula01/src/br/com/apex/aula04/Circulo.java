package br.com.apex.aula04;

public class Circulo extends FiguraGeometrica implements IFiguraGeometrica{
	
	private final static double PI = 3.14;
	private double raio;

	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public String getNomeFigura() {
		return "Círculo" ;
	}

	@Override
	public int getArea() {
		double area = PI * (raio*raio);
		return (int)area;
	}

	@Override
	public int getPerimetro() {
		double perimetro = 2*PI*raio;
		return (int)perimetro;
	}

}
