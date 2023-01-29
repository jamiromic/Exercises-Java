package it.test;

import java.util.Scanner;

public class CollaudoEsercizio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String risultato = "";
		do {
			System.out.println("Inserisci il giorno di nascita");
			int giorno = input.nextInt();
			System.out.println("Inserisci il mese di nascita in formato numerico");
			int mese = input.nextInt();
			risultato = Esercizio6.determinaSegnoZodiacale(giorno, mese);
		} while (risultato == "");
		System.out.println("Il tuo segno zodiacale è : " + risultato);
		input.close();
	}

}
