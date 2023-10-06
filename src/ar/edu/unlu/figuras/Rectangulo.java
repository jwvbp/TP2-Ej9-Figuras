package ar.edu.unlu.figuras;

public class Rectangulo extends Figura2D{
private double base;
private double altura;

public Rectangulo(double base, double altura) {
	super();
	this.base = base;
	this.altura = altura;
}
public double getArea() {
	return (base * altura);
}
}
