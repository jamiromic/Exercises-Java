package it.test;

public class Switch {

	public static void main(String[] args) {
		char voto = 'F';
		double votoNumerico = 0;
		switch(voto) {
		case 'A':
			votoNumerico = 4.0;
		    System.out.println(votoNumerico);
		break;
		case 'B':
			votoNumerico = 3.0;
		    System.out.println(votoNumerico);
		break;
		case 'C':
			votoNumerico = 2.0;
		    System.out.println(votoNumerico);
		break;
		case 'D':
			votoNumerico = 1.0;
		    System.out.println(votoNumerico);
		break;
		case 'F':
			votoNumerico = 0.0;
		    System.out.println(votoNumerico);
		break;
		
		default:
			votoNumerico = 0.0;
			System.out.println("Errore");
		}

	}

}



//Scrivere un'istruzione switch che converta un voto in lettere nel voto numerico equivalente, su una scala di quattro punti. 
//Si assegni alla variabile voto il valore 4.0 per una A, 3.0 per una B, 2.0 per una C, 1.0 per una D, e 0.0 per una F. 
//Per qualsiasi altra lettera si assegni il valore 0,0 e si mostri un messaggio di errore