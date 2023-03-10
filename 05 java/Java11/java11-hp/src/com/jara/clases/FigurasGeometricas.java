package com.jara.clases;

public abstract class FigurasGeometricas {
	
	// contenido de metodos abstractos 
	//no imprimentado o definido 
	
	private String nombre;
	
	
	
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}



	public abstract double areas();
	public abstract void pedirDatos();



	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
	} 
	
	
	

}
