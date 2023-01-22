package it.test;

public class Enumeration {

	public static void main(String[] args) {
		enum TipoMotore {DIESEL,BENZINA,ELETTRICO}
		
		TipoMotore motoreMio;
		
		motoreMio = TipoMotore.DIESEL;
		
		switch(motoreMio) {
		case DIESEL:
			System.out.println("Il mio motore è Diesel");
			break;
		case BENZINA:
			System.out.println("Il mio motore non è Benzina");
			break;
		case ELETTRICO:
			System.out.println("Il motore non è Elettrico");
			break;
	    }
		
		
	}

}
