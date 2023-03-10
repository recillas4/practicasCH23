package com.jara.clases;

public class Cuadrado extends FigurasGeometricas {
	
	private int lado;

	public Cuadrado(int lado) {
		super("cuadrado");
		this.lado = lado;
	}
	
	
	public double areas() {
		// TODO Auto-generated method stub
		return (Math.pow(lado, 2));
	}


	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	

}
