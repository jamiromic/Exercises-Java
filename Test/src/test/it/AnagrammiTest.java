package test.it;

import java.util.Arrays;

public class AnagrammiTest {
	
	public static boolean anagramma(int array1[], int array2[]) {
		int arrayInvertito[] = new int[array1.length]; 
		boolean controllo = false;
		for (int i = 0; i < array1.length; i++) {
			arrayInvertito[i] = array1[array1.length - 1 - i];
		}
   	 if (array2.equals(arrayInvertito)) {
		return controllo = true;
	} else {
		System.out.println(Arrays.toString(arrayInvertito));
		System.out.println(Arrays.toString(array2));
		return controllo = false;
	}
   	 
    }

	public static void main(String[] args) {
		int array1[] = {1,2,3,4};
		int array2[] = {4,3,2,1};
		System.out.println(AnagrammiTest.anagramma(array1,array2));
	     
	     

	}

}
