package it.exercises;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int temperatura[] = new int[10];
		int mediaTemperatura = 0;
		int sommaTemperature = 0;
		int giorniSottoMedia = 0;
		for(int i = 0; i < temperatura.length; i++) {
			System.out.println("Inserire una temperatura");
			temperatura[i] = input.nextInt();
			sommaTemperature += temperatura[i];
		}
		mediaTemperatura = sommaTemperature / temperatura.length;
		for(int element : temperatura) {
			if(element < mediaTemperatura) {
     			giorniSottoMedia += 1;
			}
		}
		System.out.println("I giorni in cui la temperatura è stata sotto la media sono stati : "+ giorniSottoMedia);
		input.close();
		
	}

}



//Scrivere un programma in una classe NumeriSottoLaMedia che conti il numero di 
//giorni in cui la temperatura è al di sotto della media. Leggere 10 temperature da
//tastiera e memorizzarle in un array. Calcolare la temperatura medie e contare e
//visualizzare il numero di giorni in cui la temperatura è al di sotto della media.