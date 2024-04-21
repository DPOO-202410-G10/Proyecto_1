package piezas;

import java.util.ArrayList;
import java.util.List;

import modelo.Pieza;
import usuarios.Propietario;

public class Escultura extends Pieza{

	private double profundidad;
	private List<String> materiales;
	private boolean necesidadElectricidad;
	public double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(double profundidad) {
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
	public Escultura(String idPieza, Propietario propietario,  String titulo,String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, boolean valorinicial, List<String> autores,
			Propietario anioCreacion, double profundidad,List materiales,boolean necesidadElectricidad) {
		super(idPieza, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, valorinicial, autores, propietario,
				anioCreacion);
		// TODO Auto-generated constructor stub
		this.materiales=new ArrayList<String>();
		this.necesidadElectricidad=necesidadElectricidad;
		this.profundidad=(double) profundidad;
	}
	

}
	
	

