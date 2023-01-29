package it.test;

import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dimensioni;
		String asterischi = "";
		//Verifico Condizione
		do {
			System.out.println("Inserisci le dimensioni del triangolo, da 1 a 50");
			dimensioni = input.nextInt();
			if((dimensioni > 50) || (dimensioni < 1)) {
				System.out.println("Il valore inserito è errato");
			}
		} while(dimensioni < 1 || dimensioni > 50);
		// Numero di iterazioni del ciclo in base alle dimensioni
		for(int i = 1; i <= dimensioni; i++ ) {
			asterischi = asterischi + "*";
			System.out.println(asterischi);
		}
		//Ciclo in cui decremento ed elimino ogni iterazione l'ultimo carattere della stringa
		for(int i = dimensioni; i > 0; i-- ) {
			asterischi = asterischi.substring(0, asterischi.length()-1);
			System.out.println(asterischi);
		}
		input.close();
	}

}




//Si scriva un programma che chieda all'utente di inserire le dimensioni di un triangolo ( un intero compreso tra 1 e 50) . 
//Si visualizzi il triangolo mostrando righe di asterischi. La prima riga avrà un asterisco solo, la seconda due e così via, 
//ciascuna riga avrà un asterisco in più della precedente fino a raggiungere il numero di righe indicato dall'utente. 
//Per le righe successive, il numero di asterischi per riga deve decrescere di uno per ogni nuova riga. 
//Suggerimento: si usino dei cicli annidati, il ciclo esterno per controllare il numero di righe da scrivere, 
//mentre quello interno il numero di asterischi da scrivere in ogni riga, per esempio se l'utente scrive 3 :
//
//*
//
//**
//
//***
//
//**
//
//*
//
//Testo della risposta