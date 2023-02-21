package test.it;



public class AnagrammiTest {
	
	public static boolean anagramma(int array1[], int array2[]) {
		boolean contains = false;
		int contatoreUguaglianze = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array2[j] == array1[i]) {
					contatoreUguaglianze++;
				} 
			}
			if(contatoreUguaglianze == array2.length) {
				contains = true;
			}
		}
   	 return contains;
    }
	

	public static void main(String[] args) {
		int array1[] = {1,2,3,6,6,1};
		int array2[] = {1,3,2,6,1,3};
		System.out.println(AnagrammiTest.anagramma(array1,array2));
	     
	     

	}

}
