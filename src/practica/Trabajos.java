package practica;

import java.awt.Dimension;
import java.awt.Insets;
///Meter de nuevo los trabajos en ficheros.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import interfaz.Gestion;

public class Trabajos implements Serializable, Gestion{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	private String matricula;
	private String id;
	private String tipoTrabajo;
	private String descripcion;
	private float precio;
	private String estado;
	private static ArrayList<Trabajos> trabajo = new ArrayList<>();

	
	
	public static ArrayList<Trabajos> getTrabajo() {
		return trabajo;
	}
	public static void setTrabajo(ArrayList<Trabajos> trabajo) {
		Trabajos.trabajo = trabajo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getTipoTrabajo() {
		return tipoTrabajo;
	}
	public void setTipoTrabajo(String tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Trabajos(String id,String matricula, String tipoTrabajo, String descripcion, float precio, String estado) {
		super();
		
		
		this.matricula=matricula;
		this.id=id;
		this.tipoTrabajo = tipoTrabajo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.estado = estado;
	}
	
	
	public String toString()
	{
		 return "ID (trabajo): "+id+" \n";
	}
	
	
@Override
public void alta(int opcion) {
		// TODO Auto-generated method stub
		
		String salida = null;
		
			switch(opcion) {
			case 1:
		matricula = JOptionPane.showInputDialog(null, "Escriba la matricula del coche el cual lleva asociado este trabajo: ");
		for(int j=0;j<Coche.getCoche().size();j++)
			if(Coche.getCoche().get(j).getMatricula().equalsIgnoreCase(matricula)) {
				id = (JOptionPane.showInputDialog(null, "Escriba el id del trabajo: "));
				for(int i=0;i<trabajo.size();i++) {
					if(trabajo.get(i).getId().equals(id)) {
						salida+=("EL TRABAJO YA EXISTE!!!");
					}
else{
				tipoTrabajo = JOptionPane.showInputDialog(null, "Indique de que tipo es el trabajo: ");
				descripcion = JOptionPane.showInputDialog(null, "Escriba su descripcion: ");
				precio= Float.parseFloat(JOptionPane.showInputDialog(null, "Escriba el precio del trabajo: "));
				estado = JOptionPane.showInputDialog(null, "Escriba si el trabajo esta en proceso o ha sido finalizado: ");
				
				trabajo.add(new Trabajos(id,matricula,tipoTrabajo,descripcion,precio,estado));
				break;
				
}}
				
				}
				break;
				
				case 2:
					
					matricula = JOptionPane.showInputDialog(null, "Escriba la matricula de la moto la cual lleva asociado este trabajo: ");
					for(int j=0;j<Moto.getMoto().size();j++)
						if(Moto.getMoto().get(j).getMatricula().equalsIgnoreCase(matricula)) {
							id = (JOptionPane.showInputDialog(null, "Escriba el id del trabajo: "));
							for(int i=0;i<trabajo.size();i++) {
								if(trabajo.get(i).getId().equals(id)) {
									salida+=("EL TRABAJO YA EXISTE!!!");
								}
			else{
							tipoTrabajo = JOptionPane.showInputDialog(null, "Indique de que tipo es el trabajo: ");
							descripcion = JOptionPane.showInputDialog(null, "Escriba su descripcion: ");
							precio= Float.parseFloat(JOptionPane.showInputDialog(null, "Escriba el precio del trabajo: "));
							estado = JOptionPane.showInputDialog(null, "Escriba si el trabajo esta en proceso o ha sido finalizado: ");
							
							trabajo.add(new Trabajos(id,matricula,tipoTrabajo,descripcion,precio,estado));
							break;
							
			}}
							
							}
							break;	
							
				case 3:
					
					matricula = JOptionPane.showInputDialog(null, "Escriba la matricula del vehiculo el cual lleva asociado este trabajo: ");
					for(int j=0;j<Furgoneta.getFurgoneta().size();j++)
						if(Furgoneta.getFurgoneta().get(j).getMatricula().equalsIgnoreCase(matricula)) {
							id = (JOptionPane.showInputDialog(null, "Escriba el id del trabajo: "));
							for(int i=0;i<trabajo.size();i++) {
								if(trabajo.get(i).getId().equals(id)) {
									salida+=("EL TRABAJO YA EXISTE!!!");
								}
			else{
							tipoTrabajo = JOptionPane.showInputDialog(null, "Indique de que tipo es el trabajo: ");
							descripcion = JOptionPane.showInputDialog(null, "Escriba su descripcion: ");
							precio= Float.parseFloat(JOptionPane.showInputDialog(null, "Escriba el precio del trabajo: "));
							estado = JOptionPane.showInputDialog(null, "Escriba si el trabajo esta en proceso o ha sido finalizado: ");
							
							trabajo.add(new Trabajos(id,matricula,tipoTrabajo,descripcion,precio,estado));
							break;
							
			}}
							
							}
							break;
		
		
			}

	}
@Override
public void modificar(int opcion) {
		// TODO Auto-generated method stub
		String id2, estado2, descr;
		float euro;
		
		id2 = JOptionPane.showInputDialog(null, "Introduce el ID del trabajo que desea modificar el estado,descripcion y precio \n");
		estado2 = JOptionPane.showInputDialog(null, "Modificar estado del trabajo\n");
		descr= JOptionPane.showInputDialog(null, "Modificar descripcion\n");
		euro= Float.parseFloat(JOptionPane.showInputDialog(null, "Modificar estado del trabajo\n"));
		for(Trabajos t : trabajo) {
			
			if(t.getId().equalsIgnoreCase(id2)) {
				t.setEstado(estado2);
				t.setDescripcion(descr);
				t.setPrecio(euro);
			}
		}
		
}

@Override
public void baja(int opcion) {
		// TODO Auto-generated method stub
		String  id2;
		
		id2 = JOptionPane.showInputDialog(null, "Introduce el ID del trabajo que desea eliminar\n");
		
		int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
		 for(int i=0; i<trabajo.size(); i++){
            if(trabajo.get(i).getId().equalsIgnoreCase(id2)&& (resp!=1)&&(resp!=2)){
                trabajo.remove(i);
            }
	}
	}
	float precioTotal;
	@Override
	///Me lista el parte de reparacion. Seria tonteria listar todos los trabajos existentes de todos los vehiculos

public void listar(int opcion) {
		// TODO Auto-generated method stub
		String salida = null, matr;
		
		salida+="PARTE DE REPARACION\n";
		matr = JOptionPane.showInputDialog(null, "Indique la matricula de que vehiculo desea visualizar el parte de reparacion\n");
		salida += "--------TRABAJOS-------\n\n";
		for(Trabajos t: trabajo) {
			if(t.getMatricula().equalsIgnoreCase(matr)) {
				
				salida += "ID de trabajo: "+ t.id;
				salida += "\nTipo de trabajo: "+t.tipoTrabajo;
				salida+="\nDescripcion: "+t.descripcion;
				salida+="\nPrecio unitario: "+t.precio;
				salida+="\nFinalizado o no finalizado: "+t.estado;
				salida += "\n-------------------------------------------\n";
				precioTotal+=t.getPrecio();
			}
			
		}
		salida+=("Total a pagar: "+precioTotal);
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
}
@Override
	
public void guardarHistorial(int opcion) throws IOException {
		// TODO Auto-generated method stub
		
		try
        {
            FileOutputStream fos = new FileOutputStream("trabajos");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(trabajo);
            oos.close();
            fos.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
	}
	@SuppressWarnings("unchecked")
	@Override
	public void cargarHistorial() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 try
	        {
	            FileInputStream fis = new FileInputStream("trabajos");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	 
	            trabajo = (ArrayList<Trabajos>) ois.readObject();
	 
	            ois.close();
	            fis.close();
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
	
	
}
