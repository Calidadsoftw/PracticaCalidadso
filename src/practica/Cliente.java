package practica;


public class Cliente extends Personas{



	/**
	 * 
	 */
	private static final long serialVersionUID = 8024184679352158419L;
	
	private Vehiculos vehiculo;
	public Cliente(Vehiculos vehiculo,String nombre, String apellido, String dni, String calle, int numeroCasa, int codigoPostal) {
		super(nombre, apellido, dni, calle, numeroCasa, codigoPostal);
		this.vehiculo=vehiculo;
		
		// TODO Auto-generated constructor stub
	}
	


	public Vehiculos getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculos vehiculo) {
		this.vehiculo = vehiculo;
	}		

}
