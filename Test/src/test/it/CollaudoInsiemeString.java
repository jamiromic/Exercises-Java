package test.it;

public class CollaudoInsiemeString {

	public static void main(String[] args) {
		String myArray[] = {"Ciao sono Michele","Ciao non ho dormito molto","Spero     "};
		InsiemeDiStringhe insieme1 = new InsiemeDiStringhe(myArray);
		System.out.println(insieme1.stringaLunga(myArray));
		System.out.println(insieme1.spaziStringa(myArray));
		System.out.println(insieme1.preStringa(myArray, "Ciao"));

	}

}
