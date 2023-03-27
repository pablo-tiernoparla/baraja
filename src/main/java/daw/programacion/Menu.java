package daw.programacion;

import java.util.Scanner;

public class Menu {
    public static void main( String[] args ) {
        

    }

    public static void menuInicial(int num){
        if (num == 1){
            Baraja bar = new Francesa();
        } else if (num == 2){
            Baraja bar = new Española();
        }
    }

    public static void mensajesMenu(){
        System.out.println("1 para baraja francesa");
        System.out.println("2 para baraja española");
    }

    public static int scan(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    
}
