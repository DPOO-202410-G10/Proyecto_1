package piezas;

import modelo.Pieza;
import usuarios.Propietario;

public class Impresion extends Pieza{
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Impresion(String idPieza, String titulo, String lugarCreacion, float ancho, float alto, String fechaLimite,
			boolean valorFijo, Propietario propietario) {
		super(idPieza, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, propietario);
		// TODO Auto-generated constructor stub
		this.material=material;
	}

	
	

}
