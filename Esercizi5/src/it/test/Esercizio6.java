package it.test;

public class Esercizio6 {

	public static String determinaSegnoZodiacale(int giorno,int mese) {
		String risultato = "";
		if((giorno > 29) && (mese == 2)) {
			
			System.out.println("La data inserita non è valida");
			System.out.println("");
			return risultato;
		} else {
			if(giorno > 20){
				switch(mese) {
				case 1: 
					risultato = "Acquario";
					break;
				case 2: 
					risultato = "Pesci";
					break;
				case 3: 
					risultato = "Ariete";
					break;
				case 4: 
					risultato = "Toro";
					break;
				case 5: 
					risultato = "Gemelli";
					break;
				case 6: 
					risultato = "Cancro";
					break;
				case 7: 
					risultato = "Leone";
					break;
				case 8: 
					risultato = "Vergine";
					break;
				case 9: 
					risultato = "Bilancia";
					break;
				case 10: 
					risultato = "Scorpione";
					break;
				case 11: 
					risultato = "Sagittario";
					break;
				case 12: 
					risultato = "Capricorno";
					break;
					default:
						risultato = "";
				}
			} else {
				switch(mese) {
				case 1: 
					risultato = "Capricorno";
					break;
				case 2: 
					risultato = "Acquario";
					break;
				case 3: 
					risultato = "Pesci";
					break;
				case 4: 
					risultato = "Ariete";
					break;
				case 5: 
					risultato = "Toro";
					break;
				case 6: 
					risultato = "Gemelli";
					break;
				case 7: 
					risultato = "Cancro";
					break;
				case 8: 
					risultato = "Leone";
					break;
				case 9: 
					risultato = "Vergine";
					break;
				case 10: 
					risultato = "Bilancia";
					break;
				case 11: 
					risultato = "Scorpione";
					break;
				case 12: 
					risultato = "Sagittario";
					break;
					default:
						risultato = "";
				}
			}
			return risultato;
		}
	}

}



//Scrivere una classe Java che contiene un metodo determinaSegnoZodiacale che accetta in ingresso una coppia di interi che rappresentano il giorno e il mese di nascita e determina,
//restituendolo in formato stringa, il segno zodiacale di appartenenza.
//
//il metodo deve verificare la correttezza dei valori passati in ingresso (il 30 febbraio per esempio non esiste).
//
//Se i valori non sono corretti, termina l'esecuzione del programma stampandolo a video in un messaggio. Scrivere quindi un programma driver per collaudare il metodo.
//Si ricorda che i segni zodiacali sono i seguenti:
//
//Ariete: 21 marzo - 20 aprile
//
//toro: 21 aprile - 20 maggio
//
//gemelli: 21 maggio- 21 giugno
//
//cancro: 22 giugno- 22 luglio
//
//leone: 23 luglio - 23 agosto
//
//vergine: 24 agosto - 22 settembre
//
//bilancia : 23 settembre - 22 ottobre
//
//scorpione: 23 ottobre - 22 novembre
//
//sagittario: 23 novembre - 21 dicembre
//
//capricorno: 22 dicembre - 20 gennaio
//
//acquario: 21 gennaio - 19 febbraio
//
//pesci: 20 febbraio - 20 marzo 