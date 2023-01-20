package test.scannertest;

import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		
		String fraseUtente,parolaRimpiazzata;
		parolaRimpiazzata = "amo";
		System.out.println("Inserisci una frase");
		Scanner tastiera = new Scanner(System.in);
		fraseUtente = tastiera.nextLine();
		System.out.println("La frase scelta è: " + fraseUtente);
		fraseUtente = fraseUtente.replaceFirst("odio", parolaRimpiazzata);
		System.out.println("La frase è stata modificata con : " + fraseUtente);
		tastiera.close();
	}

}
