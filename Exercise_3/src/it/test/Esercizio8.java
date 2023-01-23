package it.test;

import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Scrivi un breve messaggio");
		String frase = input.nextLine().toLowerCase();
		String console = " console";
		String censore = " censore";
		String magistrato = " magistrato";
		if((frase.contains(console)) || (frase.contains(censore)) || (frase.contains(magistrato))){
			System.out.println("La tua frase contiene una parola indesiderata");
		}else {
			System.out.println(frase + " Non contiene nessuna censura");
		}
        input.close();
	}

}



//Si supponga di dover scrivere un programma che fornisce un servizio di messaggistica per i propri utenti. 
//Si vuole dare agli utenti la possibilità di filtrare i messaggi sulla base di determinate parole indesiderate. 
//Si supponga di considerare le parole console, censore e magistrato parole indesiderate. Scrivere un programma che legga una stringa dalla tastiera e 
//verifichi se essa contiene una delle parole indesiderate. Il programma deve essere in grado di stabilire che anche la parola cEnsore è indesiderata 
//anche se differisce per una maiuscola. Si estenda il programma in modo che escluda solamente le righe che contengono le parole indesiderate prese come 
//parole a se stanti e non come parti di altre parole. La frase Sto aspettando l'ascensore, per esempio, non deve essere filtrata