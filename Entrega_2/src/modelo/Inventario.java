package modelo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import persistencia.Cargador;

public class Inventario {
	//Atributos
	Map<String, Map<String, Pieza>> piezas;
	
	
	
	//Constructor
	public Inventario(Cargador cargador) throws IOException {
		this.piezas = cargador.cargarInventario(File.separator + "Entrega_2" + File.separator + "data" + File.separator + "administrador.csv");
	}
	
	
	
//< Metodos >=====================================================================================================x>
	public void addPieza(Pieza pieza) {
		if (getPieza(pieza.getIdPieza()) != null) {
			this.piezas.get("bodega").put(pieza.getIdPieza(), pieza);
		}
	}
	
	
	public void cambiarEstadoPieza(String idPieza, String estadoNuevo) {
		for (String estado: this.piezas.keySet()) {
			if (piezas.get(estado).containsKey(idPieza) && !estadoNuevo.equals(estado)) {
				piezas.get(estado).remove(idPieza);
				piezas.get(estadoNuevo).put(idPieza, getPieza(idPieza));
			}
		}
	}
	
	
	public Pieza getPieza(String idPieza) {
		for (Map<String, Pieza> conjuntos: this.piezas.values()) {
			if (conjuntos.containsKey(idPieza)) {
				return conjuntos.get(idPieza);
			}
		}
		return null;
	}
//<x==============================================================================================================x>
}
