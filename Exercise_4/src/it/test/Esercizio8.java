package it.test;

public class Esercizio8 {

	public static void main(String[] args) {
		enum Mesi {GENNAIO,FEBBRAIO,MARZO,APRILE,MAGGIO,GIUGNO,LUGLIO,AGOSTO,SETTEMBRE,OTTOBRE,NOVEMBRE,DICEMBRE}
		
		for ( Mesi meseSuccessivo : Mesi.values())
			System.out.println(meseSuccessivo);

	}

}
