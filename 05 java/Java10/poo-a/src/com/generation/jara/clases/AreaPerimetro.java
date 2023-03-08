package com.generation.jara.clases;

public class AreaPerimetro {
	
	public double areaCuadrado(double lado) {
		double area = lado *lado;
		return area;
		
	}
	
	public double perimetro(double lado ){
		double perimetro = lado*4;
		
		return perimetro;
		

		
	}
	public double areaTriangulo(int base, int altura) {
		return (base * altura)/2;
		

	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {

		
		return (ladoA + ladoB + ladoC);
		
		
	}
	
	
	public double AreaCirculo(double radio) {
		return (3.1416 * (radio*2));

	}
	
	public double perimetroCirculo(double radio) {
		
		return (2 * (3.1416 * radio));
		

	}

}
