package it.test;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il tuo numero preferito");
		int numero = tastiera.nextInt();
		if(numero >= 6)
			System.out.println("Il numero scelto è uguale o maggiore di 6");
		else
			System.out.println("Il numero scelto è minore di 6");
		tastiera.close();
	}

}
