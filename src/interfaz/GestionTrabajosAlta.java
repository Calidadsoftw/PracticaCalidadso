package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import practica.Personas;
import practica.Trabajos;
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

public class GestionTrabajosAlta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionTrabajosAlta window = new GestionTrabajosAlta();
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
	public GestionTrabajosAlta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Trabajos t = new Trabajos(null,null,null,null,0,null);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAltaCliente = new JButton("Alta Coche");
		btnAltaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t.alta(1);
			}
		});
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAltaCliente.setBounds(10, 92, 118, 23);
		frame.getContentPane().add(btnAltaCliente);
		
		JButton btnModificarCliente = new JButton("Alta Moto");
		btnModificarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				t.alta(2);
			}
		});
		btnModificarCliente.setBounds(141, 92, 154, 23);
		frame.getContentPane().add(btnModificarCliente);
		
		JButton btnBajaCliente = new JButton("Alta furgoneta");
		btnBajaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				t.alta(3);
			}
		});
		btnBajaCliente.setBounds(303, 92, 131, 23);
		frame.getContentPane().add(btnBajaCliente);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					t.guardarHistorial(0);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGuardar.setBounds(153, 133, 118, 23);
		frame.getContentPane().add(btnGuardar);
		
		JLabel lblGestionarCliente = new JLabel("GESTIONAR ALTA DE TRABAJOS");
		lblGestionarCliente.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblGestionarCliente.setBounds(110, 11, 234, 14);
		frame.getContentPane().add(lblGestionarCliente);
		
		JButton btnAtrs = new JButton("Volver");
		btnAtrs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GestionTrabajos ventana = new GestionTrabajos();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(166, 210, 89, 23);
		frame.getContentPane().add(btnAtrs);
	}
}
