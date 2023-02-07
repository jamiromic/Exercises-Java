package test.it;

public class Esercizio1 {

	public static void main(String[] args) {
		Interi valore = new Interi();
		valore.setValoreMinimo(10);
		valore.setValoreMassimo(80);
		valore.setSollecito("Ciao");
		System.out.println(valore.getValore());
		

	}

}



//Si consideri una classe Java da usare per ricevere dall'utente un intero valido. Un oggetto di questa classe deve avere i seguenti attributi:
//
//valore minimo accettato;
//
//valore massimo accettato;
//
//stringa di sollecito;
//
//inoltre deve avere il seguente metodo:
//
//getValore --- mostra la stringa di sollecito e legge un valore usando la classe Scanner. 
//Se il valore letto non è compreso tra il minimo e il massimo, ripete queste azioni finché non viene inserito un valore accettabile. 
//Il metodo restituisce il valore letto.
//
//Si scrivano le precondizioni e postcondizioni del metodo getValore
//
//Si implementi la classe Java
//
//Si scrivano le istruzioni necessarie per collaudare la classe