/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author svenk
 */
public class Start {
    private List<Zarucnik> zarucnici;
    public Start(){
        zarucnici = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        unosViseZarucnika();
        Pomocno.ulaz.close();
    }
    
    private Ostavljen unosOstavljenih(){
        System.out.println("Unos ostavljenih:");
        Ostavljen o = new Ostavljen();
        o.setSifra(Pomocno.ucitajInteger("Unesi sifru:"));
        o.setStilFrizure(Pomocno.ucitajChar("Unesi stil frizure:"));
        o.setAsocijalno(Pomocno.ucitajBoolean("Je li osoba asocijalna?"));
        o.setMajica(Pomocno.ucitajChar("Unesi velicinu majice:"));
        o.setGustoca(Pomocno.ucitajFloat("Unesi gustocu:"));
        return o;
    }
    
    private void unosZarucnika(){
        System.out.println("Unos novog zarucnika");
        Zarucnik z = new Zarucnik();
        z.setSifra(Pomocno.ucitajInteger("Unesi sifru:"));
        z.setIndiferentno(Pomocno.ucitajBoolean("Je li indeferentan?"));
        z.setPrsten(Pomocno.ucitajInteger("Koliko prstena ima?"));
        z.setKuna(Pomocno.ucitajFloat("Koliko kosta prsten? - iznos u HRK"));
        z.setEkstroventno(Pomocno.ucitajBoolean("Je li zarucnik ekstrovertan?"));
        z.setIntrovertno(Pomocno.ucitajBoolean("Je li zarucnik introvertan?"));
        z.setOstavljen(unosOstavljenih());
        zarucnici.add(z);
    }
    
    private void unosViseZarucnika(){
        do {            
            unosZarucnika();
        } while (!Pomocno.ucitajString("Unesi g za prekid unos!").equalsIgnoreCase("g"));
    }
}
