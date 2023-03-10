package com.jara.clases;

import java.util.Scanner;

public class Cuenta {
	private float saldo;
	private int noCon = 0;
	private int noRe = 0;
	private float taza;
	private float com = 0;
	
	
	
	
	public float getSaldo() {
		return saldo;
	}




	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}




	public float getTaza() {
		return taza;
	}




	public void setTaza(float taza) {
		this.taza = taza;
	}




	public void consignar() {
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese cantidad a consignar");
		float dinero = input.nextFloat();
		input.close();
		setSaldo(dinero+getSaldo());
		this.noCon++;
	
		public void retirar() {
			Scanner input = new Scanner(System.in);
			System.out.println("ingrese cantidad a retirar");
			float dinero = input.nextFloat();
			input.close();
			setSaldo(getSaldo()-dinero);
			this.noRe++;
		

	}
		public void calcularInteres() {
			float tazaMensual = getTaza()/12;
			setSaldo((tazaMensual)*getSaldo());
		}

		}
	
	
	

}
