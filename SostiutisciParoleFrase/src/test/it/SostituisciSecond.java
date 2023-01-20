package test.it;

import java.util.Scanner;

public class SostituisciSecond {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un Nome");
		String nome = tastiera.next();
		System.out.println("Inserisci un Animale");
		String animale = tastiera.next();
		System.out.println("Inserisci un Colore");
		String colore = tastiera.next();
		System.out.println("Inserisci un Piatto");
		String piatto = tastiera.next();
		String frase = "Ho sognato che Nome aveva mangiato un Animale Colore e aveva detto che sapeva di Piatto.";
		frase = frase.replaceAll("Nome", nome);
		frase = frase.replaceAll("Animale", animale);
		frase = frase.replaceAll("Colore", colore);
		frase = frase.replaceAll("Piatto", piatto);
		System.out.println(frase);
		
		tastiera.close();

	}

}
