package daw.programacion;

import java.util.ArrayList;

import static daw.programacion.Constantes.*;

public class Española extends Baraja{
    
    public Española(){
        ArrayList<Carta> temp = new ArrayList<>(CANT_E);
        for (int i = 0 ; i < PALOS_E.length ; i++){
            for (int j = 0 ; j < FIGURAS_E.length ; j++){
                Carta tmp = new Carta(PALOS_E[i], FIGURAS_E[j]);
                temp.add(tmp);
            }
        }
        super.setCartas(temp);
    }

    @Override
    public void contarRobadas(){
        int num = this.cartas.size() - CANT_E;
        System.out.println("Cartas robadas: " + num);
        int num2 = this.cartas.size();
        System.out.println("Cartas que quedan por robar: " + num2);
    }

    
}
