package control;

import java.util.Scanner;

public class OrdenTres {
	Scanner num = new Scanner(System.in);
	
	private void ordenar() {

		// TODO Auto-generated method stub
		System.out.println("introduce el primer numero");
		int var1 = num.nextInt();
		int var2 = num.nextInt();
		int var3 = num.nextInt();
		
		if (var1 < var2 && var1 < var3) {
			System.out.println(var1 + " es menor");
			
		}else if (var2 < var3 && var2 < var1);
		System.out.println(var2 );
	}

}
