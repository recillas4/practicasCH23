package pruebasJUnit.jara.app;

public class Calculadora {
	
	public int sumar(int n1, int n2) {
		
		return (n1 + n2);
	}
	
	public int restar(int n1, int n2) {
		
		return (n1 - n2);
	}

	public double division(double div1, double div2) {
		
		return (div1 / div2);
	}
	
	public double divicero(double num1, double num2) {
		if (num1 == 0) {
			throw new ArithmeticException("no se puede dividir por cero");
			
		}
		return (num1 / num2);

	}
	

}
