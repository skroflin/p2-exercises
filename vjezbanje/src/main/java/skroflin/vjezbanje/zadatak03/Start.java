/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author svenk
 */
public class Start {
    private List<Evidencija> evidencije;
    public Start(){
        evidencije = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        ucitajEvidencije();
        ispisiEvidencije();
        Pomocno.ulaz.close();
    }
    
    private Pjesma ucitajPjesmu(){
        Evidencija e = new Evidencija();
        System.out.println("Unos nove pjesme na evidenciji" + " " + e.getNazivEvidencije());
        Pjesma p = new Pjesma();
        p.setNazivIzvodaca(Pomocno.ucitajString("Upiši ime izvođača:"));
        p.setNazivPjesme(Pomocno.ucitajString("Upiši naziv pjesme:"));
        return p;
    }
    
    private List<Pjesma> ucitajPjesme(){
        List<Pjesma> pjesme = new ArrayList<>();
        do {            
            ucitajPjesmu();
        } while (!Pomocno.ucitajString("Unesi x za prekid unosa pjesama na evidenciju!").equalsIgnoreCase("x"));
        return pjesme;
    }
    
    private void ucitajEvidenciju(){
        System.out.println("Unos nove evidencije:");
        Evidencija e = new Evidencija();
        e.setNazivEvidencije(Pomocno.ucitajString("Upiši naziv evidencije:"));
        e.setImeSlusatelja(Pomocno.ucitajString("Upiši ime osobe koja sluša:"));
        e.setPjesme(ucitajPjesme());
        evidencije.add(e);
    }
    
    private void ucitajEvidencije(){
        do {            
            ucitajEvidenciju();
        } while (!Pomocno.ucitajString("Unesi x za prekid unos evidencije").equalsIgnoreCase("x"));
    }
    
    private void ispisiEvidencije(){
        for (Evidencija e : evidencije) {
            Pjesma p = new Pjesma();
            System.out.println(p.getNazivIzvodaca() + ":" + " " + p.getNazivPjesme() + "(" + e.getPjesme().size() + ")");
        }
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
