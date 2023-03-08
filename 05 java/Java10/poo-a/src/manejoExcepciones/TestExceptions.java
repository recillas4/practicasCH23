package manejoExcepciones;

public class TestExceptions {

	public static void main(String[] args) throws OpExceptions {
		// TODO Auto-generated method stub
		
		
		try {
			Division d = new Division(4,2);
			d.visualizarD();
			
		}catch (OpExceptions e) {
			e.printStackTrace();
		}
		System.out.println("continua...");
	}

}
