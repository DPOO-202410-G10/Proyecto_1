package piezas;

import modelo.Pieza;
import usuarios.Propietario;

public class Pintura extends Pieza{
	
	
	private String tecnica;
	private String tipo;
	private float peso;
	
	
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Pintura(String idPieza, String titulo, String lugarCreacion, float ancho, float alto, String fechaLimite,
			boolean valorFijo, Propietario propietario) {
		super(idPieza, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, propietario);
		// TODO Auto-generated constructor stub
		this.tecnica=tecnica;
		this.tipo=tipo;
		this.peso=peso;
		
	}
	
	
	

}
