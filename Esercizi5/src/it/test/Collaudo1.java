package it.test;

import java.util.Scanner;

public class Collaudo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		int numero1 = input.nextInt();
		System.out.println("Inserisci il secondo numero");
		int numero2 = input.nextInt();
		System.out.println("La somma dei due numeri è : " + Esercizio5.somma(numero1, numero2));
		System.out.println("La sottrazione dei due numeri è : " + Esercizio5.sottrazione(numero1, numero2));
		System.out.println("La moltiplicazione dei due numeri è : " + Esercizio5.moltiplicazione(numero1, numero2));
		System.out.println("La divisione dei due numeri è : " + Esercizio5.divisione(numero1, numero2));
		input.close();
		

	}

}
