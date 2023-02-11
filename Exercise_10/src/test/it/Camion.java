package test.it;

public class Camion extends Veicolo {
	double capacitàCarico;
	double capacitàCaricoRimorchio;
	
	public Camion(Persona proprietario, String casaAutomobilistica, int cilindriMotore, double capacitàCarico, double capacitàCaricoRimorchio) {
		super(proprietario, casaAutomobilistica, cilindriMotore );
		this.capacitàCarico = capacitàCarico;
		this.capacitàCaricoRimorchio = capacitàCaricoRimorchio;
	}

	public double getCapacitàCarico() {
		return capacitàCarico;
	}

	public double getCapacitàCaricoRimorchio() {
		return capacitàCaricoRimorchio;
	}

	public boolean equals(Camion altroCamion) {
		if (this == altroCamion)
			return true;
		if (altroCamion == null)
			return false;
		if (getClass() != altroCamion.getClass())
			return false;
		Camion other = (Camion) altroCamion;
		return Double.doubleToLongBits(capacitàCarico) == Double.doubleToLongBits(other.capacitàCarico) && Double
				.doubleToLongBits(capacitàCaricoRimorchio) == Double.doubleToLongBits(other.capacitàCaricoRimorchio);
	}
	
	

}
