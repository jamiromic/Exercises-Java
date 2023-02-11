package it.test;

public class Ora {
	//Variabili d'istanza
	@SuppressWarnings("unused")
	private int ora;
	@SuppressWarnings("unused")
	private int minuti;
	//Costruttore
	public Ora( ) {
		ora = 0;
		minuti = 0;
	}
	//Metodi d'istanza
	
	/**Metodo Validazione**/
	private boolean valida(int ora, int minuti) {
		if((ora >= 0) && (ora < 24) && (minuti >= 0) && (minuti < 60)){
			return true;
		} else {
			return false;
		}
	}
	
	/**Metodo Settare Orario**/
	public void setOra(int ora, int minuti) {
		if(valida(ora, minuti)) {
			this.ora = ora;
			this.minuti = minuti;
		}
	}
	
	/**Metodo Settare Orario ed AM**/
	public void setOra(int ora, int minuti, boolean AM) {
		if(valida(ora, minuti)) {
			this.ora = ora;
			this.minuti = minuti;
			if(ora < 13) {
				AM = true;
			} else {
				AM = false;
			}
		}
	}
	
	
//	Si consideri la classe Ora che rappresenta una certa ora del giorno. Questa classe ha delle variabili di istanza per rappresentare l’ora e i minuti. 
//	Il valore delle ore varia da 0 a 23. I minuti variano da 0 a 59.
//
//	Si scriva un costruttore di default che inizializza l’ora a 0 ore e 0 minuti.
//	Si scriva un metodo privato valida(ore, minuti) che restituisce il valore true se i valori passati sono validi.
//	Si scriva il metodo setOra(ore, minuti) che assegna l’ora data se i valori passati sono validi.
//	Si scriva un altro metodo setOra(ore, minuti, AM) che assegna l’ora data se i valori sono validi. Il parametro ore deve essere nel range 1-12. 
//	Il parametro AM è true se le ore sono mattutine, altrimenti deve essere false.
	
	
	
	

}
