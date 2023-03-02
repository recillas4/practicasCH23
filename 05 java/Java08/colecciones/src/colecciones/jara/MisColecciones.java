package colecciones.jara;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MisColecciones {

	public static void main(String[] args) {
		
		wrapperClass();
		
		
			
		
	}
	
	
	
	public void listasCollection() {
		List miLista = new ArrayList();//referencia, objeto
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		
		

	}
	
	
	private void imprimir() {
		 

	}
	
	
	 static void wrapperClass() {
		byte numeroB = 12;
		
		System.out.println("tamano de un byte " + Byte.SIZE);
		System.out.println("tamano de un byte " + Byte.MAX_VALUE);
		System.out.println("tamano de un byte " + Byte.MIN_VALUE);
		
		System.out.println("*******");
		short corto = 3;
		System.out.println("tamano de un short " + Short.SIZE);
		System.out.println("tamano de un short " + Short.MAX_VALUE);
		System.out.println("tamano de un short " + Short.MIN_VALUE);

		System.out.println("*******");

		long largo = 34444444;
		System.out.println("tamano de un long " + Long.SIZE);
		System.out.println("tamano de un long " + Long.MAX_VALUE);
		System.out.println("tamano de un long " + Long.MIN_VALUE);
		System.out.println("*******");
		float flotante = (float) 3.1416;
		System.out.println("tamano de un float " + Float.SIZE);
		System.out.println("tamano de un float " + Float.MAX_VALUE);
		System.out.println("tamano de un float " + Float.MIN_VALUE);
		
	}

}
