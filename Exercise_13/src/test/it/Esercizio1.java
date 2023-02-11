package test.it;

import java.util.Scanner;

public class Esercizio1 {

	public void calcolaResto(int numero1,int numero2) throws Exception {
		if(numero2 < 1)
		throw new Exception("Eccezione: Il numero non può essere uguale a 0");
		System.out.println("Il resto tra i due numeri è : " + numero1 % numero2);
	}

	public static void main(String[] args) {
		boolean controlloCiclo = true;
		Esercizio1 testMetodo = new Esercizio1();
		Scanner input = new Scanner(System.in);
		while(controlloCiclo) {
			System.out.println("Inserisci il primo numero");
			int numero1 = input.nextInt();
			System.out.println("Inserisci il secondo numero");
			int numero2 = input.nextInt();
			
			try {
				testMetodo.calcolaResto(numero1,numero2);
				controlloCiclo = false;
			}   catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
		

	}


}
