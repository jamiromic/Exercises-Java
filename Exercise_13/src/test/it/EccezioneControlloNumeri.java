package test.it;



@SuppressWarnings("serial")
public class EccezioneControlloNumeri extends EccezionePersonalizzata {
	
	public EccezioneControlloNumeri(String message) {
		super(message);
	}
	
	public EccezioneControlloNumeri() {
		super("Il valore inserito non è un numero");
	}

}
