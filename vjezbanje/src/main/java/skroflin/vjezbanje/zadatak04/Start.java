/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author svenk
 */
public class Start {
    private List<Projekt> projekti;
    public Start(){
        projekti = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        unosProjekata();
        ispisProjekata();
        ispisProsjekaPlace();
        Pomocno.ulaz.close();
    }
    
    private Voditelj ucitajVoditelja(){
        System.out.println("Unos voditelja projekta");
        Voditelj v = new Voditelj();
        v.setIme(Pomocno.ucitajString("Unesi ime voditelja:"));
        v.setPrezime(Pomocno.ucitajString("Unesi prezime voditelja:"));
        v.setGodisnjaPlaca(Pomocno.ucitajFloat("Unesi godisnju placu voditelja:"));
        return v;
    }
    
    private void unosProjekta(){
        System.out.println("Unos novog projekta");
        Projekt p = new Projekt();
        p.setSifra(Pomocno.ucitajString("Unesi sifru projekta:"));
        p.setNazivProjekta(Pomocno.ucitajString("Unesi naziv projekta:"));
        p.setJeGotov(Pomocno.ucitajBoolean("Je li projekt gotov?"));
        p.setVoditelj(ucitajVoditelja());
        projekti.add(p);
    }
    
    private void ispisProjekata(){
        for (Projekt projekt : projekti) {
            System.out.println(projekt.getNazivProjekta() + ":" + " "
            + projekt.getVoditelj().getGodisnjaPlaca()/12 + " " + projekt.isJeGotov());
        }
    }
    
    private void unosProjekata(){
        do {            
            unosProjekta();
        } while (!Pomocno.ucitajString("Gotov s unosom projekata?" + " " + "(g)").equalsIgnoreCase("g"));
    }
    
    private void ispisProsjekaPlace(){
        float sumaPlaca = 0;
        int brojZavrsenihProjekata = 0;
        for (Projekt projekt : projekti) {
            if (projekt.isJeGotov() == true) {
                sumaPlaca += projekt.getVoditelj().getGodisnjaPlaca()/12;
                brojZavrsenihProjekata++;
            }
        }
        System.out.println("Prosjecna mjesecna plaća završenih projekata iznosi:" + " " + sumaPlaca/brojZavrsenihProjekata);
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
