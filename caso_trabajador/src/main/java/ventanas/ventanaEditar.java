package ventanas;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ventanaEditar extends JFrame{
    public ventanaEditar() {
        super("Ventana Buscar Trabajador");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);


        JButton botonGuardar = new JButton("Editar Trabajador");

        add(botonGuardar);
    }
}

