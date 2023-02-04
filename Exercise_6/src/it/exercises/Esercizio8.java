package it.exercises;

public class Esercizio8 {

	public static void main(String[] args) {
		String lettera[] = {"a","b","c","d"};
		String nuovoArray[] = upperCase(lettera);
		for(String element : nuovoArray) {
			System.out.print(element);
		}
	
	
		
	}
	
	public static String[] upperCase(String arrayLowerCase[]){ 
		String lettera[] = new String[4];
		for(int i = 0; i < arrayLowerCase.length; i++) {
			lettera[i] = arrayLowerCase[i].toUpperCase();
		}
		return lettera;
		
	}

}



//Scrivere un metodo, chiamato upperCase, che, dato in input un array di 4 lettere alfabetiche minuscole restituisca l'array delle 4 lettere in maiuscolo.
//
//ESEMPI
//
//Input: {'a','b','c','d'}
//
//Output: {'A','B','C','D'}
//
//Input: {'r','o','m','e'}
//
//Output: {'R','O','M','E'}
//
//Input: {'l','o','v','e'}
//
//Output: {'L','O','V','E'}