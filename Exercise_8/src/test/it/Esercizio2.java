package test.it;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		//Creazione istanza Classe Punteggio
		Punteggio punteggio1 = new Punteggio();
		//Utilizzo un setter per inserire la descrizione, in questo caso di un film
		punteggio1.setDescrizione("Avatar");
		//Utilizzo un setter per inserire la descrizione, in questo caso di un film
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il punteggio");
		int punteggio = input.nextInt();
		punteggio1.setPunteggio(punteggio);
		System.out.println(punteggio1.toString());
		input.close();
		
		
		

	}

}
