package practica;



import java.awt.Dimension;
import java.awt.Insets;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import interfaz.Gestion;

public class Vehiculos implements Serializable, Gestion, Comparable<Vehiculos>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7793647355200184788L;
	
	protected String dniCliente;
	protected String matricula;
	protected int anyoEntradaTaller;
	protected String modelo;
	protected String marca;
	protected int capacidadMotor;
	protected String tipoCombustible;
	protected int numeroPasajeros;
	protected String ABS;
	protected String estadoVehiculo;
	protected String tipo;	
	private static ArrayList<Coche> coche = new ArrayList<>();
	private static ArrayList<Moto> moto = new ArrayList<>();
	private static ArrayList<Furgoneta> furgoneta = new ArrayList<>();
	
	public static ArrayList<Coche> getCoche() {
		return coche;
	}
	public static ArrayList<Moto> getMoto() {
		return moto;
	}
	public static ArrayList<Furgoneta> getFurgoneta() {
		return furgoneta;
	}
	public static void setCoche(ArrayList<Coche> coche) {
		Vehiculos.coche = coche;
	}
	public static void setMoto(ArrayList<Moto> moto) {
		Vehiculos.moto = moto;
	}
	public static void setFurgoneta(ArrayList<Furgoneta> furgoneta) {
		Vehiculos.furgoneta = furgoneta;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	
	public int getAnyoEntradaTaller() {
		return anyoEntradaTaller;
	}
	public void setAnyoEntradaTaller(int anyoEntradaTaller) {
		this.anyoEntradaTaller = anyoEntradaTaller;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidadMotor() {
		return capacidadMotor;
	}
	public void setCapacidadMotor(int capacidadMotor) {
		this.capacidadMotor = capacidadMotor;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	
	public String getABS() {
		return ABS;
	}
	public void setABS(String aBS) {
		ABS = aBS;
	}
	public String getEstadoVehiculo() {
		return estadoVehiculo;
	}
	public void setEstadoVehiculo(String estadoVehiculo) {
		this.estadoVehiculo = estadoVehiculo;
	}
	public Vehiculos(String matricula,String tipo,String dniCliente,int anyoEntradaTaller,String modelo, String marca, int capacidadMotor, String tipoCombustible, int numeroPasajeros, String ABS, String estadoVehiculo) {
		super();
		
		this.matricula=matricula;
		this.tipo=tipo;
		this.dniCliente=dniCliente;
		this.anyoEntradaTaller=anyoEntradaTaller;
		this.modelo = modelo;
		this.marca = marca;
		this.capacidadMotor = capacidadMotor;
		this.tipoCombustible = tipoCombustible;
		this.numeroPasajeros = numeroPasajeros;
		this.ABS = ABS;
		this.estadoVehiculo = estadoVehiculo;
	}
	
	 ///Los hago static para poder realizar busqueda de matricula en trabajos

	

	//String salida;
	
	public String toString()
	{
		 return "Matricula: "+matricula+" \n";
	}
	
	@Override
	public void alta(int opcion) { ///Automaticamente guardar en fichero, por si por ejemplo perdemos todo, poder recuperarlo
		// TODO Auto-generated method stub
		///Para que cada objeto sea único
		
		
		String GPS, sistemaClimatizacion, descapotable, salida=null;
		int numeroPuertas, capacidadAlmacenamiento;
		

		switch(opcion) {
		case 1:
		
		dniCliente = JOptionPane.showInputDialog(null, "Escriba el dni del dueño del coche: ");
		for(int j=0;j<Cliente.getCliente().size();j++)
			if(Cliente.getCliente().get(j).getDni().equalsIgnoreCase(dniCliente)) {
		matricula = JOptionPane.showInputDialog(null, "Escriba la matricula del coche: ");
		for(int i=0;i<coche.size();i++) {
			if(coche.get(i).getMatricula().equals(matricula)) {
				salida+=("EL COCHE YA EXISTE!!!");
			}
else{
	String[] motivos = {
            "Problema mecanico",
            "Revision",
            "Visita simple"
        };
		tipo = (String) JOptionPane.showInputDialog(null, "Seleccione el motivo de la visita", "Motivo", JOptionPane.DEFAULT_OPTION,  null, motivos, motivos[0]);
		numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el numero de puertas: "));
		capacidadAlmacenamiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la capacidad de almacenamiento: "));
		GPS = (JOptionPane.showInputDialog(null, "Indique si tiene GPS: "));
		sistemaClimatizacion = (JOptionPane.showInputDialog(null, "Indique si tiene sistema de climatizacion: "));
		descapotable =(JOptionPane.showInputDialog(null, "Indique si es descapotable: "));
		anyoEntradaTaller = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el anyo de entrada al taller: "));
		modelo = JOptionPane.showInputDialog(null, "Escriba el modelo del coche: ");
		marca = JOptionPane.showInputDialog(null, "Escriba la marca del coche: ");
		capacidadMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la capacidad del motor: "));
		tipoCombustible = JOptionPane.showInputDialog(null, "Indique el tipo de combustible: ");
		numeroPasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el numero de pasajeros: "));
		ABS = JOptionPane.showInputDialog(null, "Indique si tiene ABS: ");
		estadoVehiculo = JOptionPane.showInputDialog(null, "Indique el estado del coche: ");
			
		coche.add((new Coche(matricula, tipo,dniCliente, anyoEntradaTaller, modelo, marca, capacidadMotor, tipoCombustible, numeroPasajeros, ABS, estadoVehiculo, numeroPuertas, capacidadAlmacenamiento, GPS, sistemaClimatizacion, descapotable)));
		break;
}}
			}
		Collections.sort(coche);
			
		break;
		case 2:
			dniCliente = JOptionPane.showInputDialog(null, "Escriba el dni del duenyo de la moto: ");
			for(int j=0;j<Cliente.getCliente().size();j++)
				if(Cliente.getCliente().get(j).getDni().equalsIgnoreCase(dniCliente)) {
			matricula = JOptionPane.showInputDialog(null, "Escriba la matricula de la moto: ");
			for(int i=0;i<moto.size();i++) {
				if(moto.get(i).getMatricula().equals(matricula)) {
					salida+=("LA MOTO YA EXISTE!!!");
				}
else{
	String[] motivos = {
            "Problema mecanico",
            "Revision",
            "Visita simple"
        };
    String resp = (String) JOptionPane.showInputDialog(null, "Seleccione el motivo de la visita", "Motivo", JOptionPane.DEFAULT_OPTION,  null, motivos, motivos[0]);
			anyoEntradaTaller = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el anyo de entrada al taller: "));
			modelo = JOptionPane.showInputDialog(null, "Escriba el modelo de la moto: ");
			marca = JOptionPane.showInputDialog(null, "Escriba la marca de la moto: ");
			capacidadMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la capacidad del motor: "));
			tipoCombustible = JOptionPane.showInputDialog(null, "Indique el tipo de combustible: ");
			numeroPasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el numero de pasajeros: "));
			ABS = (JOptionPane.showInputDialog(null, "Indique si tiene ABS: "));
			estadoVehiculo = JOptionPane.showInputDialog(null, "Indique el estado de la moto: ");
			moto.add(new Moto(dniCliente, resp,matricula, anyoEntradaTaller, modelo, marca, capacidadMotor, tipoCombustible,numeroPasajeros, ABS, estadoVehiculo));
			break;
}}
				}
			Collections.sort(moto);
			break;
		case 3:
			dniCliente = JOptionPane.showInputDialog(null, "Escriba el dni del duenyo de la furgoneta: ");
			for(int j=0;j<Cliente.getCliente().size();j++)
				if(Cliente.getCliente().get(j).getDni().equalsIgnoreCase(dniCliente)) {
			matricula = JOptionPane.showInputDialog(null, "Escriba la matricula de la furgoneta: ");
			for(int i=0;i<furgoneta.size();i++) {
				if(furgoneta.get(i).getMatricula().equals(matricula)) {
					salida+=("LA FURGONETA YA EXISTE!!!");
				}
else{
	String[] motivos = {
            "Problema mecanico",
            "Revision",
            "Visita simple"
        };
    String resp3 = (String) JOptionPane.showInputDialog(null, "Seleccione el motivo de la visita", "Motivo", JOptionPane.DEFAULT_OPTION,  null, motivos, motivos[0]);
			anyoEntradaTaller = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el anyo de entrada al taller: "));
			modelo = JOptionPane.showInputDialog(null, "Escriba el modelo de la furgoneta: ");
			marca = JOptionPane.showInputDialog(null, "Escriba la marca de la furgoneta: ");
			capacidadMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la capacidad del motor: "));
			tipoCombustible = JOptionPane.showInputDialog(null, "Indique el tipo de combustible: ");
			numeroPasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el numero de pasajeros: "));
			ABS = (JOptionPane.showInputDialog(null, "Indique si tiene ABS: "));
			estadoVehiculo = JOptionPane.showInputDialog(null, "Indique el estado de la furgoneta: ");
			numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el numero de puertas: "));
			capacidadAlmacenamiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la capacidad de almacenamiento: "));
			GPS = (JOptionPane.showInputDialog(null, "Indique si tiene GPS: "));
			sistemaClimatizacion = (JOptionPane.showInputDialog(null, "Indique si tiene sistema de climatizacion: "));
			furgoneta.add(new Furgoneta(matricula, resp3,dniCliente, anyoEntradaTaller, modelo, marca, capacidadMotor, tipoCombustible, numeroPasajeros, ABS, estadoVehiculo, numeroPuertas, capacidadAlmacenamiento, GPS, sistemaClimatizacion));
			break;
}}
				}
			Collections.sort(furgoneta);
			
			break;
		}

	}
	@Override
	///Solo modificamos el estado de vehiculo para poder tener registrado si ha sido terminado o no
	///y que el comercial pueda informar al cliente de ello.
	public void modificar(int opcion) {
		// TODO Auto-generated method stub
		///Solamente cambiar el estado del vehiculo
		String matr;
		String estado;
		
		
		switch(opcion) {
		case 1: 
			matr = JOptionPane.showInputDialog(null, "Introduce la matricula del coche el cual quiere modificar el estado\n");
			for(int i=0;i<coche.size();i++) {
				if(coche.get(i).getMatricula().equals(matr)) {
			estado = JOptionPane.showInputDialog(null, "Modificar estado del coche\n");
			for(Coche p:coche) {
			
       	 if(p.getMatricula().equalsIgnoreCase(matr)){
       	 
             p.setEstadoVehiculo(estado);            
       	}
       }
				}
				}
			break;
		case 2:
			
			matr = JOptionPane.showInputDialog(null, "Introduce la matricula de la moto la cual quiere modificar el estado\n");
			for(int i=0;i<moto.size();i++) {
				if(moto.get(i).getMatricula().equals(matr)) {
			estado = JOptionPane.showInputDialog(null, "Modificar estado de la moto\n");
			
			for(Moto m: moto) {
				
				if(m.getMatricula().equalsIgnoreCase(matr)) {
					m.setEstadoVehiculo(estado);
				}
			}
				}
			}
			break;
			
		case 3:
			
			matr = JOptionPane.showInputDialog(null, "Introduce la matricula de la furgoneta la cual quiere modificar el estado\n");
			for(int i=0;i<furgoneta.size();i++) {
				if(furgoneta.get(i).getMatricula().equals(matr)) {
			estado = JOptionPane.showInputDialog(null, "Modificar estado de la furgoneta\n");
			
			for(Furgoneta f: furgoneta) {
				
				if(f.getMatricula().equalsIgnoreCase(matr)) {
					f.setEstadoVehiculo(estado);
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
		
		String matr;
		
		switch(opcion) {
		
		case 1:
			
		matr = JOptionPane.showInputDialog(null, "Introduce la matricula del coche el cual quiere eliminar de la base de datos\n");
		for(int j=0;j<coche.size();j++) {
			if(coche.get(j).getMatricula().equals(matr)) {
		int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
		 for(int i=0; i<coche.size(); i++){
             if(coche.get(i).getMatricula().equalsIgnoreCase(matr)&&(resp!=1)&&(resp!=2)){
                 coche.remove(i);
             }
	}
			}
		}
		 break;
		 
		case 2:
			matr = JOptionPane.showInputDialog(null, "Introduce la matricula de la moto la cual quiere eliminar de la base de datos\n");
			for(int j=0;j<moto.size();j++) {
				if(moto.get(j).getMatricula().equals(matr)) {
			int resp2 = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
			 for(int i=0; i<moto.size(); i++){
	             if(moto.get(i).getMatricula().equalsIgnoreCase(matr)&&(resp2!=1)&&(resp2!=2)){
	                 moto.remove(i);
	             }
		}
				}
			}
			 break;
			 
		case 3:
			
			matr = JOptionPane.showInputDialog(null, "Introduce la matricula de la furgoneta la cual quiere eliminar de la base de datos\n");
			for(int j=0;j<furgoneta.size();j++) {
				if(furgoneta.get(j).getMatricula().equals(matr)) {
			int resp3 = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
			 for(int i=0; i<furgoneta.size(); i++){
	             if(furgoneta.get(i).getMatricula().equalsIgnoreCase(matr)&&(resp3!=1)&&(resp3!=2)){
	                 furgoneta.remove(i);
	             }
		}
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
			{
				String Salida= "";
				Salida += "--------COCHES-------\n\n";
       for(Coche c:coche) {
    	     Salida += "\nMatricula: "+c.getMatricula()+" ";
    	     Salida += "\nDni Cliente: "+c.getDniCliente()+" ";
    	     Salida+="\nTipo visita: "+c.getTipo()+"";
	         Salida += "\nAnyo entrada al taller: "+c.getAnyoEntradaTaller()+" ";
	         Salida += "\nModelo: "+c.getModelo()+"";
	         Salida += "\nMarca: "+c.getMarca()+"";
	         Salida += "\nCapacidad del motor: "+c.getCapacidadMotor()+"";
	         Salida += "\nTipo de combustible: "+c.getTipoCombustible()+"";
	         Salida += "\nNumero de pasajeros: "+c.getNumeroPasajeros()+"";
	         Salida += "\n¿Tiene ABS?: "+c.getABS()+"";
	         Salida += "\nNumero de puertas: "+c.getNumeroPuertas()+"";
	         Salida += "\nCapacidad de almacenamiento: "+c.getCapacidadAlmacenamiento()+"";
	         Salida += "\n¿Tiene GPS?: "+c.getGPS()+"";
	         Salida += "\n¿Tiene sistema de climatizacion?: "+c.getSistemaClimatizacion()+"";
	         Salida += "\n¿Es descapotable?: "+c.getDescapotable()+"";
	         Salida+="\nEstado: "+c.getEstadoVehiculo()+"";
         
         Salida += "\n-------------------------------------------\n";
        }
       JScrollPane scrollPane = new JScrollPane(new JLabel(Salida));
       scrollPane.setPreferredSize(new Dimension(400,300));
       Object message = scrollPane;
       

       JTextArea textArea = new JTextArea(Salida);
       textArea.setLineWrap(true);
       textArea.setWrapStyleWord(true);
       textArea.setMargin(new Insets(15,15,15,15));
       scrollPane.getViewport().setView(textArea);
       message = scrollPane;
       JOptionPane.showMessageDialog(null, message);
      
			}
       break;
       
			case 2:
			{
				String Salida2= "";
				Salida2 += "--------MOTOS-------\n\n";
				for(Moto m : moto) {
				 Salida2 += "\nMatricula: "+m.getMatricula()+" ";
				 Salida2 += "\nDni Cliente: "+m.getDniCliente()+" ";
				 Salida2+="\nTipo visita: "+m.getTipo()+"";
		         Salida2 += "\nAnyo entrada al taller: "+m.getAnyoEntradaTaller()+" ";
		         Salida2 += "\nModelo: "+m.getModelo()+"";
		         Salida2 += "\nMarca: "+m.getMarca()+"";
		         Salida2 += "\nCapacidad del motor: "+m.getCapacidadMotor()+"";
		         Salida2 += "\nTipo de combustible: "+m.getTipoCombustible()+"";
		         Salida2 += "\nNumero de pasajeros: "+m.getNumeroPasajeros()+"";
		         Salida2 += "\n¿Tiene ABS?: "+m.getABS()+"";
		         Salida2+="\nEstado: "+m.getEstadoVehiculo()+"";
		         
		         Salida2 += "\n-------------------------------------------";
				}
				JScrollPane scrollPane2 = new JScrollPane(new JLabel(Salida2));
		        scrollPane2.setPreferredSize(new Dimension(400,300));
		        Object message2 = scrollPane2;
		        

		        JTextArea textArea2 = new JTextArea(Salida2);
		        textArea2.setLineWrap(true);
		        textArea2.setWrapStyleWord(true);
		        textArea2.setMargin(new Insets(15,15,15,15));
		        scrollPane2.getViewport().setView(textArea2);
		        message2 = scrollPane2;
		        JOptionPane.showMessageDialog(null, message2);
		       
			}
				break;
				
			case 3:
			{
				String Salida3= "";
				Salida3 += "--------FURGONETAS-------\n\n";
				for(Furgoneta f : furgoneta) {
					
					Salida3 += "\nMatricula: "+f.getMatricula()+" ";
					Salida3 += "\nDni Cliente: "+f.getDniCliente()+" ";
					Salida3+="\nTipo visita: "+f.getTipo()+"";
			         Salida3 += "\nAnyo entrada al taller: "+f.getAnyoEntradaTaller()+" ";
			         Salida3 += "\nModelo: "+f.getModelo()+"";
			         Salida3 += "\nMarca: "+f.getMarca()+"";
			         Salida3 += "\nCapacidad del motor: "+f.getCapacidadMotor()+"";
			         Salida3 += "\nTipo de combustible: "+f.getTipoCombustible()+"";
			         Salida3 += "\nNumero de pasajeros: "+f.getNumeroPasajeros()+"";
			         Salida3 += "\n¿Tiene ABS?: "+f.getABS()+"";
			         Salida3 += "\nNumero de puertas: "+f.getNumeroPuertas()+"";
			         Salida3 += "\nCapacidad de almacenamiento: "+f.getCapacidadAlmacenamiento()+"";
			         Salida3 += "\n¿Tiene GPS?: "+f.getGPS()+"";
			         Salida3 += "\n¿Tiene sistema de climatizacion?: "+f.getSistemaClimatizacion()+"";
			         Salida3+="\nEstado: "+f.getEstadoVehiculo()+"";
			         Salida3 += "\n-------------------------------------------\n";
				}
				JScrollPane scrollPane3 = new JScrollPane(new JLabel(Salida3));
		        scrollPane3.setPreferredSize(new Dimension(400,300));
		        Object message3 = scrollPane3;
		        

		        JTextArea textArea3 = new JTextArea(Salida3);
		        textArea3.setLineWrap(true);
		        textArea3.setWrapStyleWord(true);
		        textArea3.setMargin(new Insets(15,15,15,15));
		        scrollPane3.getViewport().setView(textArea3);
		        message3 = scrollPane3;
		        JOptionPane.showMessageDialog(null, message3);
		       
			}
				break;
			}

        }
	

	@Override
public void guardarHistorial(int opcion) throws IOException{

			switch(opcion) {
			case 1:
		try
        {
            FileOutputStream fos = new FileOutputStream("coches");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(coche);
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
		            FileOutputStream fos = new FileOutputStream("motos");
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(moto);
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
		            FileOutputStream fos = new FileOutputStream("furgonetas");
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(furgoneta);
		            oos.close();
		            fos.close();
		        } 
		        catch (IOException ioe) 
		        {
		            ioe.printStackTrace();
		        }
				break;
		
			}

	}
	@SuppressWarnings("unchecked")
	public void cargarHistorial() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		 try
        {
            FileInputStream fis = new FileInputStream("coches");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            coche = (ArrayList<Coche>) ois.readObject();
 
            ois.close();
            fis.close();
            
            FileInputStream fis2 = new FileInputStream("motos");
            ObjectInputStream ois2 = new ObjectInputStream(fis2);
 
            moto = (ArrayList<Moto>) ois2.readObject();
 
            ois2.close();
            fis2.close();
            
            FileInputStream fis3 = new FileInputStream("furgonetas");
            ObjectInputStream ois3 = new ObjectInputStream(fis3);
 
            furgoneta = (ArrayList<Furgoneta>) ois3.readObject();
 
            ois3.close();
            fis3.close();
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


	
	
	///Redefinicion del metodo CompareTo de la interfaz Comparable, adaptandolo a nuestro programa
	@Override
	public int compareTo(Vehiculos o) {
		// TODO Auto-generated method stub
		 int resultado=0;

	        if (this.anyoEntradaTaller>o.anyoEntradaTaller) {   resultado = -1;      }

	        else if (this.anyoEntradaTaller<o.anyoEntradaTaller) {    resultado = 1;      }

	        
	        return resultado;
	}

		
	
}
