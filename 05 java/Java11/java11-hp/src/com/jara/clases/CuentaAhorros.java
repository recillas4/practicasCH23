package com.jara.clases;

public class CuentaAhorros extends Cuenta{
	
	private boolean activa;
	 
	public CuentaAhorros(float saldo, float taza) {
		if(saldo,taza) {
			this.activa = false;
			
		}else {
			this.activa = true;
		}
		
	}

	@Override
	public void consignar() {
		// TODO Auto-generated method stub
		super.consignar();
		
	}
}
