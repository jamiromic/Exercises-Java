package it.exercises;

public class Esercizio3 {

	public static void main(String[] args) {
		double arrayTrue[] = {10.10, 12.15, 15.23, 17.25, 19.30}; 
		double arrayFalse[] = {10.10, 9.15, 15.23, 7.25, 19.30};
		System.out.println("Il metodo restitutisce il seguente valore : " + strettamenteCrescente(arrayFalse));

	}
	
	public static boolean strettamenteCrescente(double[] array) {
		double elementoPrecedente = 0;
		boolean risultato = true;
		for(double element : array) {
			if(element > elementoPrecedente) {
				elementoPrecedente = element;
			} else {
				risultato = false;
			}
		}
		return risultato;
	}

}



//Scrivere un metodo statico strettamenteCrescente(double[] in) che restituisce true se ogni valore dell'array fornito in ingresso è maggiore del valore che lo precede, 
//altrimenti restituisce false