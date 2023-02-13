package test.it;

public class CollaudoEccezioni4 {

	public static void main(String[] args) {
		ContatoreStanza stanza1 = new ContatoreStanza();
		
			stanza1.aggiungiPersona();
			System.out.println(stanza1.getContatore());
			stanza1.rimuoviPersona();
			System.out.println(stanza1.getContatore());
			System.out.println(stanza1.getContatore());
			stanza1.rimuoviPersona();
				
	}
		

	

}
