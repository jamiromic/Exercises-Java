package it.testmethod;

import java.util.Scanner;

public class methodsWithArguments {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero da sommare");
		int numero1 = input.nextInt();
		System.out.println("Inserisci il secondo numero da sommare");
		int numero2 = input.nextInt();
		System.out.println(somma(numero1,numero2));
		input.close();
	}
	
	public static int somma(int numero1,int numero2) {  // Creata Funzione Statica con argomenti
		int sum = numero1 + numero2;                  
		return sum;
	}

}
