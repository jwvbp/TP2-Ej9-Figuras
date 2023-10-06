package ar.edu.unlu.figuras;

public class Triangulo extends Figura2D{
private double base;
private double altura;

public Triangulo(double base, double altura) {
	super();
	this.base = base;
	this.altura = altura;
}

public double getArea() {
	return ((base * altura) / 2);
}
}
