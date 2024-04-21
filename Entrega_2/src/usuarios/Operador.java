package usuarios;

import java.util.HashMap;

import modelo.Historial;
import modelo.Pieza;
import modelo.Usuario;

public class Operador extends Usuario{

	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	public Operador(String idUsuario, String contrasenia, String nombre) {
		super(idUsuario, contrasenia, nombre);
	}
	
	public void crearHistorial(String tituloPieza, String idSubasta, Pieza pieza,
			int valorPuja, int idComprador) {
		Historial historial = new Historial(idSubasta, pieza, new HashMap<>(), valorPuja, idComprador);
		historial.agregarAlMapa(valorPuja, idSubasta);
	}
	
	public void aniadirPuja(String idComprador, int valor) {
		//TODO: FALTA CREAR METODO
	}
	
	public String[] eliminarPuja() {
		//TODO: FALTA CREAR METODO
		return null;
	}
}
