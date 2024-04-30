package modelo;

import java.util.HashMap;
import java.util.Map;

import usuarios.Cliente;

public class Subasta {
    private String idSubasta;
    private boolean estadoActivo;
    private Map<String, Pieza> piezas;
    private Map<String, Cliente> clientes;
    private Map<String, Historial> historiales;

    public Subasta(String idSubasta, boolean estadoActivo, Map<String, Pieza> piezas, Map<String, Cliente> clientes, Map<String, Historial> historiales) {
        this.idSubasta = idSubasta;
        this.estadoActivo = estadoActivo;
        this.piezas = piezas;
        this.clientes = clientes;
        this.historiales = historiales;
    }
    
    public Subasta(String idSubasta, Map<String, Pieza> piezas, Map<String, Cliente> clientes) {
    	this.idSubasta = idSubasta;
    	this.estadoActivo = true;
    	this.piezas = piezas;
    	this.clientes = clientes;
    	this.historiales = new HashMap<String, Historial>();
    }
    

    public void addPieza(Pieza pieza) {
        this.piezas.put(pieza.getIdPieza(), pieza);
    }

    public void removePieza(String idPieza) {
        this.piezas.remove(idPieza);
    }

    public void addHistorial(Historial historial) {
        this.historiales.put(historial.getId(), historial);
    }

    public void removeHistorial(String idHistorial) {
        this.historiales.remove(idHistorial);
    }
    
    public boolean getEstado() {
    	return this.estadoActivo;
    }
    
    public boolean estaCliente(String idCliente) {
    	return this.clientes.containsKey(idCliente);
    }
}

		


