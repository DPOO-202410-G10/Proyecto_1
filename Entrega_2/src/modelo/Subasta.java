package modelo;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private int idSubasta;
    private List<Pieza> piezas;
    private List<Historial> historiales;

    public Subasta(int idSubasta, Pieza pieza, Historial historial) {
        this.idSubasta = idSubasta;
        this.piezas = new ArrayList<>();
        this.historiales = new ArrayList<>();

        this.piezas.add(pieza);
        this.historiales.add(historial);
    }

    public List<Pieza> getPiezas() {
        return piezas;
    }

    public List<Historial> getHistoriales() {
        return historiales;
    }

    public void addPieza(Pieza pieza) {
        this.piezas.add(pieza);
    }

    public void removePieza(Pieza pieza) {
        this.piezas.remove(pieza);
    }

    public void addHistorial(Historial historial) {
        this.historiales.add(historial);
    }

    public void removeHistorial(Historial historial) {
        this.historiales.remove(historial);
    }
}

		


