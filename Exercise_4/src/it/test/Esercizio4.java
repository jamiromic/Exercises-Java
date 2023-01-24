package it.test;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14;
		boolean stato = true;
		do {
			System.out.println("Inserisci il Volume");
			double volume = input.nextDouble();
			System.out.println("Inserisci il Raggio");
			double raggio = input.nextDouble();
			stato = false;
			double altezza = volume / (PI * (raggio * raggio));
			double prezzo = ((2 * PI) * (raggio * altezza));
			System.out.println("");
			System.out.println("Questo è l'altezza del contenitore : " + altezza);
			System.out.println("Questo è il prezzo : " + prezzo);
			System.out.println("");
			stato = true;
			
		} while (stato);
		input.close();

	}

}


//Si supponga di lavorare per un'azienda che produce bibite.
//L'azienda vuole conoscere il costo ottimale per un contenitore cilindrico che
//contiene un certo volume di bibita. Si scriva un frammento di codice  che
//utilizza un ciclo del tipo chiedi-prima-di-iterare. Durante ogni iterazione
//del ciclo, il codice deve chiedere all'utente di inserire il volume e il raggio
//del cilindro.
//
//Quindi deve calcolare e visualizzare l'altezza e il prezzo del contenitore. 
//Si utilizzi la formula seguente, in cui V rappresenta il volume, r il raggio, 
//h l'altezza e C il prezzo. 
//
//h = V/(Pi * r^2)
//
//C = 2Pi * r(r+h)