package it.test;

import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase");
        String frase = input.nextLine();
        int numeroCaratteri = frase.length();
        char puntoInterrogativo = frase.charAt(numeroCaratteri -1);
        String parole = "Tu dici sempre";
        
        if(numeroCaratteri % 2 == 0 && puntoInterrogativo == '?') {
        	System.out.println("Si");
        } else if (numeroCaratteri % 2 != 0 && puntoInterrogativo == '?') {
        	System.out.println("No");
        } else if(puntoInterrogativo == '!') {
        	System.out.println("Wow");
        }else {
        	System.out.println(parole + "\"" + frase + "\"");
        }
        input.close();
        
	}

}



//Scrivere un programma che legga una frase di una riga e quindi mostri la seguente risposta:
//
//Si se la frase termina con un punto interrogativo e il numero di caratteri è pari;
//
//No se la frase termina con un punto interrogativo, ma il numero di caratteri è dispari;
//
//Wow se la frase termina con un punto esclamativo;
//
//le parole Tu dici sempre seguite dalla frase inserita racchiusa tra doppi apici in tutti gli altri casi.
//
//L'output del programma dovrebbe essere contenuto in una sola riga. Si noti che nell'ultimo caso l'output deve comprendere i doppi apici 
//intorno alla stringa. In tutti gli altri casi non devono comparire apici nell'output. Il programma non deve verificare che la frase in input sia sensata.

