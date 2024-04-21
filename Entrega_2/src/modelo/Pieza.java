package modelo;

import java.util.List;

import usuarios.Propietario;

public abstract class Pieza {
	protected String idPieza;
	protected String titulo;
	protected String lugarCreacion;
	protected double ancho;
	protected double alto;
	protected String fechaLimite;
	protected boolean valorFijo;
	protected String idPropietario;
	protected String[] autores;
	
	
	
	public String getIdPieza() {
		return idPieza;
	}
	public void setIdPieza(String idPieza) {
		this.idPieza = idPieza;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getLugarCreacion() {
		return lugarCreacion;
	}
	public void setLugarCreacion(String lugarCreacion) {
		this.lugarCreacion = lugarCreacion;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public String getPropietario() {
		return this.idPropietario;
	}
	public void setPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}
	
	
	
	public Pieza(String idPieza, String idPropietario, String titulo, String lugarCreacion, double ancho, double alto, String fechaLimite,
			boolean valorFijo, double valorInicial, String[] autores, String anioCreacion) {
		super();
		this.idPieza = idPieza;
		this.titulo = titulo;
		this.lugarCreacion = lugarCreacion;
		this.ancho = ancho;
		this.alto = alto;
		this.fechaLimite = fechaLimite;
		this.valorFijo = valorFijo;
		this.idPropietario = idPropietario;
	}
	
	

}
