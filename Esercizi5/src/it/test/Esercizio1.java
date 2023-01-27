package it.test;

public class Esercizio1 {

	public static void main(String[] args) {
		

	}
	
	public static int confronta(int n1, int n2) {
		if(n1 > n2) {
			return n1 - n2;
		} else if (n2 > n1) {
			return n2 - n1;
		} else {
			return 0;
		}
	}

}



//Si realizzi una classe java in cui è definito il metodo confronta che accetta in ingresso due interi e restituisce il primo meno il secondo se il primo è maggiore del secondo,
//oppure restituisce il secondo meno il primo. 
//Scrivere quindi un programma driver per collaudare il metodo