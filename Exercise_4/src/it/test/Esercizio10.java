package it.test;

public class Esercizio10 {

	public static void main(String[] args) {
		int sommaTotale = 27;
		int numeroMisterioso = 0;
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		
			for(int i = 0; i < 10; i++) {
				int numero = i;
				if(numero % 2 != 0) {
					numero4 = numero;
				}
			}
		

	}
	
}

//Numero misterioso è 9837

//Holy digits Batman! L'Enigmista sta pianificando un nuovo crimine da qualche parte sulla Pennsylvania Avenue. come al solito, ha lasciato l'indirizzo sotto forma di enigma.
//Il numero civico della Pennsylvania Avenue è formato da 4 cifre che soddisfano le seguenti condizioni:
//
//le 4 cifre sono differenti;
//
//la cifra delle migliaia è tre volte quella delle decine;
//
//il numero è dispari;
//
//la somma delle 4 cifre è 27;
//
//Scrivere un programma che usa uno o più cicli per trovare il numero civico della Pennsylvania Avenue in cui l'Enigmista ha previsto di colpire.