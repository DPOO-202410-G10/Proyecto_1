package modelo;

import usuarios.Propietario;

public abstract class Pieza {
	protected String idPieza;
	protected String titulo;
	protected String lugarCreacion;
	protected float ancho;
	protected float alto;
	protected String fechaLimite;
	protected boolean valorFijo;
	protected Propietario propietario;
	
	
	
	
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
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Pieza(String idPieza, String titulo, String lugarCreacion, float ancho, float alto, String fechaLimite,
			boolean valorFijo, Propietario propietario) {
		super();
		this.idPieza = idPieza;
		this.titulo = titulo;
		this.lugarCreacion = lugarCreacion;
		this.ancho = ancho;
		this.alto = alto;
		this.fechaLimite = fechaLimite;
		this.valorFijo = valorFijo;
		this.propietario = propietario;
	}
	
	

}
