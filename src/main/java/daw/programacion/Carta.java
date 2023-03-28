package daw.programacion;

public class Carta {
    
    private String palo;
    private String figura;

    public Carta(String palo, String figura) {
        this.palo = palo;
        this.figura = figura;
    }

    @Override
    public String toString() {
        return figura + " de " + palo;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    
}
