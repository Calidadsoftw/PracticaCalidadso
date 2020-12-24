package practica;

public class Jefe extends Personas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8738186593219026383L;
	private String codigoJefe;
	public Jefe(String nombre, String apellido, String dni, String calle, int numeroCasa, int codigoPostal, String codigoJefe) {
		super(nombre, apellido, dni, calle, numeroCasa, codigoPostal);
		this.codigoJefe=codigoJefe;
		// TODO Auto-generated constructor stub
	}

	

	public String getCodigoJefe() {
		return codigoJefe;
	}

	public void setCodigoJefe(String codigoJefe) {
		this.codigoJefe = codigoJefe;
	}

	
	

}
