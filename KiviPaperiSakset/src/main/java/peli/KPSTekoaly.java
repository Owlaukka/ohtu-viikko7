package peli;

import java.util.Scanner;
import aly.Tekoaly;

public class KPSTekoaly extends KPS {
    
    
    public KPSTekoaly(Scanner sc) {
        super(sc);
    }

    @Override
    public void pelaa() {
        tekoaly = new Tekoaly();
        super.pelaa();
    }
}