package modelo;

public class Trabajador extends Persona {

	private String isapre;
	private String afp;

	public String getIsapre() {
		return this.isapre;
	}

	/**
	 * 
	 * @param isapre
	 */
	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public String getAfp() {
		return this.afp;
	}

	/**
	 * 
	 * @param afp
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Trabajador() {
		// TODO - implement Trabajador.Trabajador
		throw new UnsupportedOperationException();
	}

}