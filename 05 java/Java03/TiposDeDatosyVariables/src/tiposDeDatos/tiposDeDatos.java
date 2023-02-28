package tiposDeDatos;
public class tiposDeDatos {

    public static void main(String[] args) {
    

        /* byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es " + fahrenheit);

        System.out.println("1 centigrado a kelvin es " + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
    	
    	/*
        byte horasTrabajadas = 8;
        byte pago = 10;
        int multiplicacionb = horasTrabajadas * pago;
        System.out.println(multiplicacionb);
        
        
        double num = 1.61;
        int numInt = (int)num;// cambiamos a entero
        long numLong = (long)num;
        
        System.out.println(num);
        System.out.println(numInt);
        System.out.println(numLong);
        
        /*
      //string

        String cantidad = "15";
        String precio = "115.20";


        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);


        System.out.println("El valor total de la compra es:" + (cantEntero * precioDouble));

        

        int edad = 30;
        double estatura = 1.61;
         

        String edadString = String.valueOf (edad);
        String estaturaString = String.valueOf (estatura); //y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

        System.out.println("Edad: " + edadString + estatura + estaturaString);

        //conversiones 
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        //ejemplo
        float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);
        
        */
    	/*
    	int num1 = 8;
    	int num2 = 56;
    	int multiplicacion = num1 * num2;
    	 
    	int modulo = num % 2;
    	System.out.println("la multiplicacion es " + multiplicacion);
    	System.out.println("el modulo de 8 es " + modulo);
    	
    	// declara 2 variables de tipo bool
    	
    	boolean esVerdadero = true;
    	boolean esFalso = false;
    	
    	if (esVerdadero == false) {
    		System.out.println("es verdadero");
    	}
        
    	double cambioDinero = 25.50;
    	if (cambioDinero > 25.49) {
    		cambioDinero = 26;
    	}
    	    */
    	
    	
    	
    	// convertir grados
    	//fahrenheit a celcius //(32 °F − 32) × 5/9 = 0 °C
    	//fahrenheit a Kelvin //(32 °F − 32) × 5/9 + 273.15 = 273.15 K

    	    double farenheit1 = 49;
    	    double conversionKelvin = (farenheit1 - 32) * 5/9 + 273.15;
    	    double conversionCelcius = (farenheit1 - 32) * 5/9;
    	    System.out.println(conversionKelvin);
    	    System.out.println(conversionCelcius);
    	    
    	    
    	    
    	    //calcular si un numero es par
    	    byte numero4 = 24;
    	    if (numero4 % 2 == 0) {
        	    System.out.println("es numero par " + numero4);

    	    }else {
    	    	System.out.println("no es numero par");
    	    }
    	    
    	    
    } 
    

    


}
