package it.test;

public class CollaudoOccupazioneStanza {

	public static void main(String[] args) {
		OccupazioneStanza stanza1 = new OccupazioneStanza();
		stanza1.aggiungiUnoAllaStanza();
		stanza1.aggiungiUnoAllaStanza();
		System.out.println(stanza1.getNumeroNellaStanza());
		OccupazioneStanza stanza2 = new OccupazioneStanza();
		stanza2.aggiungiUnoAllaStanza();
		System.out.println(stanza2.getNumeroNellaStanza());
		System.out.println(OccupazioneStanza.getNumeroTotale());
		OccupazioneStanza stanza3 = new OccupazioneStanza();
		stanza3.aggiungiUnoAllaStanza();
		stanza3.aggiungiUnoAllaStanza();
		stanza3.aggiungiUnoAllaStanza();
		System.out.println(stanza3.getNumeroNellaStanza());
		System.out.println(OccupazioneStanza.getNumeroTotale());
		
	}
}
