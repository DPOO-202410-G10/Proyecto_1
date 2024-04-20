package usuarios;

import modelo.Usuario;

public class Operador extends Usuario{

	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	public Operador(String idUsuario, String contrasenia, String nombre) {
		super(idUsuario, contrasenia, nombre);
	}
	
	public void crearHistorial(String tituloPieza) {
		//TODO: FALTA CREAR METODO!
	}
	
	public void aniadirPuja(String idComprador, int valor) {
		//TODO: FALTA CREAR METODO
	}
	
	public String[] eliminarPuja() {
		//TODO: FALTA CREAR METODO
		return null;
	}
}
