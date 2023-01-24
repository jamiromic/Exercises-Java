package it.test;

public class Esercizio7 {

	public static void main(String[] args) {
		int sommaTotale = 1;
		for(int i = 2; i < 10; i++) {
			sommaTotale = sommaTotale + (i *i);
		}
		System.out.println(sommaTotale);

	}

}


//Si scriva un'istruzione for che calcoli la somma 1 + 2^2 + 3^2 + 4^2 + ... + n^2