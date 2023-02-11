package test.it;

import java.util.Scanner;

public class CollaudoEccezioni {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Inserisci l'orario");
			String orario = input.next();
			if(!orario.contains(":"))
				throw new EccezionePersonalizzata("Eccezione : manca il seguente carattere ':' ");
			if((!orario.contains("am")) && (!orario.contains("pm")))
				throw new EccezioneFasciaOrariaMancante("Eccezione : manca l'indicazione della fascia oraria 'am' o 'pm' ");
			
			
		} catch(EccezionePersonalizzata e) {
			System.out.println(e.getMessage());
		} catch(EccezioneFasciaOrariaMancante e) {
			System.out.println(e.getMessage());
		}
	}

}
