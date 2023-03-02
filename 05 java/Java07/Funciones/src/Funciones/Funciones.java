package Funciones;

public class Funciones {
	
	
//	//Las funciones se puden declarar en cualquier lugar de la clase
//    public static int sumar (int num1, int num2) {
//        int resultado = num1 + num2;
//        return resultado;
//    }//cierre suma
//    
//    
//    public static int resta (int num1, int num2) {
//        int resultado = num1 - num2;
//        return resultado;
//    }//cierre resta
//    
//    
//    public static int multiplicacion (int num1, int num2) {
//        int resultado = num1 * num2;
//        return resultado;
//    }// cierre multi
//    
//    public static int dividir (int num1, int num2) {
//        int resultado = num1 / num2;
//        return resultado;
//    }// cierre dividir
//    
//    public static void imprimirAsteriscos() {
//    	System.out.println("*************");
//		}// cierre imprimir
	
	
	
	
	
//	Levantamiento de requerimientos
//
//	- Torre es recta (90grados)
//	- Usen funciones de la librera Math
//	- Tiempo es de 20 minutos
//	- Impresiones en consola de todos los datos
//	    / tu base es de
//	    / tu altura
//	- Datos del tipo double o float
	
	public static float torre (float distancia, float angulo) {
     float resultado =  (float) Math.tan(distancia * angulo);
      return resultado;
      
      
      }//cierre resta
	
	

	public static void main(String[] args) {
		
		
		System.out.println("la altura de la torre es " + torre(100,30));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("la suma es " + sumar(5,5));
//		
//		imprimirAsteriscos();
//		
//		double valorEjemplo = 7.65497;
//		
//		System.out.println("La raiz cuadrada de mi valores :" +  Math.sqrt(valorEjemplo));
//		
//		System.out.println("El seno de mi valor es " + Math.pow(valorEjemplo));
//		System.out.println("El seno de mi valor es " + Math.sin(valorEjemplo));




	}

}







/*
 *  - no retornan valores, no devuelve nada. no specifica nada
 *  no usamos return
 *  
 *  
 *  - si retornan valores: se especifica el tipo de dasto
 *  valor, return
 * 
 * 
 * metodo = lo k se puede hacer
 * 
 * funciones no
 * 
 
 */
