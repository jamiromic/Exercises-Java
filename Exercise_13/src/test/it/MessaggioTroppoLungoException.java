package test.it;

public class MessaggioTroppoLungoException extends Exception {
	
	public MessaggioTroppoLungoException() {
		super("Eccezione: Messaggio troppo lungo");
	}
	
	public MessaggioTroppoLungoException(String messaggio) {
		super(messaggio);
	}

}
