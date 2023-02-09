package test.it;

import java.util.Objects;

public class Dipendente extends Persona {
	private double retribuzioneAnnuale;
	private int annoAssunzione;
	private String numeroIdentificativo;
	
	public Dipendente(String nome, String cognome, int eta, double retribuzioneAnnuale,int annoAssunzione,String numeroIdentificativo) {
		super(nome,cognome,eta);
		this.retribuzioneAnnuale = retribuzioneAnnuale;
		this.annoAssunzione = annoAssunzione;
		this.numeroIdentificativo = numeroIdentificativo;
		
	}

	public double getRetribuzioneAnnuale() {
		return retribuzioneAnnuale;
	}

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}

	public String getNumeroIdentificativo() {
		return numeroIdentificativo;
	}

	public boolean equals(Dipendente altroDipendente) {
		if (this == altroDipendente)
			return true;
		if (altroDipendente == null)
			return false;
		if (getClass() != altroDipendente.getClass())
			return false;
		Dipendente other = (Dipendente) altroDipendente;
		return annoAssunzione == other.annoAssunzione
				&& Objects.equals(numeroIdentificativo, other.numeroIdentificativo)
				&& Objects.equals(getNome(), other.getNome())
				&& Objects.equals(getCognome(), other.getCognome())
				&& getEta() == other.getEta()
				&& Double.doubleToLongBits(retribuzioneAnnuale) == Double.doubleToLongBits(other.retribuzioneAnnuale);
		
	}
	
	
	public static void main(String[] args) {
		Dipendente dipendente1 = new Dipendente("Filippo","Rossi",40,10000.50,2019,"12542");
		Dipendente dipendente3 = new Dipendente("Gino","Pino",20,10000.50,2019,"12542");
		Dipendente dipendente2 = new Dipendente("Paolo","Rossi",35,100000.50,2020,"65442");
		Persona persona1 = new Persona("Filippo","Rossi",40);
		Persona persona2 = new Persona("Paolo","Raggi",30);
		System.out.println(dipendente1.equals(dipendente3));
		System.out.println(dipendente1.getAnnoAssunzione());
		System.out.println(dipendente2.getCognome());
		System.out.println(persona1.equals(dipendente1));
	}
	
	
	

}
