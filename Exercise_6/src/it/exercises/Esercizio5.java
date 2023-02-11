package it.exercises;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?");
		int numeroArray = input.nextInt();
		int array[] = new int[numeroArray];
		System.out.println("Inserire " + numeroArray + " numeri interi, uno per riga");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("La somma è : " + percentualeInteri(array));
		System.out.println("I numeri che compongono la somma sono :");
		for(int element : array) {
			double calcoloPercentuale = ((element * 100) / percentualeInteri(array));
			System.out.println(element + " : che è il " + calcoloPercentuale + " % della somma");
		}
	}
	
	public static int percentualeInteri(int array[]) {
		int somma = 0;
		for(int element : array) {
			somma += element; 
		}
		return somma;
	}

}



//Scrivere un programma che legga degli interi, uno per riga, e visualizzi la loro somma.
//Deve visualizzare, inoltre tutti i numeri letti, ognuno con un'annotazione che indichi il contributo percentuale alla somma. 
//Utilizzare un metodo che prende come argomento un intero array e che restituisce la somma dei numeri nell'array. 
//Suggerimento: chiedere all'utente il numero di interi che verranno inseriti, creare un array di quella lunghezza e poi riempirlo con gli interi letti. 
//Ecco una possibile interazione tra il programma e l'utente : 
//
//Quanti numeri verranno inseriti?
//
//4
//
//Inserire 4 interi, uno per riga:
//
//2
//
//1
//
//1
//
//2
//
//La somma è 6.
//
//i numeri sono:
//
//2, che è il 33.33333% della somma.
//
//1, che è il 16.6666% della somma.
//
//1, che è il 16.6666% della somma.
//
//2, che è il 33.33333% della somma.