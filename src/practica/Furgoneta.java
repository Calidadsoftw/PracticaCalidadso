package practica;

public class Furgoneta extends Vehiculos{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6201031167084869345L;
	
	
	private int numeroPuertas;
	private int capacidadAlmacenamiento;
	private String GPS;
	private String sistemaClimatizacion;
	
	
	public Furgoneta(String matricula,String tipo,String dniCliente,int anyoEntradaTaller,String modelo, String marca, int capacidadMotor, String tipoCombustible, int numeroPasajeros,
			String ABS,  String estadoVehiculo, int numeroPuertas, int capacidadAlmacenamiento, String GPS, String sistemaClimatizacion) {
		super(matricula,tipo,dniCliente,anyoEntradaTaller,modelo, marca, capacidadMotor, tipoCombustible, numeroPasajeros, ABS, estadoVehiculo);
		
		this.numeroPuertas=numeroPuertas;
		this.capacidadAlmacenamiento=capacidadAlmacenamiento;
		this.GPS=GPS;
		this.sistemaClimatizacion=sistemaClimatizacion;
		
	}


	public String getGPS() {
		return GPS;
	}


	public void setGPS(String gPS) {
		GPS = gPS;
	}


	public String getSistemaClimatizacion() {
		return sistemaClimatizacion;
	}


	public void setSistemaClimatizacion(String sistemaClimatizacion) {
		this.sistemaClimatizacion = sistemaClimatizacion;
	}




	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	public int getCapacidadAlmacenamiento() {
		return capacidadAlmacenamiento;
	}


	public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}


	
	

}
