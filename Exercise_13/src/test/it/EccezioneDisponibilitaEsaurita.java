package test.it;

public class EccezioneDisponibilitaEsaurita extends Exception {
	
	public EccezioneDisponibilitaEsaurita() {
		super("Carta senza disponibilit√†");
	}
	
	public EccezioneDisponibilitaEsaurita(String message) {
		super(message);
	}
	

}
