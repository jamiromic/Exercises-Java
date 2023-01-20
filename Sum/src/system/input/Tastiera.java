package system.input;

import java.util.Scanner;             

public class Tastiera {

	public static void main(String[] args) {
		System.out.println("Ciao");                                       
		System.out.println("Esegui la somma di questi 2 numeri");         
		System.out.println("Inserisci il Primo Numero");                                                                             
		Scanner tastiera = new Scanner(System.in);                       
		int n1 = tastiera.nextInt();                                         
		System.out.println("Inserisci il Secondo Numero");                                                          
		int n2 = tastiera.nextInt();                                        
		System.out.println("La somma dei 2 numeri è :");                 
		System.out.println(n1 + n2);   
		tastiera.close();
	}

}
