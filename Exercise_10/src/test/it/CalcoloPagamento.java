package test.it;

public class CalcoloPagamento {
	
	//Variabile 
	private final double TARIFFA_ORARIA;
	
	public CalcoloPagamento() {
		TARIFFA_ORARIA = 2.50;
	}
	
	
	public double calcolaPagamento(int ore) {
		return TARIFFA_ORARIA * ore;
	}
	
	
	public double getTariffa() {
		
		return this.TARIFFA_ORARIA;
	}

}
