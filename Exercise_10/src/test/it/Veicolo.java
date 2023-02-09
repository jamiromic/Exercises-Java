package test.it;

import java.util.Objects;

public class Veicolo {
	private Persona proprietario;
	private String casaAutomobilistica;
	private int cilindriMotore;
	
	public Veicolo(Persona proprietario, String casaAutomobilistica, int cilindriMotore) {
		this.proprietario = proprietario;
		this.casaAutomobilistica = casaAutomobilistica;
		this.cilindriMotore = cilindriMotore;
	}

	public Persona getProprietario() {
		return proprietario;
	}

	public String getCasaAutomobilistica() {
		return casaAutomobilistica;
	}
	
	public int getCilindriMotore() {
		return cilindriMotore;
	}

	public boolean equals(Veicolo altroVeicolo) {
		if (this == altroVeicolo)
			return true;
		if (altroVeicolo == null)
			return false;
		if (getClass() != altroVeicolo.getClass())
			return false;
		Veicolo other = (Veicolo) altroVeicolo;
		return Objects.equals(casaAutomobilistica, other.casaAutomobilistica) && cilindriMotore == other.cilindriMotore
				&& Objects.equals(proprietario, other.proprietario);
	}
	
	

}
