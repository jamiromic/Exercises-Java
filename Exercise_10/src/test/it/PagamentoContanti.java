package test.it;

public class PagamentoContanti extends Pagamento{
	
	public PagamentoContanti(double importo) {
		super(importo);
		
	}
	
	public void dettagliPagamento() {
		System.out.println("L' importo pagato di euro " + getImporto() + " E' stato pagato in contanti");
	}

}
