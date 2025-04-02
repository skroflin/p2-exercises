/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author svenk
 */
public class Start {
    List<Prijava> prijave;
    public Start(){
        Pomocno.ulaz = new Scanner(System.in);
        prijave = new ArrayList<>();
        unosPrijava();
        ispisPrijava();
        preracunProsjeka();
        Pomocno.ulaz.close();
    }
    
    private Student unosStudenta(){
        System.out.println("Unos studenta na prijavu");
        Student student = new Student();
        student.setJmbag(Pomocno.ucitajString("Unesi JMBAG:"));
        student.setIme(Pomocno.ucitajString("Unesi ime studenta:"));
        student.setPrezime(Pomocno.ucitajString("Unesi prezime studenta:"));
        student.setProsjek(Pomocno.ucitajFloat("Unesi prosjek studenta:"));
        return student;
    }
    
    private void unosPrijave(){
        System.out.println("Unos nove prijave");
        Prijava prijava = new Prijava();
        prijava.setSifra(Pomocno.ucitajInteger("Unesi šifru prijave:"));
        prijava.setDatumPrijave(Pomocno.ucitajDate("Unesi datum prijave:"));
        prijava.setStudent(unosStudenta());
        prijave.add(prijava);
    }
    
    private void unosPrijava(){
        do {            
            unosPrijave();
        } while (!Pomocno.ucitajString("Unesi n za prekid unosa prijava").equalsIgnoreCase("n"));
    }
    
    private void ispisPrijava(){
        int sumaPrijava = 0;
        for (Prijava prijava : prijave) {
            sumaPrijava++;
        }
        System.out.println("Ukupan broj prijava iznosi:" + " " + sumaPrijava + ".");
    }
    
    private void preracunProsjeka(){
        Float min, max;
        min = max = prijave.get(0).getStudent().getProsjek();
        for (Prijava prijava : prijave) {
            if(prijava.getStudent().getProsjek() > max){
                max = prijava.getStudent().getProsjek();
            }else{
                min = prijava.getStudent().getProsjek();
            }
        }
        
        System.out.println("Najveći prosjek je:" + " " + max);
        System.out.println("Najmanji prosjek je:" + " " + min);
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
