package ar.edu.unlu.figuras;

import java.util.ArrayList;

public class Tablero {
	private ArrayList<FiguraGeometrica> misFiguras = new ArrayList<FiguraGeometrica>();

	public void agregarFigura(FiguraGeometrica figura) {
		misFiguras.add(figura);
	}

	public void calcularArea() {
		System.out.println("-----area------");
		for (int i = 0; i < misFiguras.size(); i++) {
			System.out.println(misFiguras.get(i).getArea());
		}
	}
	
	
	  public void calcularVolumen() {
		  System.out.println("-----volumen------");
		for (int i = 0; i < misFiguras.size(); i++) {
			System.out.println(misFiguras.get(i).getVolumen());
		}
	}
	
}
