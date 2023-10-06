package ar.edu.unlu.figuras;

public class Cuadrado extends Figura2D{
private double lado;

public Cuadrado(double lado) {
	super();
	this.lado = lado;
}
public double getArea() {
	return (lado * lado);
}
}
