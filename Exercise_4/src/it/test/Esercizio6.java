package it.test;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean controllo = true;
		while(controllo) {
		    System.out.println("Inserisci la parola da controllare");
		    String parola = input.nextLine().toLowerCase();
		    if(parola.equals("uscita")) {
		    	controllo = false;
		    }
		    String parolaInvertita = "";
		    int lunghezzaParola = parola.length();
		    for(int i = lunghezzaParola-1; i >= 0; i--) {
		    	parolaInvertita = parolaInvertita + parola.charAt(i);
		    }
		    if(parola.equals("uscita")) {
		    	System.exit(0);
		    }
		    if(parola.equals(parolaInvertita)) {
		    	System.out.println("Questa parola è palindroma");
		    } else {
		    	System.out.println("Questa Parola non è palindroma");
		    }
		
		}
		
		
		
		

	}

}



//Si scriva un programma che individua se una parola è palindroma, cioè se scritta nel verso opposto è uguale alla parola di partenza. 
//Anna, per esempio, è una parola palindroma. Il programma deve terminare quando viene scritta la parola uscita.