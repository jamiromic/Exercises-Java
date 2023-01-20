package it.test;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {	
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il tuo numero fortunato");
		int scelta = tastiera.nextInt();
		if (scelta < 6)
			System.out.println("Il tuo numero è più basso di 6");
		else
			System.out.println("Il tuo numero è più alto di 6");
		tastiera.close();
	}

}
