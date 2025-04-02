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
    }
}
