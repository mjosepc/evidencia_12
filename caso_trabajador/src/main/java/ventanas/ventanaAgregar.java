package ventanas;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaAgregar extends JFrame{
    public ventanaAgregar() {
        super("Ventana Agregar Trabajador");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);

         // Agregar componentes y lógica para agregar trabajador
         JButton botonGuardar = new JButton("Guardar Trabajador");
         // ... (agregar más componentes según sea necesario)

            add(botonGuardar);
        }
    }

