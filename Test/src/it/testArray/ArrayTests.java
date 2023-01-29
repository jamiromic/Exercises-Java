package it.testArray;

import java.util.Scanner;

public class ArrayTests {

	public static void main(String[] args) {
		//Creazione di un array di tipo in composto da 10 elementi di tipo int
		int temperatura[] = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci 10 temperature diverse");
		for(int i = 0; i < temperatura.length; i++) {
			temperatura[i] = input.nextInt();
		}
		
		int somma = 0;
		
		for(int elemento : temperatura) {
			//Incremento valore somma ogni iterazione
			somma += elemento;
			System.out.println(somma);
		}
		
	}

}
