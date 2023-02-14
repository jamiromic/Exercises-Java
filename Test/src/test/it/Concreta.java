package test.it;

//Estendo la classe astratta
public class Concreta extends Astratta{
	private double lato;
	
	//Metodo Astratto implementato
	@Override
	public void versoAnimale() {
		System.out.println("Bau");
	}

}
