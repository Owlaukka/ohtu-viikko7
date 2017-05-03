package peli;


import java.util.Scanner;
import aly.TekoalyParannettu;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {
    
    public KPSParempiTekoaly(Scanner sc) {
        super(sc);
    }

    @Override
    public void pelaa() {
        tekoaly = new TekoalyParannettu(20);
        super.pelaa();
    }
}
