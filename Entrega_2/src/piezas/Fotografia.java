package piezas;

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

	public Fotografia(String idPieza, String titulo, String lugarCreacion, float ancho, float alto, String fechaLimite,
			boolean valorFijo, Propietario propietario) {
		super(idPieza, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, propietario);
		// TODO Auto-generated constructor stub
		this.tipo=tipo;
	}

	
	

}
