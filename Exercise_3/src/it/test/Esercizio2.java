package it.test;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);

        String risposta = tastiera.next();

        boolean  accettato = true; 

        if (risposta.equals("si") || risposta.equals("s")) {
            accettato = true;
            System.out.println(" il valore di accettato è:" + accettato);
        }

        else if (risposta.equals("no") || risposta.equals("n")) {
            accettato = false;
            System.out.println(" il valore di accettato è:" + accettato);
        }
        else {
            System.out.println("valore sconosciuto");
        }
        
        tastiera.close();
        

	}

}
