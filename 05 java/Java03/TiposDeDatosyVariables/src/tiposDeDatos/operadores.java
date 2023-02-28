package tiposDeDatos;

public class operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// operadpres AND	
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");//SIEMPRE VERDADERO
		} else {
		    System.out.println("No puede conducir un coche");
		}
		//OPERADOR OR
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) { //1 DE LAS 2 SE CUMPLEN
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
	}

}
