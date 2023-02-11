package it.test;

import java.util.Scanner;

public class Caratteristiche {
	String descrizione;
	int punteggio;
	
	Caratteristiche(String descrizione) {
		this.descrizione = descrizione;
		punteggio = 0;
	}
	
	private boolean valido(int punteggio) {
		if(punteggio > 0 && punteggio < 11) {
			return true;
		} else {
			return false;
		}
	}
	
	private void setPunteggio(int punteggio) {
		if(valido(punteggio)) {
			this.punteggio = punteggio;
		} else {
			while(!valido(this.punteggio)) {
				Scanner input = new Scanner(System.in);
				System.out.println("Inserisci il punteggio");
				this.punteggio = input.nextInt();
				input.close();
			}
		}
		
	}

	public int getPunteggio() {
		return punteggio;
	}

	public static void main(String[] args) {
		Caratteristiche caratteristica1 = new Caratteristiche("Amicizia");
		caratteristica1.setPunteggio(11);
		System.out.println(caratteristica1.getPunteggio());
	}
	


}





//Si consideri la classe Caratteristiche da utilizzare in un servizio di appuntamenti on-line e che permette di capire quanto siano compatibili due persone. 
//Gli attributi sono i seguenti:
//
//descrizione – una stringa che identifica le caratteristiche;
//punteggio – un intero da 1 a 10 che indica quanto una persona ricerchi questa caratteristica in un’altra persona
//a. Si scriva un costruttore che assegni una stringa data alla descrizione e che assegni il valore 0 al punteggio per indicare che questo non è stato ancora indicato. 
//b. Si scriva il metodo privato valido(punteggio) che restituisce vero se il punteggio dato è valido e cioè se è compreso tra 1 e 10. 
//c. Si scriva il metodo setPunteggio(punteggio) che legge il punteggio inserito da tastiera, continuando a richiederlo se il punteggio inserito non è valido.