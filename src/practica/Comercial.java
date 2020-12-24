package practica;

public class Comercial extends Personas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5712867436563261869L;
	
	private String codigoComercial;
	public Comercial(String nombre, String apellido, String dni, String calle, int numeroCasa, int codigoPostal, String codigoComercial) {
		super(nombre, apellido, dni, calle, numeroCasa, codigoPostal);
		// TODO Auto-generated constructor stub
		this.codigoComercial=codigoComercial;
	}
	public String getCodigoComercial() {
		return codigoComercial;
	}
	public void setCodigoComercial(String codigoComercial) {
		this.codigoComercial = codigoComercial;
	}

	
}
