package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {

	private String idSubasta;
    private Pieza pieza;
    private Map<Integer, String> historial; 
    private int valorPuja;
    private int idComprador;
    
    
    
    public Historial(String idSubasta, Pieza pieza, Map<Integer, String> historial, int valorPuja, int idComprador) {
        this.idSubasta = idSubasta;
        this.pieza = pieza;
        this.historial = new HashMap<>();
        this.valorPuja= valorPuja;
        this.idComprador=idComprador;
        
    }
    
    
    public void agregarAlMapa(int valorPuja, String idComprador) {
        historial.put(valorPuja, idComprador);
    }
    
  

}