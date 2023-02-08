package test.it;

public class BambinoScuola {
	
	//Variabili d'istanza
	
	private String nome;
	private int eta;
	private String insegnante;
	private String saluto;
	protected String materia = "Matematica";
	
	public BambinoScuola(String nome, int eta, String insegnante, String saluto) {
		this.nome = nome;
		this.eta = eta;
		this.insegnante = insegnante;
		this.saluto = saluto;
	}
	
	public BambinoScuola() {
		this.nome = "Nessun Nome";
		this.insegnante = "Nessuno vuole insegnargli qualcosa";
		
	}
	
	//Getter & Setter
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEtà() {
		return eta;
	}
	public void setEtà(int età) {
		this.eta = età;
	}
	public String getInsegnante() {
		return insegnante;
	}
	public void setInsegnante(String insegnante) {
		this.insegnante = insegnante;
	}
	public String getSaluto() {
		return saluto;
	}
	public void setSaluto(String saluto) {
		this.saluto = saluto;
	}
	
	

}










//Si crei una classe BambinoScuola che è la classe base per i bambini di una scuola. 
//Questa classe dovrebbe avere gli attributi per il nome e l’età del bambino, il nome dell’insegnante del bambino e una stringa di saluto.
//Questa classe dovrebbe avere appropriati metodi get e set per ognuno degli attributi.
//
//
//
//Si derivi una classe BambinoPrecoce da BambinoScuola, come descritta nel precedente esercizio.
//La nuova classe dovrebbe ridefinire il metodo get per l’età, restituendo l’età attuale aumentata di 2. 
//Essa dovrebbe anche ridefinire il metodo set per la stringa di saluto, restituendo la stringa di saluto del bambino concatenata con le parole “Io sono il migliore”.