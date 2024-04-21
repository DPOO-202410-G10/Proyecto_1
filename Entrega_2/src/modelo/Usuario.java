package modelo;

public abstract class Usuario {

	protected String idUsuario;
	protected String contrasenia;
	protected String nombre;
	
	public Usuario(String idUsuario, String contrasenia, String nombre) {
		this.idUsuario = idUsuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
	}
	
	protected void login() {
		if (idUsuario == getId() && contrasenia == getContrasenia() && nombre == getNombre()) {
			System.out.println("Login aceptado.");
		}else {
			System.out.println("Login rechazado.");
		}
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getId(){
		return idUsuario;
	}
}
