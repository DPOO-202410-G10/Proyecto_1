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
		return  peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Pintura(String idPieza, Propietario propietario,  String titulo,String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, double valorinicial, List<String> autores,
			Propietario anioCreacion, String tecnica, String tipo, double peso) {
		super(idPieza, titulo, lugarCreacion, ancho, alto, fechaLimite, valorFijo, valorinicial, autores, propietario,
				anioCreacion);
		// TODO Auto-generated constructor stub
		this.tecnica=tecnica;
		this.tipo=tipo;
		this.peso=peso;
	}
}