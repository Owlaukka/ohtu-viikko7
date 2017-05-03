package peli;

import java.util.Scanner;
import ohtu.kivipaperisakset.Tuomari;

public class KPSPelaajaVsPelaaja extends KPS {

    public KPSPelaajaVsPelaaja(Scanner sc) {
        super(sc);
    }

    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String ekanSiirto = valinnanKysely("Ensimmäisen pelaajan siirto: ");
        String tokanSiirto = valinnanKysely("Toisen pelaajan siirto: ");

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = valinnanKysely("Ensimmäisen pelaajan siirto: ");
            tokanSiirto = valinnanKysely("Toisen pelaajan siirto: ");
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    private String valinnanKysely(String kehote) {
        System.out.print(kehote);
        return scanner.nextLine();
    }
}