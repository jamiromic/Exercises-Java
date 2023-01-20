package test.it;

import java.util.Scanner;

public class CestinoUovaInput {

	public static void main(String[] args) {
        int numeroCestini, uovaNelCestino, totaleUova;
        
        System.out.println("Quanti cestini ci sono?");
        
        Scanner tastiera = new Scanner(System.in);
        
		numeroCestini = tastiera.nextInt();
		
        System.out.println("Quanti uova ci sono in ogni cestino?");
        
		uovaNelCestino = tastiera.nextInt();
		
		totaleUova = numeroCestini * uovaNelCestino;
		
		System.out.println("Se hai " + numeroCestini + " cestini");
		System.out.println("e per ogni cestino ci sono " + uovaNelCestino + " uova");
		System.out.println("Ci sono " + totaleUova + " uova totali");
		
	    tastiera.close();

	}

}
