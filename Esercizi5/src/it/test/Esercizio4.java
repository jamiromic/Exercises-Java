package it.test;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Chiediamo dati e calcoliamo Area Rettangolo
		System.out.println("Inserisci i dati per il calcolo dell'area del Rettangolo in cm");
		System.out.println("Inserisci la lunghezza della base");
		int baseRettangolo = input.nextInt();
		System.out.println("Inserisci l'altezza");
		int altezzaRettangolo = input.nextInt();
		System.out.println("L'Area del rettangolo è : " + areaRettangolo(baseRettangolo,altezzaRettangolo) + " cm");
		System.out.println("");
		// Chiediamo dati e calcoliamo Area Rettangolo
		System.out.println("Inserisci i dati per il calcolo dell'area del Quadrato in cm");
		System.out.println("Inserisci la lunghezza del lato");
		int latoQuadrato = input.nextInt();
		System.out.println("L'Area del quadrato è : " + areaQuadrato(latoQuadrato) + " cm");
		//Chiudo Terminale Input
		input.close();
	}
	// Metodo che calcola area Rettangolo
	public static int areaRettangolo(int base,int altezza) {
		int area = base * altezza;
		return area;
	}
	// Metodo che calcola area Quadrato
	public static int areaQuadrato(int lato) {
		int area = lato * lato;
		return area;
	}

}


//Si realizzi una classe Java che definisce:
//
//il metodo areaRettangolo che calcola e restituisce l'area di un rettangolo date la base e l'altezza. 
//La base e l'altezza sono di tipo int così come l'area calcolata e restituita.
//
//il metodo areaQuadrato che accetta in ingresso il lato e sfrutta il metodo areaRettangolo per calcolare l'area del quadrato. 
//L'area calcolata viene restituita. Sia il latto che l'area calcolata e restituita sono di tipo int.
//
//il metodo main che chiede all'utente un valore per la base e uno per l'altezza e 
//stampa a video il ritorno dell'invocazione del metodo areaRettangolo. 
//Chiede infine all'utente il lato di un quadrato e stampa a video il ritorno dell'invocazione al metodo areaQuadrato.