package datos;

import modelo.Trabajador;

public interface InterfaceDatos {

	void editar(Trabajador trabajador);

	Trabajador leerTrabajador(String rut);

	void agregar(Trabajador trabajador);

}