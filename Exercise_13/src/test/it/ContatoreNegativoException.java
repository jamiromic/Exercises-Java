package test.it;

public class ContatoreNegativoException extends Exception{
	
	public ContatoreNegativoException() {
		super("La stanza è vuota, non puoi eliminare nessuno");
	}
	
	public ContatoreNegativoException(String message) {
		super(message);
	}
	

}
