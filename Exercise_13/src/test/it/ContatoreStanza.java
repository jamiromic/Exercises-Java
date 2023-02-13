package test.it;

public class ContatoreStanza {
	private int numeroPersone;
	
	//Metodi d'istanza
	
	public void aggiungiPersona() {
		this.numeroPersone++;
	}
	
	public void rimuoviPersona() {
		assert this.numeroPersone != 0 : "La stanza è vuota, non puoi eliminare un elemento"; 
		this.numeroPersone--;
		
		
	}

	public int getContatore() {
		return numeroPersone;
	}
	
	
	

}
