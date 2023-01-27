package it.test;

public class Esercizio5 {

	
	public static int somma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public static int sottrazione(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public static int moltiplicazione(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	public static int divisione(int numero1, int numero2) {
		if(numero2 == 0) {
			System.out.println("Il numero dev'essere diverso da 0");
			return 0;
		} else {
			return numero1 / numero2;
		}
		
	}
	
	

}



//Scrivere una classe Java chiamata Calcolatrice che definisce quattro metodi che rispettivamente sommano,
//dividono, moltiplicano e sottraggono due valori interi.
//
//Scrivere quindi un programma driver per collaudare i quattro metodi