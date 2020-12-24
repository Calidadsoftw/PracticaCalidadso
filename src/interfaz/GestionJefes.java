package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import practica.Personas;

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

public class GestionJefes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionJefes window = new GestionJefes();
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
	public GestionJefes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Personas p = new Personas(null,null,null,null,0,0);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAltaCliente = new JButton("Alta Jefe");
		btnAltaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p.alta(2);
			}
		});
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAltaCliente.setBounds(10, 56, 118, 23);
		frame.getContentPane().add(btnAltaCliente);
		
		JButton btnModificarCliente = new JButton("Modificar Jefe");
		btnModificarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p.modificar(2);
			}
		});
		btnModificarCliente.setBounds(149, 56, 118, 23);
		frame.getContentPane().add(btnModificarCliente);
		
		JButton btnBajaCliente = new JButton("Baja Jefe");
		btnBajaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p.baja(2);
			}
		});
		btnBajaCliente.setBounds(282, 56, 118, 23);
		frame.getContentPane().add(btnBajaCliente);
		
		JButton btnListarClientes = new JButton("Listar Jefes");
		btnListarClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p.listar(2);
			}
		});
		btnListarClientes.setBounds(255, 134, 118, 23);
		frame.getContentPane().add(btnListarClientes);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					p.guardarHistorial(2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGuardar.setBounds(33, 134, 118, 23);
		frame.getContentPane().add(btnGuardar);
		
		JLabel lblGestionarCliente = new JLabel("GESTIONAR JEFE");
		lblGestionarCliente.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblGestionarCliente.setBounds(138, 11, 157, 14);
		frame.getContentPane().add(lblGestionarCliente);
		
		JButton btnAtrs = new JButton("Volver");
		btnAtrs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GestionPersonas ventana = new GestionPersonas();
				ventana.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(166, 210, 89, 23);
		frame.getContentPane().add(btnAtrs);
	}
}
