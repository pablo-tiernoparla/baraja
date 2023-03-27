package daw.programacion;

import java.util.ArrayList;

public abstract class Baraja {
    
    protected ArrayList<Carta> cartas;
    
    public abstract void contarRobadas();

    public Carta robar(){
        Carta robada = this.cartas.get(0);
        this.cartas.remove(robada);
        this.contarRobadas();
        return robada;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    
}
