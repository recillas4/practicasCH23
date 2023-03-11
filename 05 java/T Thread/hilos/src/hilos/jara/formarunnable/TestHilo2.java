package hilos.jara.formarunnable;

public class TestHilo2 {

	public static void main(String[] args) {
		
		
		Hilo2 h2 = new Hilo2("Pedro");
		
		Thread st = new Thread(h2);
		
		st.start();
		
		new Thread (new Hilo2("Caligula")).start();;
		new Thread (new Hilo2("Mariano")).start();;
		
		
	}

}
