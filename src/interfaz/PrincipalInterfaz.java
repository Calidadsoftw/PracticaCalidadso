package interfaz;

import java.awt.EventQueue;
import practica.Personas;
import practica.Vehiculos;
import practica.Trabajos;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalInterfaz {

	private JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalInterfaz window = new PrincipalInterfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincipalInterfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Personas p = new Personas(null,null,null,null,0,0);
		Vehiculos v = new Vehiculos(null,null,null,0,null,null,0,null,0,null,null);
		Trabajos t = new Trabajos(null,null,null,null,0,null);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGestionarPersonas = new JButton("Gestionar Personas");
		btnGestionarPersonas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGestionarPersonas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GestionPersonas ventana = new GestionPersonas();
				GestionPersonas.main(null);
				frame.dispose();
			}
		});
		btnGestionarPersonas.setBounds(139, 138, 153, 23);
		frame.getContentPane().add(btnGestionarPersonas);
		
		JButton btnGestionarVehiculos = new JButton("Gestionar Vehiculos");
		btnGestionarVehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionVehiculos ventana = new GestionVehiculos();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarVehiculos.setBounds(10, 93, 153, 23);
		frame.getContentPane().add(btnGestionarVehiculos);
		
		JButton btnGestionarTrabajos = new JButton("Gestionar Trabajos");
		btnGestionarTrabajos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionTrabajos ventana = new GestionTrabajos();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarTrabajos.setBounds(276, 93, 148, 23);
		frame.getContentPane().add(btnGestionarTrabajos);
		
		JLabel lblBienvenidosAlTaller = new JLabel("BIENVENIDOS AL TALLER");
		lblBienvenidosAlTaller.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBienvenidosAlTaller.setBounds(116, 30, 246, 14);
		frame.getContentPane().add(lblBienvenidosAlTaller);
		
		JButton btnNewButton = new JButton("Cargar Datos");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					p.cargarHistorial();
					v.cargarHistorial();
					t.cargarHistorial();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
								
				
			}
		});
		btnNewButton.setBounds(160, 215, 109, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
