package com.generation.jara.mains;

import com.generation.jara.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		
		ClaseGenerica <Integer> intObj = new ClaseGenerica <Integer>(55);
		ClaseGenerica <String> stringObj = new ClaseGenerica <String>("prueba");
		
		intObj.claseTipo();
		stringObj.claseTipo();


	}

}
