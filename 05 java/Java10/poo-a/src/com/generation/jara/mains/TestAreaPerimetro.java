package com.generation.jara.mains;

import com.generation.jara.clases.AreaPerimetro;
import com.generation.jara.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.areaCuadrado(5));
		
		
		System.out.println("---> "+fg.getArea());
		
		fg.setPerimetro(ap.perimetro(5));
		System.out.println("perimetro del cuadrado "+fg.getPerimetro());
		
		
		fg.setArea(ap.AreaCirculo(15));
		System.out.println("area circulo"+fg.getArea());
		
		fg.setPerimetro(ap.perimetroCirculo(20));
		System.out.println("perimetro circulo" + fg.getPerimetro());
		

	}

}
