package it.test;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire Tre numeri");
		
		int numero1 = input.nextInt();
		int numero2 = input.nextInt();
		int numero3 = input.nextInt();
		
		if(numero1 >=0 && numero2 >=0 && numero3 >=0 ) {
		    if((numero1 < numero2) && (numero2 < numero3)){            // Numero 3 - 2 - 1
				System.out.println(numero3 + " " + numero2 + " " + numero1);
			}
			else if((numero2 < numero1) && (numero3 < numero2)) {      // Numero 1 - 2 - 3
				System.out.println(numero1 + " " + numero2 + " " + numero3);
			}
			else if((numero1 < numero3) && (numero2 < numero1)) {      // Numero 3 - 1 - 2
				System.out.println(numero3 + " " + numero1 + " " + numero2);
			}
			else if((numero3 > numero2) && (numero3 < numero1)) {      //Numero 1 - 3 - 2
				System.out.println(numero1 + " " + numero3 + " " + numero2);
			}
			else if((numero2 > numero1) && (numero1 > numero3)) {      //Numero 2 - 1 - 3
				System.out.println(numero2 + " " + numero1 + " " + numero3);
			} 
			else if((numero2 > numero3) && (numero3 > numero1)) {      //Numero 2 - 3 - 1
				System.out.println(numero2 + " " + numero1 + " " + numero3);
			} 
		    
		    input.close();
				
					
				
			
				
				
				
		}else {
			System.out.println("Input non valido");
		}
		
		

	}

}
