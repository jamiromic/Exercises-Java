package it.test;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int numero = tastiera.nextInt();
		if((numero > 6)||(numero < 3))    // Or
			System.out.println("Il numero è quello giusto");
		else
			System.out.println("Il numero è quello sbagliato");
		tastiera.close();
	}

}
