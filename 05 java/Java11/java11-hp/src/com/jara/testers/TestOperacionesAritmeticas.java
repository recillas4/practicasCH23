package com.jara.testers;

import com.jara.clases.Mensajes;
import com.jara.clases.OperacionesAritmeticas;
import com.jara.clases.Resta;
import com.jara.clases.Suma;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		
		
		Suma suma = new Suma(2, 3);
		OperacionesAritmeticas ss = new Suma(10,4);
		Mensajes sss = new Suma();
		
		System.out.println("suma "+suma.sumar());
		System.out.println("Operaciones Aritmeticas "+ss.sumar());
		
		Resta resta = new Resta(5,3);
		
		System.out.println("resta "+resta.restar());
		
		sss.mensaje();
		suma.mensaje();
	}

}
