package daw.programacion;

import static daw.programacion.Constantes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean jugar = true;
        while (jugar) {
            mensajesMenu();
            int num = scanInt();
            jugar = menuInicial(num);
        }
    }

    public static boolean menuInicial(int num) {
        boolean robar = true;
        try {
            if (num == 1) {
                Francesa bar = new Francesa();
                for (int i = 0; i < PALOS_F.length; i++) {
                    System.out.print(PALOS_F[i] + " ");
                }
                for (int i = 0; i < FIGURAS_F.length; i++) {
                    System.out.print(FIGURAS_F[i] + " ");
                }
                Carta elegida = escogerCarta(bar);
                while (robar) {
                    mensajesRobar();
                    int numRobar = scanInt();
                    robar = menuRobar(numRobar, bar, elegida);
                }
                return true;
            } else if (num == 2) {
                Española bar = new Española();
                for (int i = 0; i < PALOS_E.length; i++) {
                    System.out.print(PALOS_E[i] + " ");
                }
                for (int i = 0; i < FIGURAS_E.length; i++) {
                    System.out.print(FIGURAS_E[i] + " ");
                }
                Carta elegida = escogerCarta(bar);
                while (robar) {
                    mensajesRobar();
                    int numRobar = scanInt();
                    robar = menuRobar(numRobar, bar, elegida);
                }
                return true;
            }
            return false;
        } catch (IllegalArgumentException a) {
            System.out.println("No has introducido el dato correctamente");
            return true;
        } catch (InputMismatchException b) {
            System.out.println("Eso no es un numero");
            return true;
        }
    }

    public static void mensajesRobar() {
        System.out.println("1 para robar");
        System.out.println("Cualquier otro numero para volver a empezar");
    }

    public static boolean menuRobar(int num, Baraja bar, Carta elegida) {
        if (num == 1) {
            Carta robada = bar.robar();
            System.out.println(robada.toString());
            if (robada.equals(elegida)){
                System.out.println("Felicidades, encontraste tu carta");
                return false;
            }
            return true;
        }
        return false;
    }

    public static void mensajesMenu() {
        System.out.println("1 para baraja francesa");
        System.out.println("2 para baraja española");
        System.out.println("Cualquier otro numero para salir");
    }

    public static int scanInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String scanString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static Carta escogerCarta(Baraja bar) {
        System.out.println("Elige el palo de la carta");
        String palo = scanString();
        bar.checkPalo(palo);
        System.out.println("Elige la figura de la carta");
        String figura = scanString();
        bar.checkFigura(figura);
        Carta elegida = new Carta(palo, figura);
        return elegida;
    }
}
