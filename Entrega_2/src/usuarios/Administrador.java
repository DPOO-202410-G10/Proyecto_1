package usuarios;

import java.util.Map;

import modelo.Pieza;
import modelo.Usuario;

public class Administrador extends Usuario {

	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	public Administrador(String idUsuario, String contrasenia, String nombre) {
		super(idUsuario, contrasenia, nombre);
	}
	
	public void crearSubasta(Map<String, Cliente> clientes, Map<String, Pieza> piezas) {
		//TODO: FALTA CREAR MÉTODO
	}
	
	public void registrarPieza() {
		//TODO: FALTA CREAR MÉTODO
	}
	
	public void confirmarVenta() {
		//TODO: FALTA CREAR MÉTODO
	}
	
	public void regresarPieza() {
		//TODO: FALTA CREAR MÉTODO
	}
	
	public int aumentarNumComprasCliente(Cliente cliente) {
		return 0;
		//TODO: FALTA CREAR MÉTODO!
	}
}
