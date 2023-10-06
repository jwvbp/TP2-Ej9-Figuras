package ar.edu.unlu.figuras;

public class Esfera extends Figura3D{
private double radio;

public Esfera(double radio) {
	super();
	this.radio = radio;
}
public double getArea() {
	return 	(4 * Math.PI * Math.pow(radio,2));
}
public double getVolumen() {
	return 	(4/3 * Math.PI * Math.pow(radio,3));
}
}
