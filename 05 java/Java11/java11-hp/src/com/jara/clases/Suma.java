package com.jara.clases;

public class Suma implements OperacionesAritmeticas, Mensajes {
	
	private double num1;
	private double num2;
	

	public Suma() {
	}

	public Suma(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return this.num1+this.num2;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		
		System.out.println("hola soy nua suma ");
		
	}
	
	

}
