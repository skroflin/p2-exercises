/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak06;

import java.util.Scanner;

/**
 *
 * @author svenk
 */
class Pomocno {
    public static Scanner ulaz;

    static int ucitajInteger(String poruka) {
        int i = 0;
        while (true) {            
            System.out.println(poruka);
            try {
                i = Integer.parseInt(Pomocno.ulaz.nextLine());
                if (i<0) {
                    System.out.println("Broj ne može biti manji od 0!");
                }else{
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Greška!");
            }
        }
        return i;
    }

    static char ucitajChar(String poruka) {
        String s;
        while (true) {            
            System.out.println(poruka);
            s = ulaz.nextLine();
            if (s.trim().isEmpty()) {
                System.out.println("Ovo je obavezan unos!");
            }
            return s.charAt(0);
        }
    }

    static boolean ucitajBoolean(String poruka) {
        System.out.println(poruka);
        return ulaz.nextLine().toLowerCase().trim().equals("da");
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

    static String ucitajString(String poruka) {
        String s;
        while (true) {            
            System.out.println(poruka);
            s = ulaz.nextLine();
            if (s.trim().isEmpty()) {
                System.out.println("Ovo je obavezan unos!");
            }
            return s;
        }
    }
}
