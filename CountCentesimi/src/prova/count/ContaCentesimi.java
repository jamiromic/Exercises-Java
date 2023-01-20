package prova.count;

import java.util.*;

public class ContaCentesimi {

	public static void main(String[] args) {
		int centesimi, cinquantacentesimi, venticentesimi, diecicentesimi, cinquecentesimi, duecentesimi, uncentesimo;
		System.out.println("Inserisci il numero di centesimi che vuoi scomporre");
		Scanner tastiera = new Scanner(System.in);
		centesimi = tastiera.nextInt();
		System.out.println("Bene, scompongo ora la cifra che hai scelto, " + centesimi + " centesimi");
		cinquantacentesimi = centesimi / 50;
		centesimi = centesimi % 50;
		venticentesimi = centesimi / 20;
		centesimi = centesimi % 20;
		diecicentesimi = centesimi / 10;
		centesimi = centesimi % 10;
		cinquecentesimi = centesimi / 5;
		centesimi = centesimi % 5;
		duecentesimi = centesimi / 2;
		centesimi = centesimi % 2;
		uncentesimo = centesimi / 1;
		centesimi = centesimi % 1;
		
		System.out.println("Cinquantacentesimi = " + cinquantacentesimi);
		System.out.println("Venticentesimi = " + venticentesimi);
		System.out.println("Diecicentesimi = " + diecicentesimi);
		System.out.println("Cinquecentesimi = " + cinquecentesimi);
		System.out.println("Duecentesimi = " + duecentesimi);
		System.out.println("Uncentesimo = " + uncentesimo);
		
		tastiera.close();
		

	}

}
