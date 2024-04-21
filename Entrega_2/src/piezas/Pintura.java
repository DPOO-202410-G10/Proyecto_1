package piezas;

import java.util.List;

import modelo.Pieza;
import usuarios.Propietario;

public class Pintura extends Pieza{
	
	private String tecnica;
	private String tipo;
	private double peso;
	
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	
	public Pintura(String idPieza, String idPropietario, String titulo, String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, double valorInicial, String[] autores, String anioCreacion, String tecnica, String tipo, double peso) {
		
		super(idPieza, idPropietario, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, valorInicial, autores, anioCreacion);
		this.tecnica=tecnica;
		this.tipo=tipo;
		this.peso=peso;
		
}
}
