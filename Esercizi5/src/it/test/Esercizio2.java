package it.test;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome");
	    String nome = input.next();
	    System.out.println("Inserisci il numero di volte che vorresti essere salutato");
	    int numero = input.nextInt();
	    saluta(numero,nome);
	    input.close();
		
		

	}
	
	
	public static void saluta(int numeroVolte, String nome) {
		for(int i = 0; i < numeroVolte; i++) {
			System.out.println("Ciao " + nome);
		}
	}

}


//
//Si realizzi una classe Java che definisce :
//
//il metodo saluta che accetta in ingresso una stringa nome e un intero n e stampa a video n volte la frase Ciao seguita val valore di nome. 
//Se per esempio viene inserito Marco e 3 l'output dovrebbe essere :
//
//Ciao Marco
//
//Ciao Marco
//
//Ciao Marco
//
//il metodo main che chiede all'utente di inserire una stringa e un intere e invoca il metodo saluta con i valori letti