package testers;

import oop.clases.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setNombre("juan");
		System.out.println(">>"+p.getNombre());
		
		
		Persona p0 = new Persona("pepe");
		System.out.println("==>"+p0.getNombre());
		
		Persona p1 = new Persona("tata",90,1.85, 85.3, "sagitario");
		
		System.out.println("--->"+p1.datosPersona());
		
	}

}
