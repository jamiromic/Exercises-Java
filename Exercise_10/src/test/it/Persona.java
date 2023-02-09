package test.it;

import java.util.Objects;

public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	

	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}


	public int getEta() {
		return eta;
	}

	public boolean equals(Persona persona) {
		if (this == persona)
			return true;
		if (persona == null)
			return false;
		if (getClass() != persona.getClass())
			return false;
		Persona other = (Persona) persona;
		return Objects.equals(cognome, other.cognome) && eta == other.eta && Objects.equals(nome, other.nome);
	}
	
	

	
	
	
	

}
