package usuarios;

import java.util.Map;

import modelo.Pieza;
import modelo.Usuario;
import usuarios.Cliente;

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
		//TODO: FALTA CREAR METODO
	}
	
	public void confirmarVenta() {
		//TODO: FALTA CREAR METODO
	}
	
	public void regresarPieza() {
		//TODO: FALTA CREAR METODO
	}
	
	public int aumentarNumComprasCliente(Cliente cliente) {
		int cantidadCompras = cliente.getNumCompras();
		if (cliente.verificacion == true) {
			cantidadCompras++;
		}else {
			System.out.println("Aumento de compras rechazado.");
		}return cantidadCompras;
		

	}
}
