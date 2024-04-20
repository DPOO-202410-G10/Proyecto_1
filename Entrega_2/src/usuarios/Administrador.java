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
		System.out.println("Pieza registrada exitosamente en el inventario.");
	}
	
	public void confirmarVenta() {
		System.out.println("Venta confirmada.");
	}
	
	public void regresarPieza() {
		System.out.println("Pieza devuelta");
	}
	
	public int aumentarNumComprasCliente(Cliente cliente) {
		return 0;
		//TODO: FALTA CREAR MÉTODO!
	}
}
