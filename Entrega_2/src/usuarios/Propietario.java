package usuarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Pieza;
import modelo.Usuario;

public class Propietario extends Usuario{

	public Propietario(String idUsuario, String contrasenia, String nombre, 
			boolean esComprador, String telefono, String direccion, Map<String, Map<String, Pieza>> piezas) {
		super(idUsuario, contrasenia, nombre);
		this.esComprador = esComprador;
		this.telefono = telefono;
		this.direccion = direccion;
		this.piezas = piezas;
	}

	private boolean esComprador;
	private String telefono;
	private String direccion;
	private Map<String, Map<String, Pieza>> piezas;
	
	public String idUsuario;
	public String contrasenia;
	public String nombre;
	
	
	
	public List<Pieza> consultarPiezasBajoDominio(){
		List<Pieza> piezasBajoDom = new ArrayList<>();
		for (Map<String, Pieza> categoria: piezas.values()) {
			for (Pieza pieza: categoria.values()) {
				if (pieza.getPropietario() == this) {
					piezasBajoDom.add(pieza);
				}
			}
		}
		return piezasBajoDom;
	}
	
	private Map<Pieza, List<Propietario>> historialPropietarios = new HashMap<>();
	
	public void agregarHistorialPropietarios(Pieza pieza, List<Propietario> propAnterior) {
		historialPropietarios.put(pieza, propAnterior);
	}
	
	public List<Pieza> consultarPiezasAntiguas(){
		List<Pieza> piezasAntiguas = new ArrayList<>();
		for (Map.Entry<Pieza, List<Propietario>> entry: historialPropietarios.entrySet()) {
			List<Propietario> propAnterior = entry.getValue();
			if (propAnterior.contains(this)) {
				piezasAntiguas.add(entry.getKey());
			}
		}
		return piezasAntiguas;
	}
}
