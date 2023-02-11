package it.exercises;

import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] nomi = {"Michele Marini", "Andrea Villa", "Gianni Torre", "Francesco Carini"};
		String[] numeriTel = {"333-8000","333-2323","333-6150","328-2352"};
		System.out.println("Digita il nome da cercare.");
		String nomeTarget = input.nextLine();
		String telTarget = cercaNome(nomeTarget,nomi,numeriTel);
		System.out.println(telTarget);
		input.close();
	}
	
	
	public static String cercaNome(String nomeTarget, String nomi[], String numeriTel[] ) {
		
		for(int i = 0; i < nomi.length; i++) {
			 if(nomeTarget.equals(nomi[i])) {
				 return numeriTel[i];
			 }
		}
		return "";
	}

}


//Il seguente codice crea un piccola rubrica telefonica. Un array viene utilizzato per memorizzare una lista di nomi; 
//un altro viene utilizzato per memorizzare i numeri di telefono che sono associati a ciascun nome. 
//Per esempio, il numero di telefono di Michele Marini è 333-8000 e quello di Andrea Villa è 333-2323.
//
//Scrivere un metodo cercaNome in modo che ricerchi e restituisca il numero di telefono associato al nome passato in ingresso. 
//Questo metodo dovrà restituire una stringa vuota se il nome non è presente nella rubrica.
//
//Scanner tastiera = new Scanner(System.in)
//
//String[] nomi = {"Michele Marini", "Andrea Villa", "Gianni Torre", "Francesco Carini"};
//
//String[] numeriTel = {"333-8000","333-2323","333-6150,"328-2352"};
//
//System.out.println("Digita il nome da cercare.");
//
//String telTarget = cercaNome(nomeTarget,nomi,numeriTel);
//
//System.out.println("il numero di telefono è " + telTarget)