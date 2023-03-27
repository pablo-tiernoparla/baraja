package daw.programacion;

public class Constantes {
    
    public static final String DOS= "Dos";
    public static final String TRES= "Tres";
    public static final String CUATRO= "Cuatro";
    public static final String CINCO= "Cinco";
    public static final String SEIS= "Seis";
    public static final String SIETE= "Siete";
    public static final String OCHO= "Ocho";
    public static final String NUEVE= "Nueve";
    public static final String DIEZ= "Diez";

    //francesa
    public static final String A= "A";
    public static final String J= "J";
    public static final String Q= "Q";
    public static final String K= "K";
    public static final String CORAZONES= "Corazones";
    public static final String DIAMANTES= "Diamantes";
    public static final String PICAS= "Picas";
    public static final String TREBOLES= "Treboles";

    public static final String[] PALOS_F = {CORAZONES, DIAMANTES, PICAS, TREBOLES}; 
    public static final String[] FIGURAS_F = {A, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, J, Q, K};
    public static int CANT_F = PALOS_F.length * FIGURAS_F.length;

    //española
    public static final String AS= "As";
    public static final String SOTA= "Sota";
    public static final String CABALLO= "Caballo";
    public static final String REY= "Rey";
    public static final String ESPADAS= "Espadas";
    public static final String COPAS= "Copas";
    public static final String BASTOS= "Bastos";
    public static final String OROS= "Oros";

    public static final String[] PALOS_E = {ESPADAS, COPAS, BASTOS, OROS};
    public static final String[] FIGURAS_E = {AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, SOTA, CABALLO, REY};
    public static int CANT_E = PALOS_E.length * FIGURAS_E.length;

}
