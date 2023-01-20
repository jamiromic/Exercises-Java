package it.test;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int numero = tastiera.nextInt();
		if((numero > 5) && (numero < 7))  // And
		    System.out.println("Il numero inserito è 6");
		else
			System.out.println("Il numero è diverso a 6");
		tastiera.close();
	}

}
