package test.it;

public class BambinoPrecoce extends BambinoScuola{
	private int voto;
	public BambinoPrecoce(int eta, String saluto, String nome, String insegnante, int voto) {
		super(nome,eta,insegnante,saluto);
	    this.voto = voto;
		
	}
	
	public int getEtàBimboPrecoce() {
		return this.getEtà() + 2;
	}
	
	public void setSalutoBimboPrecoce() {
		this.setSaluto(getSaluto() + " Io sono il migliore");
	}
	
	
	public static void main(String[] args) {
		BambinoPrecoce michele = new BambinoPrecoce(10,"Ciao a tutti","Michele","Gino Pino",6);
		System.out.println(michele.getEtàBimboPrecoce());
		System.out.println(michele.getSaluto());
		michele.setSalutoBimboPrecoce();
		System.out.println(michele.getSaluto());
		System.out.println(michele.materia);
	}
	

}
