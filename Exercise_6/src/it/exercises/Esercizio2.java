package it.exercises;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il numero di famiglie di cui vogliamo analizzare i redditi");
		int numeroFamiglie = input.nextInt();
		double redditoSuperiore = 0;
		//Creo array di elementi in double di cui la lunghezza è definita dall'utente
		double redditoFamiglia[] = new double[numeroFamiglie];
		int famiglieRedditoInferiore = 0;
		for(int i = 0; i < redditoFamiglia.length; i++) {
			System.out.println("Inserisci il reddito della famiglia n. " + i);
			//inizializzo elemento array con il reddito definito dall'utente
			redditoFamiglia[i] = input.nextDouble();
			//Se il reddito è superiore al valore della variabile redditoSuperiore, allora quest'ultima variabile prenderà il valore dell'elemento con il valore maggiore
			if(redditoFamiglia[i] > redditoSuperiore) {
				//Se verificata la condizione salvo reddito su variabile redditoSuperiore
				redditoSuperiore = redditoFamiglia[i];
			}
		}
		//Stampo a video valore redditoSuperiore che conterrà il reddito maggiore tra gli elementi dell'array
		System.out.println("Il reddito maggiore è di : " + redditoSuperiore);
		//Ciclo For Each
		for(double element : redditoFamiglia) {
			/*Verifico che element sia minore del valore del reddito più alto, e che sia superiore al valore del reddito più alto meno il 10%. Quindi verifico che si trovi
			in questo range di valori*/
			if((element < redditoSuperiore) && (element > (redditoSuperiore - (redditoSuperiore * 10) / 100 ))) {
				//Incremento il valore famiglieRedditoInferiore in modo da sapere quante famiglie hanno un reddito inferiore fino al 10% rispetto al reddito maggiore.
				famiglieRedditoInferiore++;
				System.out.println("Questo reddito è inferiore fino al 10% rispetto al reddito massimo : " + element);
			}
		}
        System.out.println("Il numero di famiglie con un reddito inferiore fino al 10% rispetto al reddito massimo sono : " + famiglieRedditoInferiore);
        input.close();
	}

}


//Scrivere un programma in una classe ContaFamiglie che conti il numero di famiglie il cui reddito è al di sotto di un certo valore. 
//Leggere un intero k da tastiera e, in seguito, creare un array di valori double di dimensione k. 
//Leggere da tastiera x valori che rappresentano i redditi delle famiglie e memorizzarli nell'array. Trovare il piu elevato tra questi redditi. 
//Poi contare le famiglie il cui reddito è inferiore fino al 10% rispetto al reddito massimo. Visualizzare questo conteggio e i redditi di queste famiglie.