package test.it;

import java.util.Objects;

public class Dottore extends Persona{
	String specializzazione;
	double parcella;
	
	public Dottore(String nome, String cognome, int eta, String specializzazione, double parcella) {
		super(nome,cognome,eta);
		this.specializzazione = specializzazione;
		this.parcella = parcella;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public double getParcella() {
		return parcella;
	}

	public boolean equals(Dottore altroDottore) {
		if (this == altroDottore)
			return true;
		if (altroDottore == null)
			return false;
		if (getClass() != altroDottore.getClass())
			return false;
		Dottore other = (Dottore) altroDottore;
		return Double.doubleToLongBits(parcella) == Double.doubleToLongBits(other.parcella)
				&& Objects.equals(specializzazione, other.specializzazione);
	}
	
	public static void main(String[] args) {
		Dottore dottore1 = new Dottore("Ciccio","Doctor",30,"Ginecologo",150.00);
		Dottore dottore2 = new Dottore("Dario","Conti",20,"Cardiologo",160.00);
		System.out.println(dottore1.getEta());
		System.out.println(dottore1.getParcella());
		System.out.println(dottore2.getSpecializzazione());
		System.out.println(dottore1.equals(dottore2));
	}
	
	
	

}
