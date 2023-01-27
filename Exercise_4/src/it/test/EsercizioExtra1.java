package it.test;

public class EsercizioExtra1 {

	public static void main(String[] args) {
		// Frase iniziale
		String frase = "ciao sono michele e";
		//Calcolo prima parola
		//Salvo il primo indice
		int index1 = frase.indexOf(" ");
		//Recupero prima parola
		String parola1 = frase.substring(0,index1);
		
		frase = frase.substring(index1+1);
		
		int index2 = frase.indexOf(" ");
		String parola2 = frase.substring(0,index2);
		frase = frase.substring(index2+1);
		
		int index3 = frase.indexOf(" ");
		String parola3 = frase.substring(0,index3);
		frase = frase.substring(index3+1);
		
		String parola4 = frase;
		System.out.println(parola4 + " " + parola3 + " " + parola2 + " " + parola1);
	}

}




//Una parola e' una sequenza di lettere alfabetiche minuscole.Una frase e' una sequenza di parole separate da uno spazio: ad esempio, 
//"oggi ieri e domani" e' una frase costituita da quattro parole separate da tre spazi.
//Data una frase f, la sua inversa per parole e' la frase costituita dalle parole di f in ordine inverso rispetto a f. 
//Ad esempio, l'inversa per parole della frase "oggi ieri e domani" e' la frase "domani e ieri oggi".