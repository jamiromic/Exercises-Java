package test.it;

@SuppressWarnings("serial")
public class EccezioneFasciaOrariaMancante extends Exception{
	
	public EccezioneFasciaOrariaMancante() {
		super("Eccezione : manca l'indicazione della fascia oraria 'am' o 'pm'");
		
	}
	
	public EccezioneFasciaOrariaMancante(String message) {
		super(message);
		
	}
	
	

}
