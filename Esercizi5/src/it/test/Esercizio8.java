package it.test;

import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il valore minimo consentito");
		int min = input.nextInt();
		System.out.println("Inserisci il valore massimo consentito");
		int max = input.nextInt();
		System.out.println("Inserisci il valore che vuoi verificare");
		int value = input.nextInt();
		System.out.println(intervalFinder(min,max,value));
		input.close();
	}
	
	
	public static boolean intervalFinder(int min,int max,int value) {
		boolean result = true;
		if(value > min && value < max) {
			result = true;
			System.out.println("Il valore inserito E' compreso nell'intervallo");
		} else {
			result = false;
			System.out.println("Il valore inserito NON è compreso nell'intervallo");
		}
		return result;
	}

}


//Si realizzi una classe java che abbia definito un metodo che accetta in ingresso 3 interi min,max e valore. Tale metodo deve verificare se valore è all'interno dell'intervallo
//min-max estremi inclusi. 
//Se è all'interno, il metodo restituisce true, false in caso contrario.