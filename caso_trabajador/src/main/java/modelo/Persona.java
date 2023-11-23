package modelo;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected String rut;

	public Persona(String nombre, String apellido, String rut) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;

		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
}