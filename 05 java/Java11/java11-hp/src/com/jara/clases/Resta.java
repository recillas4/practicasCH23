package com.jara.clases;

public class Resta implements OperacionesAritmeticas {
	
	private double num1;
	private double num2;
	
	
	
	
	
	

	public Resta() {
		super();
	}

	public Resta(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}
