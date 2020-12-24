package practica;

public class Mecanico extends Personas{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7190917702007960895L;
	private String codigoMecanico;

	public Mecanico(String nombre, String apellido, String dni, String calle, int numeroCasa, int codigoPostal, String codigoMecanico) {
		super(nombre, apellido, dni, calle, numeroCasa, codigoPostal);
		this.codigoMecanico=codigoMecanico;
		// TODO Auto-generated constructor stub
	}

	public String getCodigoMecanico() {
		return codigoMecanico;
	}

	public void setCodigoMecanico(String codigoMecanico) {
		this.codigoMecanico = codigoMecanico;
	}

	

}
