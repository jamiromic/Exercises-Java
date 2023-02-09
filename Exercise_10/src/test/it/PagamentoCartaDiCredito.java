package test.it;

public class PagamentoCartaDiCredito extends Pagamento{
	private String nomeCarta;
	private String dataScadenza;
	private String numeroCarta;
	
	public PagamentoCartaDiCredito(double importo, String nomeCarta, String dataScadenza, String numeroCarta) {
		super(importo);
		this.nomeCarta = nomeCarta;
		this.dataScadenza = dataScadenza;
		this.numeroCarta = numeroCarta;
	}
	
	
	public String getNomeCarta() {
		return nomeCarta;
	}


	public String getDataScadenza() {
		return dataScadenza;
	}


	public String getNumeroCarta() {
		return numeroCarta;
	}

	
	public void dettagliPagamento() {
		System.out.println(getImporto() + " - Il pagamento è con carta");
		System.out.println("Titolare della carta è : " + this.nomeCarta);
		System.out.println("La data di scadenza è : " + this.dataScadenza);
		System.out.println("Il numero della carta è : " + this.numeroCarta);
	}
	
	
	public static void main(String[] args) {
		PagamentoContanti pagamentoContante1 = new PagamentoContanti(10.20);
		PagamentoContanti pagamentoContante2 = new PagamentoContanti(15.60);
		PagamentoCartaDiCredito pagamentoCarta1 = new PagamentoCartaDiCredito(12.80, "Mastercard", "31/10/2025", "5032 2420 8246 1125");
		PagamentoCartaDiCredito pagamentoCarta2 = new PagamentoCartaDiCredito(18.40, "Visa", "30/05/2024", "8072 5780 7126 0185");
		
		pagamentoContante1.dettagliPagamento();
		pagamentoContante2.dettagliPagamento();
		pagamentoCarta1.dettagliPagamento();
		pagamentoCarta2.dettagliPagamento();
		
		
		
		
		
	}

}
