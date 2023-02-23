package test.it;

import java.util.Arrays;

public class AnagrammiTest {
	
	public static boolean anagramma(int array1[], int array2[]) {
		boolean sonoUguali = false;
        //Controllo se i due array hanno la stessa lunghezza
		if (array1.length != array2.length) {
            sonoUguali = false;
        }
        else {
        	//Ordino gli interi all'interno dei due array in ordine crescente
            Arrays.sort(array1);
            Arrays.sort(array2);
            //Confronto i due array ordinati
            if (Arrays.equals(array1, array2)) {
                sonoUguali = true;
            }
            else {
                sonoUguali = false;
            }
        }
		return sonoUguali;
	}

		
	public static void main(String[] args) {
<<<<<<< HEAD
		int array1[] = {3,2,1,6,6,1};
		int array2[] = {1,3,2,6,6,1};
		System.out.println(AnagrammiTest.anagramma(array1,array2));     
=======
		int array1[] = {1,2,3,6,6,1};
		int array2[] = {1,3,2,6,1,3};
		System.out.println(AnagrammiTest.anagramma(array1,array2));
	     
	     
>>>>>>> branch 'main' of https://github.com/jamiromic/Exercises-Java.git

	}

}
