package usuarios;

import java.util.List;

import modelo.Pieza;
import modelo.Usuario;

public class Propietario extends Usuario{

	private boolean esComprador;
	private String telefono;
	private String direccion;
	
	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	public Propietario(String idUsuario, String contrasenia, String nombre) {
		this.idUsuario = idUsuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
	}
	
	public List<Pieza> consultarPiezasBajoDominio(){
		return null;
		//TODO: FALTA CREAR METODO
	}
	
	public List<Pieza> consultarPiezasAntiguas(){
		return null;
		//TODO: FALTA CREAR METODO
	}
}
