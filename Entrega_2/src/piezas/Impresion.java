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

	public Impresion(String idPieza, Propietario propietario,  String titulo,String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, double valorinicial, List<String> autores,
			Propietario anioCreacion, String material) {
		super(idPieza, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, valorinicial, autores, propietario,
				anioCreacion);
		// TODO Auto-generated constructor stub
		this.material=material;
	}

	
	
}
