package it.test;

import java.util.Scanner;

public class EsercizioExtra {

	public static void main(String[] args) { 
		// Creo istanza della classe (oggetto) Scanner;
		Scanner input = new Scanner(System.in);                                               
		System.out.println("Inserisci un numero max 4 cifre");
		// Dichiaro variabile di tipo int e la inizializzo con il valore di input
		int num = input.nextInt();    
		// Salvo input originario su altra variabile di tipo int
		int num1 = num;    
		// Isolo singole cifre e riassegno a numero originale il nuovo valore
		int numero1 = num / 1000;                                                             
		num = num % 1000;                                                                     
		int numero2 = num / 100;                                                             
		num = num % 100;                                                                      
		int numero3 = num / 10;                                                              
		num = num % 10;                                                                      
		int numero4 = num;        
		if((numero1 == 0) && (numero2 == 0)) {      
			// Il numero sarà a 2 cifre 
			// Calcolo se la somma dei 2 numeri elevati alla potenza di 2 da il numero che è stato inserito precedentemente
			if((numero3 * numero3) + (numero4 * numero4) == (num1))       
			{
				System.out.println("Questo è un numero di Armstrong");                        
			} else {
				System.out.println("Questo non è un numero di Armstrong");                   
			}
		} else if(numero1 == 0) {                                                             
			// Il numero sarà a 3 cifre 
			// Calcoliamo la stessa somma fatta sopra, ma a 3 numeri
			if((numero2 * numero2 * numero2) + (numero3 * numero3 * numero3) + (numero4 * numero4 * numero4) == (num1)) { 
				System.out.println("Questo è un numero di Armstrong");
			} else {
				System.out.println("Questo non è un numero di Armstrong");
			}	
		} else {
			// Il numero sarà a 4 cifre 
			if((numero1 * numero1 * numero1 * numero1) + (numero2 * numero2 * numero2 * numero2) + (numero3 * numero3 * numero3 * numero3) + (numero4 * numero4 * numero4 * numero4) == (num1)) {
				System.out.println("Questo è un numero di Armstrong");
			} else {
				System.out.println("Questo non è un numero di Armstrong");
			}	
			
		}
		
	    input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}



//Un numero intero positivo n si dice essere un numero di Armstrong se la somma delle sue cifre, ciascuna elevata alla potenza del numero di cifre di n, e' uguale a n.
//Ad esempio, 153 e' un numero di Armstrong, in quanto (111)+(555)+(333)=1+125+27=153, 1634 e' un numero di Armstrong, in quanto 1+1296+81+256=1634, mentre 25 non e' 
//un numero di Armstrong in quanto 4+25=29.
//Scrivere un metodo armstrong che, dato in input un numero intero positivo n di al massimo 5 cifre, restituisca il valore true se e solo se n e' un numero di Armstrong.