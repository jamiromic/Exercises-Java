package it.testmethod;

public class methods {

	public static void main(String[] args) {
		System.out.println("Prova metodi....");
		saluta();     //Invocazione Metodo
	}
	
	public static void saluta() {            // Definizione Metodo tipo Void
		System.out.println("Ciao Michele"); // Void : Non ritorna alcun valore
	}
	
//	
//	E' possibile utilizzare il metodo al di fuori da questa classe
//	invocandolo così : methods.saluta(;)
//	perchè la classe methods ha in dotazione il metodo saluta()
//	per questo scriviamo methods.saluta();

}
