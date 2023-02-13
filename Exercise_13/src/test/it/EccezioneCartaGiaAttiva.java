package test.it;

public class EccezioneCartaGiaAttiva extends Exception {
	
	public EccezioneCartaGiaAttiva() {
		
		super("Eccezione: La Carta risulta già attiva");
		
	}
	
	public EccezioneCartaGiaAttiva(String message) {
		super(message);
	}

}
