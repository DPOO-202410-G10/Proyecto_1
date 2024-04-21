package modelo;

import usuarios.Cliente;
import usuarios.Propietario;

public class Pago {
	private String idPago;
	private String fecha;
	private int iva;
	private double precioFinal;
	private Pieza pieza;
	private Cliente cliente;
	
	
	
	
	public String getIdPago() {
		return idPago;
	}
	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}
	public Pieza getPieza() {
		return pieza;
	}
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public Pago(String idPago, Cliente cliente, Pieza pieza, String fecha, int iva, double precioFinal) {
		super();
		this.idPago = idPago;
		this.fecha = fecha;
		this.iva = iva;
		this.precioFinal = precioFinal;
		this.pieza = pieza;
		this.cliente = cliente;
	}
	
	
	
	  
	
	

}
