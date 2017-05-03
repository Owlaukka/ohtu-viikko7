package ohtu.kivipaperisakset;

import java.util.Scanner;
import peli.KPS;
import peli.Pelitehdas;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pelitehdas tehdas = new Pelitehdas(scanner);

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            KPS valittuPeli = tehdas.hae(vastaus);
            if (valittuPeli != null) {
                valittuPeli.pelaa();
            } else {
                break;
            }
        }

    }
}
