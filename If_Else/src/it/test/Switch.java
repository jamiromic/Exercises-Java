package it.test;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserisci un numero");
		int a = tastiera.nextInt();
		switch(a) {
		case 1:
			System.out.println("Il valore è 1");
			break;
		case 2:
			System.out.println("Il valore è 2");
			break;
		case 3:
			System.out.println("Il valore è 3");
			break;
		default:                                // Valore di Default
			System.out.println("Nessuno dei valori precedenti è corretto");
			tastiera.close();
		}
		
	}

}
