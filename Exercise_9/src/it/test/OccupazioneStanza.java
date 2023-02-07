package it.test;

public class OccupazioneStanza {
	
	private int numeroNellaStanza;
	private static int numeroTotale;
	
	
	public void aggiungiUnoAllaStanza() {
		this.numeroNellaStanza++;
		numeroTotale++;
	}
	
	public void rimuoviUnoAllaStanza() {
		if(this.numeroNellaStanza > 0) {
			this.numeroNellaStanza--;
			numeroTotale--;
		} else {
			System.out.println("La stanza è vuota");
		}
	}

	public int getNumeroNellaStanza() {
		return numeroNellaStanza;
	}

	public static int getNumeroTotale() {
		return numeroTotale;
	}

	
	
	
	
	

}
