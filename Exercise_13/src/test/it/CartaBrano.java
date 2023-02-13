package test.it;

public class CartaBrano {
	//Variabili d'istanza
	
	private int brani;
	private boolean attivata;
	
	//Costruttori
	public CartaBrano(int n) {
		this.brani = n;
	}
	
	//Metodi d'istanza
	
	public void attivaCarta() {
		try {
			if(this.attivata) {
				throw new EccezioneCartaGiaAttiva();
			} else {
				this.attivata = true;
				System.out.println("La Carta è stata attivata");
			}
		} catch(EccezioneCartaGiaAttiva e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void compraBrano() {
		try {
			if(!this.attivata) {
				throw new EccezioneCartaDaAttivare();
			} else {
				if(this.brani < 1) {
					throw new EccezioneDisponibilitaEsaurita();
				} else {
					this.brani--;
				}
			}
		} catch(EccezioneCartaDaAttivare e) {
			System.out.println(e.getMessage());
		} catch(EccezioneDisponibilitaEsaurita e) {
			System.out.println(e.getMessage());
		}
	}

	public void getBrani() {
		System.out.println("Il numero di brani ancora disponibile è : " + brani);
	}

		
	

}
