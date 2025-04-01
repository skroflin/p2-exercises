/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author svenk
 */
public class Start {
    private List<Kolegij> kolegiji;
    public Start(){
        kolegiji = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        // ucitajIzostanke();
        ucitajKolegije();
        Pomocno.ulaz.close();
    }
    
    private Izostanak ucitajIzostanak(){
        System.out.println("Unos izostanka:");
        Izostanak i = new Izostanak();
        i.setDatumIzostanka(Pomocno.ucitajDate("Unesite datum izostanka:"));
        i.setRazlogIzostanka(Pomocno.ucitajString("Unesite razlog izostanka:"));
        return i;
    }
    
    private List<Izostanak> ucitajIzostanke(){
        List<Izostanak> izostanci = new ArrayList();
        do {            
            izostanci.add(ucitajIzostanak());
        } while (!Pomocno.ucitajString("Unesi slovo k za prekid unosa izostanka").equalsIgnoreCase("k"));
        return izostanci;
    }
    
    private void ucitajKolegij(){
        System.out.println("Unos novog kolegija");
        Kolegij k = new Kolegij();
        k.setSifraKolegija(Pomocno.ucitajInteger("Unesi šifru kolegija:"));
        k.setNazivKolegija(Pomocno.ucitajString("Unesi naziv kolegija:"));
        k.setIzostanak(Pomocno.ucitajInteger("Unesi broj dozvoljenih izostanka za ovaj kolegij:"));
        k.setIzostanci(ucitajIzostanke());
        kolegiji.add(k);
    }
    
    private void ucitajKolegije(){
        do {            
            ucitajKolegij();
        } while (!Pomocno.ucitajString("Unesi k za prekid unosa kolegija").equalsIgnoreCase("k"));
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
