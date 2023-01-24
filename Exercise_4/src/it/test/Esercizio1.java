package it.test;

public class Esercizio1 {

	public static void main(String[] args) {
		int somma = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				somma = somma + i;
				System.out.print(i + " ");
			}
		}
		System.out.println("la somma dei seguenti numeri é : " + somma);

	}

}
