package test.it;

import java.util.*;

public class CollaudoEccezioni2 {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Inserisci i minuti");
			int minuti = input.nextInt();
			System.out.println("Inserisci l'ora");
			int ora = input.nextInt();
			input.close();
			if(minuti > 59) 
				throw new EccezioneMinutiOltreSessanta();
			if(ora > 12)
				throw new EccezioneOraNonValida();
			
		} catch(EccezioneMinutiOltreSessanta e) {
			System.out.println(e.getMessage());
		} catch(EccezioneOraNonValida e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("Il tipo inserito non è di tipo intero");
		}

	}

}
