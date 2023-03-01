package tiposDeDatos;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*	Verificar si un número es par y positivo:
			int num = 6;*/

		int num = 6;
		if (num % 2 == 0 && num > 0) { //comprueba si el 6 o cualquier par cumple
			System.out.println("si es par y es positivo");
		}else {
			System.out.println("no se cumple la condicion");
		}
		
		
		
		
		/*Verificar si un número está dentro de un rango específico
		int num = 10;*/
		int num2 = 11;
		if (num2 >= 10 && num2 < 20) { // rango del 10 - 20
			System.out.println("esta dentro del rango");
		}else {
			System.out.println("no esta dentro del rango");
		}
		
		

		/*Verificar si una cadena es igual a otra o no
		String cadena1 = "Hola";
		String cadena2 = "hola";
		*/
		
		String cadena1 = "Hola";
		String cadena2 = "hola";
		
		if (cadena1 == cadena2) {  
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
			}
	}

}
