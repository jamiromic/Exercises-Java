package test.it;

@SuppressWarnings("serial")
public class EccezioneOraNonValida extends EccezionePersonalizzata{
	
	public EccezioneOraNonValida() {
		super("Il numero inserito non è compreso tra 1 e 12");
	}
}
