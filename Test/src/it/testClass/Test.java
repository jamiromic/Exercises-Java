package it.testClass;

public class Test {
	
    //Creo istanza classe Cane
	//Variabili d'istanza solitamente vengono dichiarate private
	public static void main(String[] args) {
		Cane bobby = new Cane();
		bobby.nome = "Bobby";
		bobby.anni = 7;
		bobby.razza = "BullDog";
		System.out.println("Bobby abbaia : ");
		bobby.abbaia();

	}

}
