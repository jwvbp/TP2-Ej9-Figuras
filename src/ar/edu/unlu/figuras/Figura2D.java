package ar.edu.unlu.figuras;

public abstract class Figura2D extends FiguraGeometrica{

	public Figura2D() {
		super();
	}
	public abstract double getArea();
	
	public double getVolumen() {
		return 0.0;
	}
}
