package it.test;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String frase = input.nextLine();
		int lunghezzaFrase = frase.length();
		int spazi = 0;
		for(int i = 0; i < lunghezzaFrase; i++) {
			char lettera = frase.charAt(i);
			if(lettera == ' ') {
				spazi++;
			}
		}
		System.out.println("Sono stati trovati " + spazi + " spazi all'interno della frase");
        input.close();
	}

}
