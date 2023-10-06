package ar.edu.unlu.figuras;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero miTablero = new Tablero();
		Circulo circulo = new Circulo(20);
		miTablero.agregarFigura(circulo);
		Circulo circulo2 = new Circulo(15);
		miTablero.agregarFigura(circulo2);
		Rectangulo rectangulo = new Rectangulo(15, 20);
		miTablero.agregarFigura(rectangulo);
		Cuadrado cuadrado = new Cuadrado(12);
		miTablero.agregarFigura(cuadrado);
		Triangulo triangulo = new Triangulo(6, 8);
		miTablero.agregarFigura(triangulo);
		Esfera esfera = new Esfera(11);
		miTablero.agregarFigura(esfera);
		Paralelepipedo paralel = new Paralelepipedo(2, 4, 6);
		miTablero.agregarFigura(paralel);
		Cubo cubo = new Cubo(17);
		miTablero.agregarFigura(cubo);
Tetraedro tetra = new Tetraedro(21);
miTablero.agregarFigura(tetra);
	
	
	miTablero.calcularArea();
	miTablero.calcularVolumen();
	
	}

}
