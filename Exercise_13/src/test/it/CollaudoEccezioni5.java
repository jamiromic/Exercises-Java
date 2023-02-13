package test.it;

import java.util.Scanner;

public class CollaudoEccezioni5 {
	

	public static void main(String[] args) {
		boolean controllo = true;
		Scanner input = new Scanner(System.in);
		while(controllo) {
			System.out.println("Inserisci una riga di testo non più lunga di 20 caratteri");
			String frase = input.next();
			try {
				if(frase.length() < 21) {
					System.out.println("Hai inserito " + frase.length() + " caratteri, che è un numero di caratteri accettabile");
				} else {
					throw new MessaggioTroppoLungoException();
				}
				
			} catch(MessaggioTroppoLungoException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Vuoi continuare a giocare?");
			System.out.println("Inserisci \"si\" oppure \"no\"");
			String risposta = input.next();
			if(risposta.toLowerCase().equals("no")) {
				System.out.println("Partita finita");
				controllo = false;
			}
		}
		
		

	}

}
