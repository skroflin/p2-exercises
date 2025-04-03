/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author svenk
 */
class Pomocno {
    public static Scanner ulaz;

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

    static Date ucitajDate(String poruka) {
        SimpleDateFormat sdf = new SimpleDateFormat(
        "dd.MM.yyyy.", Locale.of("hr", "HR")
        );
        Date d;
        String s;
        for (;;){
            try{
                System.out.println(poruka);
                s = Pomocno.ulaz.nextLine();
                d = sdf.parse(s);
                if(sdf.format(d).equals(s)){
                    return d;
                }
                System.out.println("Neispravan datum");
            }catch(Exception e){
                System.out.println("Unos datuma je obavezan unos!");
            }
        }
    }
}
