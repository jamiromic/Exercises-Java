package test.it;

public class EccezioneCartaDaAttivare extends Exception{
	
	public EccezioneCartaDaAttivare() {
		super("La Carta non è ancora attiva");
	}
	
	public EccezioneCartaDaAttivare(String message) {
		super(message);
	}
	

}
