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

public class GestionComercial {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionComercial window = new GestionComercial();
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
	public GestionComercial() {
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
		
		JButton btnAltaCliente = new JButton("Alta Comercial");
		btnAltaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p.alta(4);
			}
		});
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAltaCliente.setBounds(10, 56, 118, 23);
		frame.getContentPane().add(btnAltaCliente);
		
		JButton btnModificarCliente = new JButton("Modificar Comercial");
		btnModificarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p.modificar(4);
			}
		});
		btnModificarCliente.setBounds(138, 56, 158, 23);
		frame.getContentPane().add(btnModificarCliente);
		
		JButton btnBajaCliente = new JButton("Baja Comercial");
		btnBajaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p.baja(4);
			}
		});
		btnBajaCliente.setBounds(306, 56, 128, 23);
		frame.getContentPane().add(btnBajaCliente);
		
		JButton btnListarClientes = new JButton("Listar Comerciales");
		btnListarClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p.listar(4);
			}
		});
		btnListarClientes.setBounds(243, 134, 158, 23);
		frame.getContentPane().add(btnListarClientes);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					p.guardarHistorial(4);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnGuardar.setBounds(66, 134, 118, 23);
		frame.getContentPane().add(btnGuardar);
		
		JLabel lblGestionarCliente = new JLabel("GESTIONAR COMERCIAL");
		lblGestionarCliente.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblGestionarCliente.setBounds(138, 11, 181, 14);
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
