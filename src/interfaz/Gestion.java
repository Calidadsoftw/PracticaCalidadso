package interfaz;


import java.io.IOException;

public interface Gestion {

	public void alta(int opcion);
	public void modificar(int opcion);
	public void baja(int opcion);
	public void listar(int opcion);
	public void guardarHistorial(int opcion) throws IOException;
	public  void cargarHistorial() throws IOException, ClassNotFoundException ;
	
}
