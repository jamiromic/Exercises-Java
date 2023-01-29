package it.test;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		int n1 = input.nextInt();
		System.out.println("Inserisci il secondo numero");
		int n2 = input.nextInt();
		divisibile(n1,n2);
		input.close();

	}
	
	public static boolean divisibile(int n1,int n2) {
		boolean risultato = true;
		if((n2 != 0) && (n1 % n2 == 0)) {
			System.out.println("Il numero è divisibile per l'altro");
			risultato = true;
		} else {
			System.out.println("Il numero non è divisibile per l'altro");
			risultato = false;
		}
		return risultato;
	}

}



//Si realizzi una classe Java che abbia definito un metodo chiamato divisibile che accetta in ingresso due interi
//e restituisce true se il primo intero è divisibile per il secondo, false in caso contrario.