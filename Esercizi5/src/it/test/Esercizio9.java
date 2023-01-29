package it.test;

import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {
		// Parte richiesta e salvataggio dati Input
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la parola che vorresti invertire");
		String parolaDaInvertire = input.next();
		System.out.println("Inserisci da quale posizione da cui vuoi partire per invertire la parola");
		int posizione = input.nextInt();
		//Invocazione Metodo inverti
		System.out.println(inverti(parolaDaInvertire,posizione));
		input.close();
		
		

	}
	//Creo metodo che prende in entrata una stringa ed un int e da in uscita una stringa
	public static String inverti(String daInvertire,int n) {
		//Recupero parte da non cambiare
		String parteFissa = daInvertire.substring(0, n);
		//Recupero parte da Invertire
		String parteDaInvertire = daInvertire.substring(n);
		// Dichiaro ed inizializzo variabile
		String parolaInvertita = "";
		// Creo ciclo inverso, partendo da lunghezza Stringa decrementando l'indice fino a 0
		for(int i = parteDaInvertire.length()-1; i > -1 ; i--) {
			//Isolo singolo carattere, partendo dall'ultimo carattere
			char lettera = parteDaInvertire.charAt(i);
			//Incremento stringa con i caratteri invertiti
			parolaInvertita = parolaInvertita + lettera;
		}
		//Concateno parte fissa stringa con la parte invertita
		parolaInvertita = parteFissa + parolaInvertita;
			
		//Restituisco valore stringa in uscita
		return parolaInvertita;
	}

}


//Si realizzi un programma che definisca : 
//
//il metodo inverti che accetta in ingresso una stringa daInvertire e un intero n e restituisce una stringa con i caratteri invertiti a partire dal carattere di indice n,
//se l'indice è valido(se, per esempio, daInvertire = "programmazione" e n = 5, il metodo restituisce "progrenoizamma") oppure restituisce la stringa "errore".