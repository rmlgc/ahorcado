package Ahorcado;

import java.util.Arrays;

public class pru {

	public static void main(String[] args) {
	
		String[] palabras = { "Jirafa", "Perro", "Gato", "Gallo", "Elefante", "Rata", "Tortuga" };
		String[] palabras1 = { "JIRAFA"};
		for (int i = 0; i < palabras.length; i++) {
			char[] asd= palabras[i].toCharArray();
			Arrays.sort( asd );
			for (int j = 0; j < asd.length; j++) {
				System.out.print(asd[j]);
				char[] asdd = palabras[i].toUpperCase().toCharArray();
				char[] das = palabras1[j].toUpperCase().toCharArray();

				System.out.println(asdd[i] == das[j] );
			}
			System.out.println(""+ palabras[i].toUpperCase().toCharArray().equals(palabras1[0].toUpperCase()) );
			
		}
		char[] asd = palabras[0].toUpperCase().toCharArray();
		char[] das = palabras1[0].toUpperCase().toCharArray();

		System.out.println(asd[0] == das[0] );
		
	}
}
