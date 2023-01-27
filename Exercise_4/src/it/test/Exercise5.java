package it.test;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		boolean risposta = true;
		
		while (risposta) {	
			Scanner input = new Scanner(System.in);
			System.out.println("Vuoi giocare?");
			String vuoiGiocare = input.nextLine();
			
			if(!vuoiGiocare.equals("s")) {
				risposta = false;
				System.out.println("Partita Finita");
				input.close();
			} else {
				System.out.println("Inserisci la tua domanda");
				String domanda = input.nextLine();
				int num = (int) (Math.random() * 8) + 1;
				switch (num) {
				case 1:
					System.out.println("E' certo");
					break;
				case 2:
					System.out.println("E' decisamente così");
					break;
				case 3:
					System.out.println("E' molto probabile");
					break;
				case 4:
					System.out.println("I segni indicano di si");
					break;
				case 5:
					System.out.println("E' difficile rispondere, prova di nuovo");
					break;
				case 6:
					System.out.println("Rifai la domanda più tardi");
					break;
				case 7:
					System.out.println("Non ci contare");
					break;
				case 8:
					System.out.println("Le mie fonti dicono di no");
					break;
				default: 
					System.out.println("Risposta non corretta");
					
				}
				
			}
			
			
			
		}
		
		

	}

}
