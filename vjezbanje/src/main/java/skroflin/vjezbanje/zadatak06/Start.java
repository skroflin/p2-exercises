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
        Pomocno.ulaz.close();
    }
    
    private Ostavljen unosOstavljenih(){
        System.out.println("Unos ostavljenih:");
        Ostavljen o = new Ostavljen();
        o.setSifra(Pomocno.ucitajInteger("Unesi šifur:"));
        o.setStilFrizure(Pomocno.ucitajChar("Unesi stil frizure:"));
        o.setAsocijalno(Pomocno.ucitajBoolean("Je li osoba asocijalna?"));
        o.setMajica(Pomocno.ucitajChar("Unesi velicinu majice:"));
        o.setGustoca(Pomocno.ucitajFloat("Unesi gustocu:"));
        return o;
    }
}
