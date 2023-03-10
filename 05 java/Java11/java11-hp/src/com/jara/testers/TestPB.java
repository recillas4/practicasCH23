package com.jara.testers;

import com.jara.clases.AlumnoB;
import com.jara.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		AlumnoB a = new AlumnoB(123,8.5,"Jorge",28);
		
		PersonaP b = new PersonaP("Maria", 18);//clase padre
		
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		
		System.out.println(b.toString());
		
		a.mostrarDatos();
		a.mostrarDatos("Lara");
		
		

	}

}
