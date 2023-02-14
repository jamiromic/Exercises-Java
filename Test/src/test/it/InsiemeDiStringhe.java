package test.it;

public class InsiemeDiStringhe {
	private String array[];
	public InsiemeDiStringhe(String T[]) {
		this.array = T;
	}
	
	public String stringaLunga(String array[]) {
		int contatoreLunghezzaStringa = 0;
		String stringaLunghezzaMassima = "";
		for(String elementString : array) {
			if(elementString.length() > contatoreLunghezzaStringa) {
				contatoreLunghezzaStringa = elementString.length();
				stringaLunghezzaMassima = elementString;
			}
		}
		return stringaLunghezzaMassima;
	}
	
	public String spaziStringa(String array[]) {
		int contatoreSpaziStringa = 0;
		String stringaNumeroSpaziMaggiore = "";
		for(String elementString : array) {
			int numeroSpazi = elementString.length() - elementString.replaceAll(" ", "").length();
			if(numeroSpazi > contatoreSpaziStringa) {
				stringaNumeroSpaziMaggiore = elementString;
			}
		}
		return stringaNumeroSpaziMaggiore;
	}
	
	public void preStringa(String array[], String prefisso) {
		String stringaConPrefissoString = "";
		for(String elementString : array) {
			if(elementString.startsWith(prefisso)) {
				stringaConPrefissoString = elementString;
			}
		}
		System.out.println(stringaConPrefissoString);
	}
	
	

}
