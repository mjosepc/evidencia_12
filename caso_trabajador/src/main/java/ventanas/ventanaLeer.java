package ventanas;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ventanaLeer extends JFrame{
    public ventanaLeer() {
        super("Ventana Buscar Trabajador");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);

        JButton botonGuardar = new JButton("Buscar Trabajador");

        add(botonGuardar);
    }
}
