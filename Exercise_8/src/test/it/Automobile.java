package test.it;

public class Automobile {
	//Variabili di istanza
	String modello;
	private double consumoKmLitro;
	private double serbatoio = 0;
	
	
	//metodi di istanza
	
	/**Metodo che calcola consumo carburante per un percorso, e aggiorna il livello del serbatoio**/
	public void drive(int distanza) {
		double consumoCarburantePerPercorso = distanza / this.consumoKmLitro;
		if(this.serbatoio > consumoCarburantePerPercorso ) {
			this.serbatoio = this.serbatoio - consumoCarburantePerPercorso;
		} else {
			System.out.println("Non hai abbastanza carburante per questo tragitto, vai al rifornimento");
		}
	}

    /**Ottenere dato con il livello del serbatoio**/
	public double dammiCarburante() {
		return serbatoio;
	}
    /**Incrementa il livello del serbatoio aggiungendo carburante**/
	public void faiRifornimento(double carburante) {
		this.serbatoio = this.serbatoio + carburante;
	}
    /**Setta il dato Consumo Litri per Km**/
	public void setConsumoKmLitro(double consumoKmLitro) {
		this.consumoKmLitro = consumoKmLitro;
	}
	
    //Collaudo
	public static void main(String[] args) {
		Automobile automobile1 = new Automobile();
		automobile1.modello = "Audi";
		automobile1.setConsumoKmLitro(20.0);
		automobile1.faiRifornimento(50.0);
		System.out.println(automobile1.dammiCarburante());
		automobile1.drive(100);
		System.out.println(automobile1.dammiCarburante());
	}
}




//Progettare una classe che rappresenta una automobile. Ogni automobile è caratterizzata da un: consumo di carburante (litri/chilometro), 
//quantità di carburante presente nel serbatoio. Inizialmente il serbatoio è vuoto.
//I metodi della classe sono: metodo drive per simulare il percorso di un’automobile per una certa distanza, riducendo di conseguenza il livello di carburante nel suo serbatoio;
//metodo dammiCarburante che ritorna il livello del carburante; metodo faiRifornimento, per fare rifornimento. 
//Il metodo drive non può essere invocato per una distanza maggiore di quella percorribile con il carburante disponibile.


