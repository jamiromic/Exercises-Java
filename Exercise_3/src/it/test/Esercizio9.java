package it.test;

import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Primo Giocatore, scegli una lettera");
		String utente1 = input.next().toUpperCase();
		System.out.println("Secondo Giocatore, scegli una lettera");
		String utente2 = input.next().toUpperCase();
		if(!(utente1.equals(utente2))) {
			if((utente1.equals("C")) && (utente2.equals("F"))) {
				System.out.println("Utente 2 Ha Vinto");
			}
			else if((utente1.equals("F")) && (utente2.equals("C"))) {
				System.out.println("Utente 1 Ha Vinto");
			}
			else if((utente1.equals("F")) && (utente2.equals("S"))) {
				System.out.println("Utente 2 Ha Vinto");
			}
			else if((utente1.equals("C")) && (utente2.equals("F"))) {
				System.out.println("Utente 2 Ha Vinto");
			}
			else if((utente1.equals("C")) && (utente2.equals("S"))) {
				System.out.println("Utente 1 Ha Vinto");
			}
			else if((utente1.equals("S")) && (utente2.equals("F"))) {
				System.out.println("Utente 1 Ha Vinto");
			}
			else if((utente1.equals("S")) && (utente2.equals("C"))) {
				System.out.println("Utente 2 Ha Vinto");
			}
		  
		} else {
			System.out.println("Pareggio");
		}
		input.close();
		
		

	}

}


//Scrivere un programma per il gioco della morra cinese (carta-forbici-sasso).
//Ciascuno dei due giocatori digita C, F o S. Il programma poi comunica il vincitore e il criterio per determinare il vincitore: 
//la carta avvolge il sasso, le forbici tagliano la carta, il sasso spezza le forbici oppure non c'è nessun vincitore. Il programma dovrà consentire ai 
//giocatori di digitare lettere maiuscole e minuscole.