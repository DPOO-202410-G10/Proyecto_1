package usuarios;

import modelo.Usuario;

public class Cliente extends Usuario{

	private boolean esPropietario;
	private String telefono;
	private String direccion;
	public int numCompras;
	public boolean verificacion;
	
	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	public Cliente(String idUsuario, String contrasenia, String nombre) {
		super(idUsuario, contrasenia, nombre);
	}

	public int getNumCompras() {
		return numCompras;
	}

	public void setNumCompras(int numCompras) {
		this.numCompras = numCompras;
	}

	
	
	
}
