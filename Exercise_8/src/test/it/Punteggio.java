package test.it;

public class Punteggio {
	//Variabili di Istanza
	private String descrizione;
	private int punteggioMassimo;
	private int punteggio;
	
	//Metodi di Istanza
	
	/**Metodo per settare una descrizione**/
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	/**Metodo per ottenere Punteggio Massimo**/
	public int getPunteggioMassimo() {
		return punteggioMassimo;
	}
	/**Metodo per settare Punteggio Massimo**/
	public void setPunteggioMassimo(int punteggioMassimo) {
		this.punteggioMassimo = punteggioMassimo;
	}
	/**Metodo per ottenere il punteggio**/
	public int getPunteggio() {
		return punteggio;
	}
	/**Metodo per settare il punteggio**/
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	
	@Override
	public String toString() {
		return "Punteggio [punteggio=" + punteggio + "]";
	}
	
	
	

}
