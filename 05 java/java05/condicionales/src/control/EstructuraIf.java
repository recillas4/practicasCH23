package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);

	

	/*	public void divisible() {
			System.out.println("ingresa un numero: ");
			int dato1 = entrada.nextInt();
			System.out.println("ingresa otro numero: ");
			int dato2 = entrada.nextInt();
			
			if (dato1 % dato2 == 0) {
				System.out.println(dato1 + " El numero es divisible entre " + dato2);
			}else {
				System.out.println(dato1 + " El numero NO es divisible entre " + dato2);

			}
		}*/
		
		public void comparar() {
			System.out.println("ingresa un numero: ");
			int valor1 = entrada.nextInt();
			System.out.println("ingresa otro numero: ");
			int valor2 = entrada.nextInt();
			
			if (valor1 > valor2) {
				System.out.println(valor1 + " Es mayor que " + valor2);
				
			} else {
				System.out.println(valor1 + " Es menor que " + valor2);

			}

		}
		//
		public void anidado() {
			// TODO Auto-generated method stub
			System.out.println("ingresa un numero: ");
			int mayor = entrada.nextInt();
			
			if (mayor > 0) {
				System.out.println(mayor + " numero es positivo");
			} else if (mayor < 0) {
				System.out.println(mayor + " numero negativo");
			} else {
				System.out.println(mayor + " es igual a 0");
				
			}
			
		}
}
		/*
		 * //public void controlIf() {
		 long nota = 6;

		
		 * if (nota > 5 ) { System.out.println("aprobado!" + nota); }else
		 * {System.out.println("reprobado"); }
		 

		if (nota >= 5) {
			System.out.println("aprobado!" + nota);

		} else {
			System.out.println("aprobado!" + nota);

		}

	}
*/

