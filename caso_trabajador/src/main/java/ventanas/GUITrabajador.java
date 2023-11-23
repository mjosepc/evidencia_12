package ventanas;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITrabajador extends JFrame implements ActionListener {

	private JButton botonLeer;
	private JButton botonEditar;
	private JButton botonAgregar;
    public GUITrabajador(){
		super("Ventana Trabajador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);

		setLayout(new FlowLayout());
		botonAgregar = new JButton("Agregar trabajador ");
		botonLeer = new JButton("Leer Trabajador");
		botonEditar = new JButton("Editar Trabajador");

		botonEditar.addActionListener(this);
		botonLeer.addActionListener(this);
		botonAgregar.addActionListener(this);

		add(botonLeer);
		add(botonEditar);
		add(botonAgregar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonLeer) {
			ventanaLeer guiLeerTrabajador = new ventanaLeer();
			guiLeerTrabajador.setVisible(true);

		} else if (e.getSource() == botonEditar){
			ventanaEditar guiEditarTrabajador = new ventanaEditar();
			guiEditarTrabajador.setVisible(true);

		}  else if (e.getSource() == botonAgregar) {

			ventanaAgregar guiAgregarTrabajador = new ventanaAgregar();
			guiAgregarTrabajador.setVisible(true);
		}
	}
}