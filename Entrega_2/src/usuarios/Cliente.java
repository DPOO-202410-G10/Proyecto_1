package usuarios;

import modelo.Usuario;

public class Cliente extends Usuario{

	private boolean esPropietario;
	private String telefono;
	private String direccion;
	private int numCompras;
	
	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	public Cliente(String idUsuario, String contrasenia, String nombre) {
		super(idUsuario, contrasenia, nombre);
	}
	
	
	public void setNumCompras(int numeroNuevo) {
		//TODO: FALTA CREAR METODO
	}
}
