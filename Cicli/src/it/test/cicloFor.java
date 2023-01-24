package it.test;

import java.util.Scanner;

public class cicloFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int somma = 0;
		int tentativi;
	    for (tentativi = 1; somma < 50; tentativi++) {
	    	System.out.println("Inserisci un valore");
	    	somma = somma + input.nextInt();
	    	System.out.println("Totale Provvisorio "+ somma + ", Hai fatto " + tentativi + " tentativi");
	    	if(somma <50) {
	    		System.out.println("Non hai ancora raggiunto i 50");
	    	} else 
	    		input.close();
	    }
	    System.out.println("Bravo, hai raggiunto quota 50");
	}

}
