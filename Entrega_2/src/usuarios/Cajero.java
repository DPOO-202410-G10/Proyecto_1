package usuarios;

import modelo.Pieza;
import modelo.Usuario;

public class Cajero extends Usuario {

	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	public Cajero(String idUsuario, String contrasenia, String nombre) {
		this.idUsuario = idUsuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
	}
	
	public void generarPago(Cliente cliente, Pieza piezas) {
		//TODO: FALTA CREAR MÉTODO!
	}
	
}
