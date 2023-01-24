package it.test;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lanciTotali = 8;
		int numeroTeste = 0;
		int numeroCroci = 0;
		double percentualeTeste = 0.0;
		double percentualeCroci = 0.0;
		
		for(int i=1; i < lanciTotali+1; i++) {
			System.out.println("Inserisci il risultato del lancio n. " + i);
			String risultato = input.next().toLowerCase();
			if(risultato.equals("t")) {
				numeroTeste++;
			} else if(risultato.equals("c")) {
				numeroCroci++;
			}
		}
		 
		System.out.println("Numeri di volte Testa " + numeroTeste);
		System.out.println("Numeri di volte Croce " + numeroCroci);
		percentualeTeste = (numeroTeste * 100) / lanciTotali;
		System.out.println(percentualeTeste + " % " + "Risultati Testa");
		percentualeCroci = (numeroCroci * 100) / lanciTotali;
		System.out.println(percentualeCroci + " % " + "Risultati Croce");
		input.close();
		
       
	}

}



//Si scriva un programma che computi la statistica per otto lanci di una moneta. Per ciascuno dei lanci effettuati,
//l'utente scrive t se è uscito testa, c se è uscito croce. Il programma mostrerà il numero totale di lanci e la percentuale di teste o croci.
//Si usi l'operatore di incremento per contare ciascuna c e t inserita. Un possibile dialogo tra il programma e l'utente potrebbe essere il seguente:
//
//Per ciascun lancio della moneta inserisci t se è uscito testa, c se è uscito croce.
//
//Primo lancio: t
//
//Secondo lancio: c
//
//ecc..
//
//Numero di teste : X
//
//Numero di croci: Y
//
//Percentuale teste : Z
//
//Percentuali croci: C