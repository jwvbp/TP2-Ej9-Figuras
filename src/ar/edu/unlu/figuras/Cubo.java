package ar.edu.unlu.figuras;

public class Cubo extends Figura3D{
private double arista;

public Cubo(double arista) {
	super();
	this.arista = arista;
}

public double getArea() {
	return ( 6 * (Math.pow(arista,3)));
}
public double getVolumen() {
	return (Math.pow(arista,3));
}
}
