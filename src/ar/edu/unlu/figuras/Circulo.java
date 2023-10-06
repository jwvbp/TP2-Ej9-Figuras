package ar.edu.unlu.figuras;

public class Circulo extends Figura2D{
private double radio;

public Circulo(double radio) {
	super();
	this.radio = radio;
}
public double getArea() {
	return 	Math.PI * Math.pow(radio,2);
}

}
