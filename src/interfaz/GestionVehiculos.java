package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class GestionVehiculos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionVehiculos window = new GestionVehiculos();
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
	public GestionVehiculos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGestionarClientes = new JButton("Gestionar Coches");
		btnGestionarClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionCoches ventana = new GestionCoches();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarClientes.setBounds(27, 92, 161, 23);
		frame.getContentPane().add(btnGestionarClientes);
		
		JButton btnGestionarJefes = new JButton("Gestionar Motos");
		btnGestionarJefes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GestionMotos ventana = new GestionMotos();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarJefes.setBounds(245, 92, 161, 23);
		frame.getContentPane().add(btnGestionarJefes);
		
		JButton btnGestionarMecanico = new JButton("Gestionar Furgoneta");
		btnGestionarMecanico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionFurgonetas ventana = new GestionFurgonetas();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarMecanico.setBounds(120, 145, 161, 23);
		frame.getContentPane().add(btnGestionarMecanico);
		
		JLabel lblGestionDePersionas = new JLabel("GESTION DE VEHICULOS");
		lblGestionDePersionas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGestionDePersionas.setBounds(120, 23, 209, 23);
		frame.getContentPane().add(lblGestionDePersionas);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrincipalInterfaz ventana = new PrincipalInterfaz();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnMenuPrincipal.setBounds(134, 211, 153, 23);
		frame.getContentPane().add(btnMenuPrincipal);
	}
}
