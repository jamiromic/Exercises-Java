package it.test;

public class Persona {
	
	//Variabili d'istanza
	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private int età;
	
	//Costruttore senza argomenti
	Persona() {
		nome = "Nessun Nome";
		età = 0;
	}
	//Costruttore con argomenti
	Persona(String nomeInput, int etàInput) {
		nome = nomeInput;
		età = etàInput;
	}
	
	/**Metodo statico che restituisce un istanza della classe Persona**/
	public static Persona creaPersonaAdulta() {
		Persona personaAdulta = new Persona("Un adulto", 21);
		return personaAdulta;
		
	}

}




//Si consideri una classe Persona che descrive una generica persona. Questa classe ha una variabile di istanza

//di tipo stringa nome che indica il nome della persona e una variabile di istanza di tipo intero eta, che rappresenta

//l’età di una persona.

//Si scriva un costruttore di default per la classe Persona che assegni “Nessun nome” a nome e 0 a eta.

//Si scriva un secondo costruttore che assegni la stringa fornita in ingresso a nome e l’intero fornito a eta.

//Si scriva un metodo statico creaPersonaAdulta che restituisce un’istanza speciale di questa classe. L’istanza restituita

//rappresenta un generico individuo adulto che ha come nome la stringa “Un adulto” e come eta 21.