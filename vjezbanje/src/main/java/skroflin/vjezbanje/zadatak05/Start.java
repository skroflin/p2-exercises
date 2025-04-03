/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author svenk
 */
public class Start {
    private List<Dijete> djeca;
    public Start(){
        djeca = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        ucitajDjecu();
        ispisIzbivanja();
        Pomocno.ulaz.close();
    }
    
    private Bolest ucitajBolest(){
        System.out.println("Unos bolesti:");
        Bolest b = new Bolest();
        b.setNazivBolesti(Pomocno.ucitajString("Unesite naziv bolesti:"));
        b.setSimptomiBolesti(Pomocno.ucitajString("Unesite simptome bolesti:"));
        b.setTrajanjeBolesti(Pomocno.ucitajInteger("Unesite dane izbivanja zbog bolesti:"));
        return b;
    }
    
    private List<Bolest> ucitajBolesti(){
        List<Bolest> bolesti = new ArrayList<>();
        do {            
            bolesti.add(ucitajBolest());
        } while (!Pomocno.ucitajString("Unesite slovo k za prekid unosa bolesti").equalsIgnoreCase("k"));
        return bolesti;
    }
    
    private void ucitajDijete(){
        System.out.println("Unos novog djeteta:");
        Dijete d = new Dijete();
        d.setIme(Pomocno.ucitajString("Unesite ime djeteta:"));
        d.setPrezime(Pomocno.ucitajString("Unesite prezime djeteta:"));
        d.setDatumRodenja(Pomocno.ucitajDate("Unesite datum rodenja djeteta:"));
        d.setBolesti(ucitajBolesti());
        djeca.add(d);
    }
    
    private void ucitajDjecu(){
        do {            
            ucitajDijete();
        } while (!Pomocno.ucitajString("Unesite slovo k za prekid unosa djece").equalsIgnoreCase("k"));
    }
    
    private void ispisIzbivanja(){
        int sumaIzbivanja = 0;
        for (Dijete d : djeca) {
            for (Bolest b : d.getBolesti()) {
                sumaIzbivanja += b.getTrajanjeBolesti();
            }
        }
        System.out.println("Ukupan broj dana izbivanja iz vrtica:" + " " + sumaIzbivanja);
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
