package modelo;

public abstract class Usuario {

	protected String idUsuario;
	protected String contrasenia;
	protected String nombre;
	
	protected Usuario(String idUsuario, String contrasenia, String nombre) {
		this.idUsuario = idUsuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
	}
	
	protected void login() {
		//TODO: FALTA CREAR METODO
	}
}
