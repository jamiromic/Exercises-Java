package it.exercises;

public class Esercizio6 {

	public static void main(String[] args) {
		

	}
	
	public static int[] rimuovi(int v,int[] array) {
		int lunghezzaArray = array.length;
		for(int element : array) {
			if(v == element) {
				lunghezzaArray -= 1;
			} else {
				
			}
		}
	}

}


//Scrivere un metodo statico rimuovi(int v, int[] in) che restituisce 
//un nuovo array con gli interi presenti nell'array passato come argomento, 
//ma con il valore v rimosso. Per esempio, se v è 3 e in 
//contiene 0,1,3,2,3,0,3,1, il metodo restituirà 
//un array contenente 0, 1, 2, 0, 1.


