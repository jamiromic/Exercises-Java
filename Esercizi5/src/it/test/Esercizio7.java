package it.test;

import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire la prima parola");
		String parola1 = input.next();
		System.out.println("Inserire la seconda parola");
		String parola2 = input.next();
		System.out.println(cercaCarattere(parola1,parola2));
		input.close();
	}
	
	
	
	public static char cercaCarattere(String parola1, String parola2) {
		for(int i = 0; i < parola1.length(); i++) {
			char letteraParola1 = parola1.charAt(i);
			for(int e = 0; e < parola2.length(); e++) {
				char letteraParola2 = parola2.charAt(e);
				char letteraUguale = ' ';
				if(letteraParola1 == letteraParola2) {
					letteraUguale = letteraParola2;
					return letteraUguale;
				} 
			}
		}
		return '*';
	}

}




//Si realizzi una classe java che definisce:
//
//il metodo cercaCarattere che accetta in ingresso due stringhe, confronta ad uno ad uno i caratteri delle due stringhe e restituisce 
//il primo carattere uguale trovato oppure restituisce il carattere * se le due stringhe non hanno nemmeno un carattere uguale;
//
//il metodo main che continua a leggere in input due stringhe e invoca il metodo cercaCarattere passandogli le stringhe inserite dall'utente, 
//finché il carattere restituito dal metodo è diverso dall'ultimo carattere della prima stringa