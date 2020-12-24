package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class GestionPersonas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionPersonas window = new GestionPersonas();
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
	public GestionPersonas() {
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
		
		JButton btnGestionarClientes = new JButton("Gestionar Clientes");
		btnGestionarClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionClientes ventana = new GestionClientes();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarClientes.setBounds(27, 73, 161, 23);
		frame.getContentPane().add(btnGestionarClientes);
		
		JButton btnGestionarJefes = new JButton("Gestionar Jefes");
		btnGestionarJefes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GestionJefes ventana = new GestionJefes();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarJefes.setBounds(243, 73, 161, 23);
		frame.getContentPane().add(btnGestionarJefes);
		
		JButton btnGestionarMecanico = new JButton("Gestionar Mecanico");
		btnGestionarMecanico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionMecanico ventana = new GestionMecanico();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarMecanico.setBounds(27, 150, 161, 23);
		frame.getContentPane().add(btnGestionarMecanico);
		
		JButton btnGestionarComercial = new JButton("Gestionar Comercial");
		btnGestionarComercial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionComercial ventana = new GestionComercial();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnGestionarComercial.setBounds(243, 150, 161, 23);
		frame.getContentPane().add(btnGestionarComercial);
		
		JLabel lblGestionDePersionas = new JLabel("GESTION DE PERSONAS");
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
		btnMenuPrincipal.setBounds(134, 210, 153, 23);
		frame.getContentPane().add(btnMenuPrincipal);
	}
}
