package test.it;

import java.util.Objects;

public class IndirizzoPersona {
	public String nome;
	public String cognome;
	private String email;
	private String numeroTelefono;
	
	/**Ottengo Nome**/
	public String getNome() {
		return nome;
	}
	/**Ottengo Cognome**/
	public String getCognome() {
		return cognome;
	}
	/**Ottengo Email**/
	public String getEmail() {
		return email;
	}
	/**Setto email**/
	public void setEmail(String email) {
		this.email = email;
	}
	/**Ottengo Numero Telefono**/
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	/**Setto Numero Telefono**/
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	//Verifico se due istanze sono uguali in base al nome//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IndirizzoPersona other = (IndirizzoPersona) obj;
		return Objects.equals(nome, other.nome);
	}
	
	public static void main(String[] args) {
		IndirizzoPersona persona1 = new IndirizzoPersona();
		IndirizzoPersona persona2 = new IndirizzoPersona();
		persona1.nome = "Michele";
		persona2.nome = "Fabio";
		persona1.setEmail("ciao@ciao.it");
		persona1.setNumeroTelefono("326-125125");
		persona2.setEmail("ciaociao@ciao.it");
		persona2.setNumeroTelefono("326-425145");
		System.out.println(persona1.equals(persona2));
		
	}
	
	
	

}


