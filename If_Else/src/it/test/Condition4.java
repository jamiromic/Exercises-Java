package it.test;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il numero");
		int numero = tastiera.nextInt();
		if(numero == 5)
			System.out.println("Il numero è 5");
		else if(numero == 4)
			System.out.println("Il numero è 4");
		else if(numero == 7)
			System.out.println("Il numero è 7");
		else 
			System.out.println("Il numero inserito non è il 4 il 5 e il 7 ma è un altro");
		tastiera.close();

	}

}
