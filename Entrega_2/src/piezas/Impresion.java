package piezas;

import java.util.List;

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

	public Impresion(String idPieza, String idPropietario, String titulo, String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, double valorInicial, String[] autores, String anioCreacion, String material) {

		super(idPieza, idPropietario, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, valorInicial, autores, anioCreacion);
		this.material=material;
	}

	
	

	
}
