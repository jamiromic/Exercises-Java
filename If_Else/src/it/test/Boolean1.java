package it.test;

import java.util.Scanner;

public class Boolean1 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il valore booleano");
		boolean valore = tastiera.nextBoolean();
		System.out.println("Il valore inserito è : " + valore);
		tastiera.close();
	}

}
