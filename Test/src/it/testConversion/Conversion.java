package it.testConversion;

public class Conversion {

	public static void main(String[] args) {
		double somma = 1086.57;
		// Conversione di tipo (int)- si trasforta da double a int
		// se no non sarebbe avvenuto implicitamente
		int centesimiTotali = (int)(Math.round(somma * 100));
		System.out.println(centesimiTotali);
		// Divido il totale dei centesimi per sapere quanti euro abbiamo
		// Visto che per ogni euro abbiamo bisogno di 100 centesimi
		int euro = centesimiTotali / 100;
		// Recupero i centesimi scaturiti dal resto della divisione per 100
		int centesimi = centesimiTotali % 100;
		
		

	}

}
