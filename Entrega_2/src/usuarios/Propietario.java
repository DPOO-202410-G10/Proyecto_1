package usuarios;

import java.util.List;
import java.util.Map;

import modelo.Pieza;
import modelo.Usuario;

public class Propietario extends Usuario{

	public Propietario(String idUsuario, String contrasenia, String nombre, 
			Boolean esComprador, String telefono, String direccion, Map<String, Map<String, Pieza>> piezas) {
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
