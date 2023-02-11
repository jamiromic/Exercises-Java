package test.it;

import java.util.Scanner;

public class Interi {
	private int valoreMinimo;
	private int valoreMassimo;
	private String sollecito;
	
	/** 
	 * Precondizione: il valore inserito dev'essere all'interno di un range definito.
	 * PostCondizione: il valore della variabile inserita in input viene tornato in uscita
	 * @return
	 */
	public int getValore() {
		System.out.println(this.sollecito);
		boolean controllo = true;
		int valoreEsatto = 0;
		while(controllo) {
			Scanner input = new Scanner(System.in);
			int valoreCompreso = input.nextInt();
			input.close();
			if((valoreCompreso > this.valoreMinimo) && (valoreCompreso < this.valoreMassimo)) {
				controllo = false;
				valoreEsatto = valoreCompreso;
			}
		}
		return valoreEsatto;
		
	}

	public int getValoreMinimo() {
		return valoreMinimo;
	}

	public void setValoreMinimo(int valoreMinimo) {
		this.valoreMinimo = valoreMinimo;
	}

	public int getValoreMassimo() {
		return valoreMassimo;
	}

	public void setValoreMassimo(int valoreMassimo) {
		this.valoreMassimo = valoreMassimo;
	}

	public String getSollecito() {
		return sollecito;
	}

	public void setSollecito(String sollecito) {
		this.sollecito = sollecito;
	}

	public static void main(String[] args) {
		

	}

}
