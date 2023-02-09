package it.test;

import java.util.Scanner;

public class GiocoDelTris {
	//Dichiarato array bidimensionale che contiene il campo del Tris
	private char campo[][] = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
	private char turno = 'O';
	private boolean cicloWhile = true;
	
	

	public void mostraGriglia() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(this.campo[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void turnoGioco() {
		if(!this.cicloWhile) {
			System.out.println("Partita Finita");
			System.exit(0);
		}
		if(this.turno == 'O' ) {
			this.turno = 'X';
			System.out.println("E' il turno di X");
		} else {
			this.turno = 'O';
			System.out.println("E' il turno di O");
		}
	}
	
	public void aggiungiMossa() {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Posiziona la mossa sulla tua colonna");
		 int colonnaScelta = input.nextInt();
		 System.out.println("Posiziona la mossa sulla tua riga");
		 int rigaScelta = input.nextInt();
		 if((this.turno == 'X') && (this.campo[colonnaScelta][rigaScelta] == '-')) {
			this.campo[colonnaScelta][rigaScelta] = 'X';
		 } else if((this.turno != 'X') && (this.campo[colonnaScelta][rigaScelta] == '-')) {
			 this.campo[colonnaScelta][rigaScelta] = 'O';
		 }
		 
	}
	
	public void controlloVincitore() {
		for(int i = 0; i < 3; i++) {
			if((this.campo[i][0] == this.campo[i][1]) && (this.campo[i][1] == this.campo[i][2] ) && (this.campo[i][1] == 'X')) {
				System.out.println("Il giocatore X ha vinto");
				this.cicloWhile = false;
			} else if((this.campo[i][0] == this.campo[i][1]) && (this.campo[i][1] == this.campo[i][2] ) && (this.campo[i][1] == 'O')) {
				System.out.println("Il giocatore O ha vinto");
				this.cicloWhile = false;
			}
			for(int j = 0; j < 3; j++) {
				if((this.campo[0][j] == this.campo[1][j]) && (this.campo[1][j] == this.campo[2][j] ) && (this.campo[1][j] == 'X')) {
					System.out.println("Il giocatore X ha vinto");
					this.cicloWhile = false;
				} else if((this.campo[0][j] == this.campo[1][j]) && (this.campo[1][j] == this.campo[2][j] ) && (this.campo[1][j] == 'O')) {
					System.out.println("Il giocatore O ha vinto");
					this.cicloWhile = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		GiocoDelTris partita1 = new GiocoDelTris();
		while(partita1.cicloWhile) {
			partita1.turnoGioco();
			partita1.aggiungiMossa();
			partita1.mostraGriglia();
			partita1.controlloVincitore();
			
		}
	}
	
	

}
