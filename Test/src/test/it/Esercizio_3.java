package test.it;

import java.util.Arrays;

public class Esercizio_3 {
	
	public static int[] sum(int array1[], int array2[]) {
		int somma[] = new int[array1.length];
   	 for(int i = 0; i < array1.length; i++)  {
   		 int sommaNumero = array1[i] + array2[i];
   		 somma[i] = sommaNumero;
   		 
   	 }
   	 return somma;
    }

	public static void main(String[] args) {
		int array1[] = {1,2,3,4};
		int array2[] = {4,3,2,1};
	    int risultato[] = Esercizio_3.sum(array1, array2);
	    System.out.println(Arrays.toString(risultato));
	}

}
