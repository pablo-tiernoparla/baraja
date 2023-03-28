package daw.programacion;

import java.util.ArrayList;

public abstract class Baraja {
    
    protected ArrayList<Carta> cartas;
    
    public abstract void contarRobadas();

    public abstract void checkPalo(String palo);

    public abstract void checkFigura(String figura);

    public Carta robar(){
        Carta robada = this.cartas.get(this.cartas.size()-1 /* 0 */);
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
