package manejoExcepciones;

import java.util.Scanner;

public class NoComprobadas {
	public static void main (String [] args) {
		
		Scanner dato = new Scanner(System.in);
		System.out.println("introduzca un valor");
		int divisor;
		
		
		try {
			
			divisor = Integer.parseInt(dato.next());
			int div = 10/divisor;
			System.out.println("--->"+div);
			
		}catch(ArithmeticException e) {
			System.out.println("capturando la excepcion"+e.getMessage());
			
		}catch(NumberFormatException nfe) {
			System.out.println("el dato es caracter "+nfe.getMessage());
			
		}finally {
			System.out.println("Este bloque es opcional y se va ejecutar con o sin la exception");
		}
		
		System.out.println("continuamos con el flujo de la app");
		
		
		
		
		
		
		
		
		
	}
	

}
