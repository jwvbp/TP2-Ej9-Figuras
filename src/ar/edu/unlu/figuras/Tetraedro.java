package ar.edu.unlu.figuras;

public class Tetraedro extends Figura3D{
private double arista;

public Tetraedro(double arista) {
	super();
	this.arista = arista;
}

public double getArea() {
	return (Math.pow(arista,2) * Math.sqrt(3));
}

public double getVolumen() {
	return (Math.pow(arista,3) * (Math.sqrt(2) / 12));
}
}
