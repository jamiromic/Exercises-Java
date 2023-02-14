package test.bindingdinamico;

public class Vendita {
	private String nome;
	private double prezzo;
	
	public Vendita() {
		nome = "Nessun nome";
		prezzo = 0;
	}
	
	/**Precondizione : il nome è una stringa non vuota, il prezzo è non negativo **/
	
	public Vendita(String ilNome, double ilPrezzo) {
		setNome(ilNome);
		setPrezzo(ilPrezzo);
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nuovoNome) {
		if(nuovoNome != null && nuovoNome != "") {
			nome = nuovoNome;
		} else {
			System.out.println("Errore nome errato");
			System.exit(0);
		}
		
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double nuovoPrezzo) {
		if(nuovoPrezzo >= 0) {
			prezzo = nuovoPrezzo;
		} else {
			System.out.println("Errore : Prezzo negativo.");
			System.exit(0);
		}
		
	}

	public Vendita(Vendita oggettoOriginale) {
		if(oggettoOriginale == null) {
			System.out.println("Errore oggetto vendita : null");
			System.exit(0);
		} else {
			nome = oggettoOriginale.nome;
			prezzo = oggettoOriginale.prezzo;
		}
	}
	
	public static void annuncio() {
		System.out.println("Questa è la classe vendita");
	}
	
	public String toString() {
		return ("Componente = " + nome + " Prezzo e costo totale = E " + prezzo);
	}
	
	public double totale() {
		return prezzo;
	}
	
	public boolean uguaglianzaVendite(Vendita altraVendita) {
		if(altraVendita == null) {
			return false;
			
		} else {
			return (nome.equals(altraVendita.nome) && totale() == altraVendita.totale());
				
			
		}
		
	}
	
	public boolean minoreDi(Vendita altraVendita) {
		if(altraVendita == null) {
			System.out.println("Errore : oggetto vendita è null");
			System.exit(0);
			
		}
		return (totale() < altraVendita.totale());
	}
	
	public boolean equals(Object altroOggetto) {
		if(altroOggetto == null) {
			return false;
			
		} else if(!(altroOggetto instanceof Vendita)) {
			return false;
		}  else {
			Vendita altraVendita = (Vendita)altroOggetto;
			return (nome.equals(altraVendita.nome) && (prezzo == altraVendita.prezzo));
		}
	}

}
