package test.bindingdinamico;

public class VenditaScontata extends Vendita{
	private double sconto;
	
	public VenditaScontata() {
		super();
		sconto = 0;
	}
	
	public VenditaScontata(String ilNome, double ilPrezzo, double loSconto) {
		super(ilNome, ilPrezzo);
		setSconto(loSconto);
			
		
	}
	
	public VenditaScontata(VenditaScontata oggettoOriginale) {
		super(oggettoOriginale);
		sconto = oggettoOriginale.sconto;
	}
	
	public static void annuncio() {
		System.out.println("Questa è la classe VenditaScontata");
	}
	
	public double totale() {
		double frazione = sconto / 100;
		return (1 - frazione) * getPrezzo();
	}
	
	

	public double getSconto() {
		return sconto;
	}

	public void setSconto(double nuovoSconto) {
		if(nuovoSconto >= 0) {
			sconto = nuovoSconto;
		} else {
			System.out.println("Errore : Sconto negativo");
			System.exit(0);
		}
	}
	
	
	
	

}
