package test.it;

public class CollaudoEccezioni3 {

	public static void main(String[] args) {
		CartaBrano carta1 = new CartaBrano(1);
		carta1.attivaCarta();
		carta1.getBrani();
		carta1.compraBrano();
		carta1.getBrani();
		carta1.compraBrano();

	}

}
