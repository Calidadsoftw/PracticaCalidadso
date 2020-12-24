package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import practica.Personas;
import practica.Vehiculos;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class GestionFurgonetas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionFurgonetas window = new GestionFurgonetas();
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
	public GestionFurgonetas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Vehiculos v = new Vehiculos("","","",0,"","",0,"",0,"","");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAltaCliente = new JButton("Alta Furgoneta");
		btnAltaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.alta(3);
			}
		});
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAltaCliente.setBounds(10, 56, 118, 23);
		frame.getContentPane().add(btnAltaCliente);
		
		JButton btnModificarCliente = new JButton("Modificar Furgoneta");
		btnModificarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				v.modificar(3);
			}
		});
		btnModificarCliente.setBounds(138, 56, 154, 23);
		frame.getContentPane().add(btnModificarCliente);
		
		JButton btnBajaCliente = new JButton("Baja Furgoneta");
		btnBajaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				v.baja(3);
			}
		});
		btnBajaCliente.setBounds(302, 56, 131, 23);
		frame.getContentPane().add(btnBajaCliente);
		
		JButton btnListarClientes = new JButton("Listar Furgoneta");
		btnListarClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				v.listar(3);
			}
		});
		btnListarClientes.setBounds(246, 134, 131, 23);
		frame.getContentPane().add(btnListarClientes);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					v.guardarHistorial(3);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGuardar.setBounds(69, 134, 118, 23);
		frame.getContentPane().add(btnGuardar);
		
		JLabel lblGestionarCliente = new JLabel("GESTIONAR FURGONETAS");
		lblGestionarCliente.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblGestionarCliente.setBounds(110, 11, 203, 14);
		frame.getContentPane().add(lblGestionarCliente);
		
		JButton btnAtrs = new JButton("Volver");
		btnAtrs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GestionVehiculos ventana = new GestionVehiculos();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(166, 210, 89, 23);
		frame.getContentPane().add(btnAtrs);
	}
}
