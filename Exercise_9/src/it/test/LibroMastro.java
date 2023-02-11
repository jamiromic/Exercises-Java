package it.test;

public class LibroMastro {
	private int venditeEffettuate;
	@SuppressWarnings("unused")
	private int massimoVendite;
	private double vendite[];
	private static double sommaVendite;
	private static int contatore;
	
	LibroMastro(int massimo) {
		this.massimoVendite = massimo;
		this.vendite = new double[massimo];
		
	}
	
	public void aggiungiVendita(double d) {
		this.vendite[contatore] = d;
		sommaVendite = sommaVendite + d;
		this.venditeEffettuate++;
		contatore++;
	}

	public double[] getVendite() {
		return vendite;
	}

	public int getVenditeEffettuate() {
		return venditeEffettuate;
	}
	
	public double getSommaVendite() {
		return sommaVendite;
	}
	
	public double getMediaVendite() {
		
		return sommaVendite / contatore;
	}
	
	public int getVenditeAlDiSopra(double v) {
		for(double element : this.vendite) {
			@SuppressWarnings("unused")
			int contatore = 0;
			if(element > v) {
				contatore++;
			}
		}
		
		return contatore;
	}
	
	
	public static void main(String[] args) {
		LibroMastro libro1 = new LibroMastro(20);
		libro1.aggiungiVendita(10.50);
		libro1.aggiungiVendita(18.50);
		libro1.aggiungiVendita(10.50);
		System.out.println(libro1.getVenditeEffettuate());
		System.out.println(libro1.getSommaVendite());
		
	}

}


//Definire i seguenti metodi per la classe LibroMastro, come descritto nel precedente esercizio:
//
//getMediaVendite() – restituisce il valore medio di tutte le vendite;
//getVenditeAlDiSopra(v) – restituisce il numero di vendite che hanno un valore superiore a v.



//Creare una classe LibroMastro per registrare le vendite di un negozio. Essa deve avere i seguenti attributi:

//vendite – un array di valori double che corrisponde agli importi di tutte le vendite;

//venditeEffettuate – il numero di vendite effettuate;

//massimoVendite – il massimo numero di vendite che può essere registrato;

//e i seguenti metodi:

//LibroMastro(massimo) – un costruttore che inizializza a massimo il massimo numero di vendite;

//aggiungiVendita(d) – aggiunge una vendita il cui valore è d;

//getNumeroDiVendite – restituisce il numero di vendite effettuate;

//getTotaleVendite – restituisce il valore totale delle vendite.

