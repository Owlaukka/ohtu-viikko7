/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peli;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ola
 */
public class Pelitehdas {
    private HashMap<String, KPS> pelit;
    
    public Pelitehdas(Scanner sc) {
        pelit = new HashMap<>();
        pelit.put("a", new KPSPelaajaVsPelaaja(sc));
        pelit.put("b", new KPSTekoaly(sc));
        pelit.put("c", new KPSParempiTekoaly(sc));
    }
    
    public KPS hae(String valinta) {
        return pelit.get(valinta);
    }
}
