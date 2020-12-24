package practica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import interfaz.Gestion;

import java.awt.Dimension;
import java.awt.Insets;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Personas implements Serializable, Gestion, Comparator<Personas>{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -639072285293056258L;
	
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String calle;
	protected int numeroCasa;
	protected int codigoPostal;
	
	private static ArrayList<Cliente> cliente = new ArrayList<>();
	private static ArrayList<Jefe> jefe = new ArrayList<>();
	private static ArrayList<Mecanico> mecanico = new ArrayList<>();
	private static ArrayList<Comercial> comercial = new ArrayList<>();
	
	public static ArrayList<Cliente> getCliente() {
		return cliente;
	}
	public static ArrayList<Jefe> getJefe() {
		return jefe;
	}
	public static ArrayList<Mecanico> getMecanico() {
		return mecanico;
	}
	public static ArrayList<Comercial> getComercial() {
		return comercial;
	}
	public static void setCliente(ArrayList<Cliente> cliente) {
		Personas.cliente = cliente;
	}
	public static void setJefe(ArrayList<Jefe> jefe) {
		Personas.jefe = jefe;
	}
	public static void setMecanico(ArrayList<Mecanico> mecanico) {
		Personas.mecanico = mecanico;
	}
	public static void setComercial(ArrayList<Comercial> comercial) {
		Personas.comercial = comercial;
	}


	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public Personas(String nombre, String apellido, String dni, String calle, int numeroCasa, int codigoPostal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.calle = calle;
		this.numeroCasa = numeroCasa;
		this.codigoPostal = codigoPostal;
	}
	
	
	///Se ordenan por apellido.
public static Comparator<Personas> NombreComparator = new Comparator<Personas>() {
		
		public int compare(Personas p1, Personas p2) {
			   String PersonasApellido1 = p1.getApellido().toUpperCase();
			   String PersonasApellido2 = p2.getApellido().toUpperCase();

			   //ascending order
			   return PersonasApellido1.compareTo(PersonasApellido2);
	}};
	



@Override
public void alta(int opcion) {
	// TODO Auto-generated method stub
		String salida="";
	
		switch(opcion) {
		
		case 1:
			
			Vehiculos vehiculo = null;
			
			nombre=JOptionPane.showInputDialog(null, "Escriba el nombre del cliente: ");
			apellido=JOptionPane.showInputDialog(null, "Escriba el apellido del cliente: ");
			dni=JOptionPane.showInputDialog(null, "Escriba el dni del cliente: ");
			for(int i=0;i<cliente.size();i++) {
				if(cliente.get(i).getDni().equals(dni)) {
					salida+=("EL CLIENTE YA EXISTE!!!");
				}
else{
			
			calle=JOptionPane.showInputDialog(null, "Escriba la calle del cliente: ");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de casa: "));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el codigo postal: "));
			
			
			cliente.add(new Cliente(vehiculo, nombre, apellido, dni, calle, numeroCasa, codigoPostal));
			break;
}}{
			//new FormularioBasicoSwing();
}
			Collections.sort(cliente, NombreComparator);
			
			break;
			
		case 2:
			String codigoJefe;
			codigoJefe=(JOptionPane.showInputDialog(null, "Escriba el codigo del jefe: "));
			for(int i=0;i<jefe.size();i++) {
				if(jefe.get(i).getCodigoJefe().equals(codigoJefe)) {
					salida+=("EL JEFE YA EXISTE!!!");
				}
else{
			nombre=JOptionPane.showInputDialog(null, "Escriba el nombre: ");
			apellido=JOptionPane.showInputDialog(null, "Escriba el apellido: ");
			dni=JOptionPane.showInputDialog(null, "Escriba el dni: ");
			calle=JOptionPane.showInputDialog(null, "Escriba la calle: ");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de casa: "));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el codigo postal: "));
			
			jefe.add(new Jefe(nombre, apellido, dni, calle, numeroCasa, codigoPostal, codigoJefe));
			break;
}}
			Collections.sort(jefe, NombreComparator);
			break;
			
		case 3:
			String codigoMecanico;
			codigoMecanico=(JOptionPane.showInputDialog(null, "Escriba el codigo del mecanico: "));
			for(int i=0;i<mecanico.size();i++) {
				if(mecanico.get(i).getCodigoMecanico().equals(codigoMecanico)) {
					salida+=("EL MECANICO YA EXISTE!!!");
				}
else{
			nombre=JOptionPane.showInputDialog(null, "Escriba el nombre: ");
			apellido=JOptionPane.showInputDialog(null, "Escriba el apellido: ");
			dni=JOptionPane.showInputDialog(null, "Escriba el dni: ");
			calle=JOptionPane.showInputDialog(null, "Escriba la calle: ");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de casa: "));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el codigo postal: "));
			
			mecanico.add(new Mecanico(nombre, apellido, dni, calle, numeroCasa, codigoPostal, codigoMecanico));
			break;
}}
			Collections.sort(mecanico, NombreComparator);
			break;
			
		case 4:
			
			String codigoComercial;
			codigoComercial=(JOptionPane.showInputDialog(null, "Escriba el codigo del comercial: "));
			for(int i=0;i<comercial.size();i++) {
				if(comercial.get(i).getCodigoComercial().equals(codigoComercial)) {
					salida+=("EL COMERCIAL YA EXISTE!!!");
				}
else{
			nombre=JOptionPane.showInputDialog(null, "Escriba el nombre: ");
			apellido=JOptionPane.showInputDialog(null, "Escriba el apellido: ");
			dni=JOptionPane.showInputDialog(null, "Escriba el dni: ");
			calle=JOptionPane.showInputDialog(null, "Escriba la calle: ");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de casa: "));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el codigo postal: "));
			
			comercial.add(new Comercial(nombre, apellido, dni, calle, numeroCasa, codigoPostal, codigoComercial));
			break;
}}
			Collections.sort(comercial, NombreComparator);
			break;
		}

}
@Override
public void modificar(int opcion) {
	// TODO Auto-generated method stub
	
		switch(opcion) {
		
		case 1:
			String dniCliente;
			dniCliente = JOptionPane.showInputDialog(null, "Introduce el dni del cliente a modificar\n");
			///Si el cliente no existe, directamente nos saca de la opcion modificar
			for(int j=0;j<cliente.size();j++) {
				if(cliente.get(j).getDni().equals(dniCliente)) {
			nombre = JOptionPane.showInputDialog(null, "Modificar nombre\n");
			apellido=JOptionPane.showInputDialog(null, "Modificar apellido\n");
			calle=JOptionPane.showInputDialog(null, "Modificar calle\n");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar numero de casa\n"));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar codigo postal\n"));
			
			for(Cliente m: cliente) {
				
				if(m.getDni().equalsIgnoreCase(dniCliente)) {
					m.setNombre(nombre);
					m.setApellido(apellido);
					m.setCalle(calle);
					m.setNumeroCasa(numeroCasa);
					m.setCodigoPostal(codigoPostal);
				}
			}
				}
			}
			break;
			
		case 2:
			String codigoJefe;
			codigoJefe = JOptionPane.showInputDialog(null, "Introduce el codigo del jefe a modificar\n");
			for(int j=0;j<jefe.size();j++) {
				if(jefe.get(j).getCodigoJefe().equals(codigoJefe)) {
			nombre = JOptionPane.showInputDialog(null, "Modificar nombre\n");
			apellido=JOptionPane.showInputDialog(null, "Modificar apellido\n");
			calle=JOptionPane.showInputDialog(null, "Modificar calle\n");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar numero de casa\n"));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar codigo postal\n"));
			
			for(Jefe m: jefe) {
				
				if(m.getCodigoJefe().equalsIgnoreCase(codigoJefe)) {
					m.setNombre(nombre);
					m.setApellido(apellido);
					m.setCalle(calle);
					m.setNumeroCasa(numeroCasa);
					m.setCodigoPostal(codigoPostal);
				}
			}
				}
			}
			break;
			
		case 3:
			String codigoMecanico;
			codigoMecanico = JOptionPane.showInputDialog(null, "Introduce el codigo del mecanico a modificar\n");
			for(int j=0;j<mecanico.size();j++) {
				if(mecanico.get(j).getCodigoMecanico().equals(codigoMecanico)) {
			nombre = JOptionPane.showInputDialog(null, "Modificar nombre\n");
			apellido=JOptionPane.showInputDialog(null, "Modificar apellido\n");
			calle=JOptionPane.showInputDialog(null, "Modificar calle\n");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar numero de casa\n"));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar codigo postal\n"));
			
			for(Mecanico m : mecanico) {
				
				if(m.getCodigoMecanico().equalsIgnoreCase(codigoMecanico)) {
					m.setNombre(nombre);
					m.setApellido(apellido);
					m.setCalle(calle);
					m.setNumeroCasa(numeroCasa);
					m.setCodigoPostal(codigoPostal);
				}
			}
				}
			}
			
			break;
			
		case 4:
			
			String codigoComercial;
			codigoComercial = JOptionPane.showInputDialog(null, "Introduce el codigo del comercial a modificar\n");
			for(int j=0;j<comercial.size();j++) {
				if(comercial.get(j).getCodigoComercial().equals(codigoComercial)) {
			nombre = JOptionPane.showInputDialog(null, "Modificar nombre\n");
			apellido=JOptionPane.showInputDialog(null, "Modificar apellido\n");
			calle=JOptionPane.showInputDialog(null, "Modificar calle\n");
			numeroCasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar numero de casa\n"));
			codigoPostal=Integer.parseInt(JOptionPane.showInputDialog(null, "Modificar codigo postal\n"));
			
			for(Comercial m: comercial) {
				
				if(m.getCodigoComercial().equalsIgnoreCase(codigoComercial)) {
					m.setNombre(nombre);
					m.setApellido(apellido);
					m.setCalle(calle);
					m.setNumeroCasa(numeroCasa);
					m.setCodigoPostal(codigoPostal);
				}
			}
				}
			}
			break;
		}
}
@Override
public void baja(int opcion) {
	// TODO Auto-generated method stub
	
		switch(opcion) {
		
		case 1:
			String dniCliente;
			dniCliente = JOptionPane.showInputDialog(null, "Introduce el dni del cliente el cual quiere eliminar de la base de datos\n");
			int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
			 for(int i=0; i<cliente.size(); i++){
	             if(cliente.get(i).getDni().equalsIgnoreCase(dniCliente) && (resp!=1)&&(resp!=2)){
	                 cliente.remove(i);
	             }
		}
			 
			 break;
			
		case 2:
			
			String codigoJefe;
			codigoJefe = JOptionPane.showInputDialog(null, "Introduce el codigo del jefe el cual quiere eliminar de la base de datos\n");
			int resp2 = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
			 for(int i=0; i<jefe.size(); i++){
	             if(jefe.get(i).getCodigoJefe().equalsIgnoreCase(codigoJefe)&& (resp2!=1)&&(resp2!=2)){
	                 jefe.remove(i);
	             }
		}
			 break;
			 
		case 3:
			
			String codigoMecanico;
			codigoMecanico = JOptionPane.showInputDialog(null, "Introduce el dni del cliente el cual quiere eliminar de la base de datos\n");
			int resp3 = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
			 for(int i=0; i<mecanico.size(); i++){
	             if(mecanico.get(i).getCodigoMecanico().equalsIgnoreCase(codigoMecanico)&& (resp3!=1)&&(resp3!=2)){
	                 mecanico.remove(i);
	             }
		}
			 
			 break;
			 
		case 4:
			
			String codigoComercial;
			codigoComercial = JOptionPane.showInputDialog(null, "Introduce el dni del cliente el cual quiere eliminar de la base de datos\n");
			int resp4 = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
			 for(int i=0; i<comercial.size(); i++){
	             if(comercial.get(i).getCodigoComercial().equalsIgnoreCase(codigoComercial)&& (resp4!=1)&&(resp4!=2)){
	                 comercial.remove(i);
	             }
		}
			 
			 break;
		}
}
@Override
public void listar(int opcion) {
	// TODO Auto-generated method stub
	
		switch(opcion) {
		
		case 1:
			String salida = "";
			salida += "--------CLIENTES-------\n\n";
			for(Cliente c: cliente) {
				
				salida+="\nDNI: " +c.getDni();
				salida+="\nNombre: "+c.getNombre();
				salida+="\nApellido: "+c.getApellido();
				salida+="\nCalle: "+c.getCalle();
				salida+="\nNumero de casa: "+c.getNumeroCasa();
				salida+="\nCodigo postal: "+c.getCodigoPostal();
				salida+="\n----------------------------------------";
			}
			
			JScrollPane scrollPane = new JScrollPane(new JLabel(salida));
	        scrollPane.setPreferredSize(new Dimension(400,300));
	        Object message = scrollPane;
	        

	        JTextArea textArea = new JTextArea(salida);
	        textArea.setLineWrap(true);
	        textArea.setWrapStyleWord(true);
	        textArea.setMargin(new Insets(15,15,15,15));
	        scrollPane.getViewport().setView(textArea);
	        message = scrollPane;
	        JOptionPane.showMessageDialog(null, message);
	        
			break;
			
		case 2:
			
			String salida2 = "";
			salida2 += "--------JEFES-------\n\n";
			for(Jefe c: jefe) {
				
				salida2+="\nCodigo jefe: " +c.getCodigoJefe();
				salida2+="\nNombre: "+c.getNombre();
				salida2+="\nApellido: "+c.getApellido();
				salida2+="\nCalle: "+c.getCalle();
				salida2+="\nNumero de casa: "+c.getNumeroCasa();
				salida2+="\nCodigo postal: "+c.getCodigoPostal();
				salida2+="\n----------------------------------------";
			}
			JScrollPane scrollPane2 = new JScrollPane(new JLabel(salida2));
	        scrollPane2.setPreferredSize(new Dimension(400,300));
	        Object message2 = scrollPane2;
	        

	        JTextArea textArea2 = new JTextArea(salida2);
	        textArea2.setLineWrap(true);
	        textArea2.setWrapStyleWord(true);
	        textArea2.setMargin(new Insets(15,15,15,15));
	        scrollPane2.getViewport().setView(textArea2);
	        message2 = scrollPane2;
	        JOptionPane.showMessageDialog(null, message2);
	       
			break;
			
		case 3:
			String salida3 = "";
			salida3 += "--------MECANICOS-------\n\n";
			for(Mecanico c: mecanico) {
				
				salida3+="\nCodigo mecanico: " +c.getCodigoMecanico();
				salida3+="\nNombre: "+c.getNombre();
				salida3+="\nApellido: "+c.getApellido();
				salida3+="\nCalle: "+c.getCalle();
				salida3+="\nNumero de casa: "+c.getNumeroCasa();
				salida3+="\nCodigo postal: "+c.getCodigoPostal();
				salida3+="\n----------------------------------------";
			}
			JScrollPane scrollPane3 = new JScrollPane(new JLabel(salida3));
	        scrollPane3.setPreferredSize(new Dimension(400,300));
	        Object message3 = scrollPane3;
	        

	        JTextArea textArea3 = new JTextArea(salida3);
	        textArea3.setLineWrap(true);
	        textArea3.setWrapStyleWord(true);
	        textArea3.setMargin(new Insets(15,15,15,15));
	        scrollPane3.getViewport().setView(textArea3);
	        message3 = scrollPane3;
	        JOptionPane.showMessageDialog(null, message3);
	       
			break;
		
		case 4:
			String salida4 = "";
			salida4 += "--------COMERCIALES-------\n\n";
			for(Comercial c: comercial) {
				
				salida4+="\nCodigo comercial: " +c.getCodigoComercial();
				salida4+="\nNombre: "+c.getNombre();
				salida4+="\nApellido: "+c.getApellido();
				salida4+="\nCalle: "+c.getCalle();
				salida4+="\nNumero de casa: "+c.getNumeroCasa();
				salida4+="\nCodigo postal: "+c.getCodigoPostal();
				salida4+="\n----------------------------------------";
			}
			JScrollPane scrollPane4 = new JScrollPane(new JLabel(salida4));
	        scrollPane4.setPreferredSize(new Dimension(400,300));
	        Object message4 = scrollPane4;
	        

	        JTextArea textArea4 = new JTextArea(salida4);
	        textArea4.setLineWrap(true);
	        textArea4.setWrapStyleWord(true);
	        textArea4.setMargin(new Insets(15,15,15,15));
	        scrollPane4.getViewport().setView(textArea4);
	        message4 = scrollPane4;
	        JOptionPane.showMessageDialog(null, message4);
	       
			break;
		}
}
@Override
public void guardarHistorial(int opcion) throws IOException {
	// TODO Auto-generated method stub
		
	switch(opcion) {
		
		case 1:
			
			try
	        {
	            FileOutputStream fos = new FileOutputStream("clientes");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(cliente);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
			
			break;
			
		case 2:
			
			try
	        {
	            FileOutputStream fos = new FileOutputStream("jefes");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(jefe);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
		break;
		case 3:
			try
	        {
	            FileOutputStream fos = new FileOutputStream("mecanicos");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(mecanico);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
			break;
			
		case 4:
			
			try
	        {
	            FileOutputStream fos = new FileOutputStream("comerciales");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(comercial);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
		}

}
@SuppressWarnings("unchecked")
@Override
public void cargarHistorial() throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
			
		
			 try
		        {
		            FileInputStream fis = new FileInputStream("clientes");
		            ObjectInputStream ois = new ObjectInputStream(fis);
		 
		            cliente = (ArrayList<Cliente>) ois.readObject();
		 
		            ois.close();
		            fis.close();
		            
		            FileInputStream fis2 = new FileInputStream("jefes");
		            ObjectInputStream ois2 = new ObjectInputStream(fis2);
		 
		            jefe = (ArrayList<Jefe>) ois2.readObject();
		 
		            ois2.close();
		            fis2.close();
		            
		            FileInputStream fis3 = new FileInputStream("mecanicos");
		            ObjectInputStream ois3 = new ObjectInputStream(fis3);
		 
		            mecanico = (ArrayList<Mecanico>) ois3.readObject();
		 
		            ois3.close();
		            fis3.close();
		            
		            FileInputStream fis4 = new FileInputStream("comerciales");
		            ObjectInputStream ois4 = new ObjectInputStream(fis4);
		 
		            comercial = (ArrayList<Comercial>) ois4.readObject();
		 
		            ois4.close();
		            fis4.close();
		            
		            
		        } 
		        catch (IOException ioe) 
		        {
		            ioe.printStackTrace();
		            return;
		        } 
		        catch (ClassNotFoundException c) 
		        {
		            System.out.println("Class not found");
		            c.printStackTrace();
		            return;
		        }		         
		
}
	

///Redefinicion del metodo compare incluido en la interfaz Comparator
@Override
public int compare(Personas o1, Personas o2) {
	// TODO Auto-generated method stub
	Personas p1 = (Personas)o1;
	Personas p2 = (Personas)o2;
	return p1.getApellido().compareTo(p2.getApellido());
}


}

