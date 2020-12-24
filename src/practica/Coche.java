package practica;


public class Coche extends Vehiculos {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6024985103487298970L;
	
	
	private int numeroPuertas;
	private int capacidadAlmacenamiento;
	private String GPS;
	private String sistemaClimatizacion;
	private String descapotable;
	
	public Coche(String matricula,String tipo,String dniCliente,int anyoEntradaTaller,String modelo, String marca, int capacidadMotor, String tipoCombustible, int numeroPasajeros,
			String aBS, String estadoVehiculo,  int numeroPuertas, int capacidadAlmacenamiento, String GPS, String sistemaClimatizacion, String descapotable) {
		super(matricula,tipo,dniCliente, anyoEntradaTaller,modelo, marca, capacidadMotor, tipoCombustible, numeroPasajeros, aBS, estadoVehiculo);
		// TODO Auto-generated constructor stub
	
		
		this.numeroPuertas=numeroPuertas;
		this.capacidadAlmacenamiento=capacidadAlmacenamiento;
		this.GPS=GPS;
		this.sistemaClimatizacion=sistemaClimatizacion;
		this.descapotable=descapotable;
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
	public String getDescapotable() {
		return descapotable;
	}
	public void setDescapotable(String descapotable) {
		this.descapotable = descapotable;
	}
	
	///Para comprobar que hemos serializado bien.
	public String toString()
	{
		 return "Matricula: " +matricula + " y duenyo: "+dniCliente+"";
	}
}
