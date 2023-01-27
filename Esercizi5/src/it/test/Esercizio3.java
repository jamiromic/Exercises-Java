package it.test;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		boolean condizione = true;
		Scanner input = new Scanner(System.in);
	    do {
	    	System.out.println("Inserisci la parola");
			String parola = input.nextLine();
			if((contaVocali(parola) <= 5)) {
				System.out.println("Gioco Finito");
				condizione = false;
			} else {
				System.out.println("Il numero di vocali contenute nella parola è " + contaVocali(parola) );
			}
		} while (condizione);
	    input.close();
		
	}
		
	
	public static int contaVocali(String parola) {
		int contatoreVocali = 0;
		for(int i = 0; i < parola.length(); i++) {
			char lettera = parola.charAt(i);
			if((lettera == 'a') || (lettera == 'e') || (lettera == 'i') || (lettera == 'o') || (lettera == 'u')) {
				contatoreVocali++;
			}
		}
		return contatoreVocali;
	}

}




//Si realizzi una classe Java che definisce : 
//
//il metodo contaVocali che accetta in ingresso una stringa e restituisce il numero di vocali presenti nella stringa;
//
//il metodo main che iterativamente chiede all'utente di inserire una stringa se la stringa inserita ha un numero di vocali minore od uguale a 5. 
//Stampa quindi il numero di vocali dell'ultima stringa inserita.