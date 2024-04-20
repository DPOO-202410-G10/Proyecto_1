package piezas;

import java.util.List;

import modelo.Pieza;
import usuarios.Propietario;

public class Escultura extends Pieza{
	private float profundidad;
	private List<String> materiales;
	private boolean necesidadElectricidad;
	public float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public List<String> getMateriales() {
		return materiales;
	}
	public void setMateriales(List<String> materiales) {
		this.materiales = materiales;
	}
	public boolean isNecesidadElectricidad() {
		return necesidadElectricidad;
	}
	public void setNecesidadElectricidad(boolean necesidadElectricidad) {
		this.necesidadElectricidad = necesidadElectricidad;
	}
	public Escultura(String idPieza, String titulo, String lugarCreacion, float ancho, float alto, String fechaLimite,
			boolean valorFijo, Propietario propietario) {
		super(idPieza, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, propietario);
		// TODO Auto-generated constructor stub
		this.materiales=materiales;
		this.necesidadElectricidad=necesidadElectricidad;
		this.profundidad=profundidad;
	}
	
	
}

	
	
	

