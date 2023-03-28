package daw.programacion;

import java.util.ArrayList;
import java.util.Collections;

import static daw.programacion.Constantes.*;

public class Española extends Baraja {

    public Española() {
        ArrayList<Carta> temp = new ArrayList<>(CANT_E);
        for (int i = 0; i < PALOS_E.length; i++) {
            for (int j = 0; j < FIGURAS_E.length; j++) {
                Carta tmp = new Carta(PALOS_E[i], FIGURAS_E[j]);
                temp.add(tmp);
            }
        }
        Collections.shuffle(temp);
        super.setCartas(temp);
    }

    @Override
    public void contarRobadas() {
        int num = CANT_E - this.cartas.size();
        System.out.println("Cartas robadas: " + num);
        int num2 = this.cartas.size();
        System.out.println("Cartas que quedan por robar: " + num2);
    }

    @Override
    public void checkPalo(String palo) throws IllegalArgumentException {
        for (int i = 0; i < PALOS_E.length; i++) {
            if (palo.equals(PALOS_E[i])) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public void checkFigura(String figura) throws IllegalArgumentException {
        for (int i = 0; i < FIGURAS_E.length; i++) {
            if (figura.equals(FIGURAS_E[i])) {
                throw new IllegalArgumentException();
            }
        }
    }
}
