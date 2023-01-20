package test.it;

import java.util.Scanner;

public class Sostituisci {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un Nome");
		String nome = tastiera.next();
		System.out.println("Inserisci un Animale");
		String animale = tastiera.next();
		System.out.println("Inserisci un Colore");
		String colore = tastiera.next();
		System.out.println("Inserisci un Piatto");
		String piatto = tastiera.next();
		String frase = "Ho sognato che Nome aveva mangiato un Animale Colore e aveva detto che sapeva di Piatto.";
        int index1 = frase.indexOf("Nome");
        String frase1 = frase.substring(0,index1);
        int index2 = frase.indexOf("Animale");
        String frase2 = frase.substring(index1+4,index2);
        int index3 = frase.indexOf("Colore");
        String frase3 = frase.substring(index2+7,index3);
        int index4 = frase.indexOf("Piatto");
        String frase4 = frase.substring(index3+6,index4);
        
        
        System.out.println(frase1 + nome + frase2 + animale + frase3 + colore + frase4 + piatto);
        
        tastiera.close();
        
	}

}
