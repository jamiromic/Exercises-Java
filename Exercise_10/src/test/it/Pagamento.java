package test.it;

public class Pagamento {
	private double importo;
	
	public Pagamento(double importo) {
		this.importo = importo;
	}
	
	
	public void dettagliPagamento() {
		System.out.println("L'importo pagato è di " + this.importo);
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	
	
	
	
	
	
	

}
