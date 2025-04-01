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
        Pomocno.ulaz.close();
    }
    
    private Student unosStudenta(){
        System.out.println("Unos studenta na prijavu");
        Student student = new Student();
        student.setJmbag(Pomocno.ucitajInteger("Unesi JMBAG:"));
        student.setIme(Pomocno.ucitajString("Unesi ime studenta:"));
        student.setPrezime(Pomocno.ucitajString("Unesi prezime studenta:"));
        student.setProsjek(Pomocno.ucitajFloat("Unesi prosjek studenta:"));
        return student;
    }
}
