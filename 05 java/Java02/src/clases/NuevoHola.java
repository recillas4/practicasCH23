package clases;

import java.util.Scanner;

public class NuevoHola {
	Scanner sn = new Scanner (System.in);
	
	private String nombre;
	// para inicializar variable (obj string) usamos el constructor

	public NuevoHola(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void saludo() {
		System.out.println("hola desde java con sts de nuevo " +this.nombre);
	}
	
	public void saludoConNombre () {
		System.out.println("cual es tu nombre");
		
	}
	

}
