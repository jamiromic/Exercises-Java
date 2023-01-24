package it.test;

public class Esercizio8 {

	public static void main(String[] args) {
		enum Mesi {GENNAIO,FEBBRAIO}
		
		for ( Mesi meseSuccessivo : Mesi.values())
			System.out.println(meseSuccessivo);

	}

}
