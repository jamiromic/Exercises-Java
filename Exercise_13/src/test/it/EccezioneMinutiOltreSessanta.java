package test.it;

public class EccezioneMinutiOltreSessanta extends EccezionePersonalizzata {
	
	public EccezioneMinutiOltreSessanta() {
		super("Il numero dei minuti non può essere superiore a 60");
	}
	
	public EccezioneMinutiOltreSessanta(String message) {
		super(message);
	}
	

}
