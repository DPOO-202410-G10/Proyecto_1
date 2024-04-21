package piezas;

import java.util.List;

import modelo.Pieza;
import usuarios.Propietario;

public class Fotografia extends Pieza{
	private String tipo;

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public Fotografia(String idPieza, String idPropietario, String titulo, String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, double valorInicial, String[] autores, String anioCreacion, String tipo) {
		
		super(idPieza, idPropietario, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, valorInicial, autores, anioCreacion);
		this.tipo=tipo;
	}

	
	

}
