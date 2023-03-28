package daw.programacion;

import static daw.programacion.Constantes.*;

import java.util.Collections;
import java.util.ArrayList;

public class Francesa extends Baraja{

    public Francesa(){
        ArrayList<Carta> temp = new ArrayList<>(CANT_F);
        for (int i = 0 ; i < PALOS_F.length ; i++){
            for (int j = 0 ; j < FIGURAS_F.length ; j++){
                Carta tmp = new Carta(PALOS_F[i], FIGURAS_F[j]);
                temp.add(tmp);
            }
        }
        Collections.shuffle(temp);
        super.setCartas(temp);
    }

    @Override
    public void contarRobadas(){
        int num = CANT_F - this.cartas.size();
        System.out.println("Cartas robadas: " + num);
        int num2 = this.cartas.size();
        System.out.println("Cartas que quedan por robar: " + num2);
    }

    @Override
    public void checkPalo(String palo) throws IllegalArgumentException {
        for (int i = 0; i < PALOS_F.length; i++) {
            if (palo.equals(PALOS_F[i])) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public void checkFigura(String figura) throws IllegalArgumentException {
        for (int i = 0; i < FIGURAS_F.length; i++) {
            if (figura.equals(FIGURAS_F[i])) {
                throw new IllegalArgumentException();
            }
        }
    }
}
