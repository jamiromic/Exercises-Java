package test.testcelsium;

import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Inserisci la frase");        // Stampo a video la richiesta
		Scanner tastiera = new Scanner(System.in);       // Creo oggetto Scanner
	    String frase = tastiera.nextLine();                // Creo variabile int in cui salvo il dato input
		System.out.println(frase);
		int indexprimaparola = frase.indexOf(" ");
		String frasesenzaprimaparola = frase.substring(indexprimaparola+1);
		System.out.println(frasesenzaprimaparola);
		String primaparola = frase.substring(0,indexprimaparola);
		String finale = frasesenzaprimaparola.concat(" " + primaparola);
		System.out.println(finale);
		tastiera.close();
		
		
		 
	
		
		
		

	}

}


//Si scriva un programma che legga una riga di testo come input e che la visualizzi dopo aver spostato la prima parola alla fine della riga. Un possibile esempio del risultato da ottenere è il seguente: 
//
//Scrivi una riga di testo senza punteggiatura. 
//Java e’ un linguaggio
//La riga è stata modificata in:
//e’ un linguaggio Java