package usuarios;

import java.util.List;

import modelo.Pieza;
import modelo.Usuario;

public class Propietario extends Usuario{

	public Propietario(String idUsuario, String contrasenia, String nombre) {
		super(idUsuario, contrasenia, nombre);
	}

	private boolean esComprador;
	private String telefono;
	private String direccion;
	
	
	
	public List<Pieza> consultarPiezasBajoDominio(){
		return null;
		//TODO: FALTA CREAR METODO
	}
	
	public List<Pieza> consultarPiezasAntiguas(){
		return null;
		//TODO: FALTA CREAR METODO
	}
}
