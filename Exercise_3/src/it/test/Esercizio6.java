package it.test;

public class Esercizio6 {

	public static void main(String[] args) {
		int temp = 1;
	    
	    String etichetta = (temp == 1) ? "grado" : "gradi";
//	    if(temp == 1) {
//	    	etichetta = "grado";
//	    } else {
//	    	etichetta = "gradi";
//	    }
//	    
	    System.out.println("Ci sono " + temp + " " + etichetta);

	}

}




//Data la variabile int di nome temp contenente una temperatura non negativa, scrivere un'istruzione Java che usi l'operatore condizionale per assegnare
//alla variabile String etichetta il valore "grado" o "gradi". Lo scopo della variabile etichetta è quello di generare un output grammaticamente corretto,
//come per esempio "0 gradi", "1 grado", "2 gradi" e così via.