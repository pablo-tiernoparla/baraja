package daw.programacion;

import static daw.programacion.Constantes.*;

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
        super.setCartas(temp);
    }

    @Override
    public void contarRobadas(){
        int num = this.cartas.size() - CANT_F;
        System.out.println("Cartas robadas: " + num);
        int num2 = this.cartas.size();
        System.out.println("Cartas que quedan por robar: " + num2);
    }

}
