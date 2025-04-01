/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak02;

import java.util.Scanner;

/**
 *
 * @author svenk
 */
class Pomocno {
    public static Scanner ulaz;

    static int ucitajInteger(String poruka) {
        while (true) {            
            try {
                System.out.println(poruka);
                return Integer.parseInt(ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Niste unijeli broj!");
            }
        }
    }

    static String ucitajString(String poruka) {
        String s;
        while (true) {            
            System.out.println(poruka);
            s = Pomocno.ulaz.nextLine();
            if (!s.trim().isBlank()) {
                return s;
            }
            System.out.println("Ovo je obavezan unos!");
        }
    }

    static float ucitajFloat(String poruka) {
        while (true) {            
            System.out.println(poruka);
            try {
                return Float.parseFloat(Pomocno.ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Ovo je obavezan unos!");
            }
        }
    }
}
