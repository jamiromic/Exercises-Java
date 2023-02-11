package test.it;

public class EccezionePersonalizzata extends Exception{
	
	public EccezionePersonalizzata(String message) {
		super(message);
	}
	
	public EccezionePersonalizzata() {
		super("Eccezione : L'ora inserita non è valida");
	}
}



//Scrivere una classe di eccezione per indicare che un’ora inserita da un utente non è valida. 
//L’ora deve essere nel formato ore:minuti e seguita da “am” o “pm”.