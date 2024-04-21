package piezas;

import java.util.List;

import modelo.Pieza;
import usuarios.Propietario;

public class Escultura extends Pieza{

	private double profundidad;
	private String[] materiales;
	private boolean necesidadElectricidad;
	
	
	public double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public String[] getMateriales() {
		return materiales;
	}
	public void setMateriales(String[] materiales) {
		this.materiales = materiales;
	}
	public boolean isNecesidadElectricidad() {
		return necesidadElectricidad;
	}
	public void setNecesidadElectricidad(boolean necesidadElectricidad) {
		this.necesidadElectricidad = necesidadElectricidad;
	}
	
	
	public Escultura(String idPieza, String idPropietario, String titulo, String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, double valorInicial, String[] autores, String anioCreacion, double profundidad, String[] materiales, boolean necesidadElectricidad) {
		
		super(idPieza, idPropietario, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, valorInicial, autores, anioCreacion);
		this.materiales=materiales;
		this.necesidadElectricidad = necesidadElectricidad;
		this.profundidad=profundidad;
	}

}
	
	

