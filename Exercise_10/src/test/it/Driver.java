package test.it;

public class Driver {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Gianni","Bianchi",27);
		Persona persona2 = new Persona("Laura","Pausini",22);
		Veicolo veicolo1 = new Veicolo(persona1,"Fiat",5);
		Camion camion1 = new Camion(persona2,"Fiat",6,80.0,120.0);
		System.out.println(veicolo1.getProprietario().getNome()+ " " + veicolo1.getProprietario().getCognome() );
		System.out.println(camion1.getCapacitàCaricoRimorchio());
		

	}

}
