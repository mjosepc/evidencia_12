package datos;
import datos.InterfaceDatos;
import modelo.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class DatosTrabajador implements InterfaceDatos {
    private List<Trabajador> listaTrabajadores = new ArrayList<>();

    @Override
    public void agregar(Trabajador trabajador) {
      listaTrabajadores.add(trabajador);
      System.out.println("Trabajador agregado correctamente" + trabajador);
    }
    @Override
    public void editar(Trabajador trabajador) {
        if(existeTrabajador(trabajador.getRut())){
           for(int i = 0; i < listaTrabajadores.size(); i++){
               Trabajador t = listaTrabajadores.get(i);
               if(t.getRut().equals(trabajador.getRut())){
                   listaTrabajadores.set(i, trabajador);
                   System.out.println("Trabajador editado correctamente");
                   return;
               }
           }
        } else {
            System.out.println("No se pudo editar");
        }
    }
    @Override
    public Trabajador leerTrabajador(String rut) {
        for (Trabajador t: listaTrabajadores){
            if (t.getRut().equals(rut)){
                System.out.println("Trabajador encontrado:" + t.getNombre() + " " + t.getApellido());
                return t;
            }
        }
        System.out.println(" No se encontro ningun trabajador");
        return null;
    }
    private boolean existeTrabajador(String rut) {
        for (Trabajador t : listaTrabajadores){
            if (t.getRut().equals(rut)){
                return true;
            }
        } return false;
    }
}