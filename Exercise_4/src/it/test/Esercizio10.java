package it.test;

public class Esercizio10 {

	public static void main(String[] args) {
		
			for(int i = 1; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					for(int l = 0; l < 10; l++) {
						for(int m = 0; m < 10; m++) {
							if((i != j) && (i != l) && (i != m) && (j != l) && (j != m) && (l != m) ){
								if((i == (3 * l)) && (i + j + l + m == 27)){
									if(m % 2 != 0) {
										System.out.println(i + "" + j + "" + l + "" + m );
									}
								}
							}
							
						}
					}
					
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