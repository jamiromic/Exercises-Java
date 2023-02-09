package test.it;

public class PagamentoStraordinario extends CalcoloPagamento {
	public double getPagamento(int ore) {
		return this.calcolaPagamento(ore) * 1.5;
	}
	
	
	public static void main(String[] args) {
		PagamentoStraordinario pagamento1 = new PagamentoStraordinario();
		System.out.println(pagamento1.getPagamento(10));
		PagamentoOrdinario pagamento2 = new PagamentoOrdinario();
		System.out.println(pagamento2.getTariffa());
	}
}


