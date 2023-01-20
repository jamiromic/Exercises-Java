package test.scannertest;

import java.util.Scanner;

public class Input{

  public static void main(String[] args){

      Scanner tastiera = new Scanner(System.in);

      int età;

      String nome;

      System.out.println("Digita la tua età.");

      età = tastiera.nextInt();
      
      System.out.println("Digita il tuo nome completo.");
      
      nome = tastiera.nextLine();

      nome = nome.toUpperCase();

      System.out.println("Il tuo nome in maiuscolo è " + nome + " e hai " + età + " anni");
      
      tastiera.close();

   }

}
