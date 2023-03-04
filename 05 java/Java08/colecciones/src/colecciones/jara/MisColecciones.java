package colecciones.jara;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MisColecciones {

	public static void main(String[] args) {
		
		MisColecciones c = new MisColecciones();
		//c.listasCollection();
		//imprimir(c.setCollections());
		
		mapColletion();
		
		
		
		
	}
	
	
	
	
	public static void mapColletion() {
		Map miMap = new HashMap();//2 conjuntos para implementar, 1ro key, 2do value, key es un set, no es una colleccion, set es un conjunto, map 2, clave valor
		
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Carla");
		
		imprimir(miMap.values());
		
		
		


	}
	
	
	Set setCollections() {
		Set miset = new HashSet();
		miset.add("Uno");
		miset.add("Dos");
		miset.add("Tres");
		miset.add("Cuatro");
		
		
		System.out.println(miset.contains("Uno")); 
		
		System.out.println("la lista tiene " + miset.size() + " elementos");
		return miset;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List listasCollection() {
		List miLista = new ArrayList();//referencia, objeto una interfaz no se puede instanciaer clase abstract
		System.out.println(miLista + "Tamano de la lista  antes " + miLista.size());
		System.out.println("Esta vacia " + miLista.isEmpty());
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		
		miLista.set(0, miLista)
		System.out.println(miLista + "Tamano de la lista despues " + miLista.size());
		System.out.println("Esta vacia " + miLista.isEmpty());

		return miLista;
		
		

	}
	
	
	public static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
		}
		 

	}
	
	
//	 static void wrapperClass() {
//		byte numeroB = 12;
//		
//		System.out.println("tamano de un byte " + Byte.SIZE);
//		System.out.println("tamano de un byte " + Byte.MAX_VALUE);
//		System.out.println("tamano de un byte " + Byte.MIN_VALUE);
//		
//		System.out.println("*******");
//		short corto = 3;
//		System.out.println("tamano de un short " + Short.SIZE);
//		System.out.println("tamano de un short " + Short.MAX_VALUE);
//		System.out.println("tamano de un short " + Short.MIN_VALUE);
//
//		System.out.println("*******");
//
//		long largo = 34444444;
//		System.out.println("tamano de un long " + Long.SIZE);
//		System.out.println("tamano de un long " + Long.MAX_VALUE);
//		System.out.println("tamano de un long " + Long.MIN_VALUE);
//		System.out.println("*******");
//		float flotante = (float) 3.1416;
//		System.out.println("tamano de un float " + Float.SIZE);
//		System.out.println("tamano de un float " + Float.MAX_VALUE);
//		System.out.println("tamano de un float " + Float.MIN_VALUE);
//		
//	}

}
