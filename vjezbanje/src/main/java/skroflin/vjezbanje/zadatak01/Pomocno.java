/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak01;

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

    static Date ucitajDate(String poruka) {
        SimpleDateFormat sdf = new SimpleDateFormat(
                "dd.MM.yyyy.", Locale.of("hr", "HR")
        );
        Date d;
        String s;
        for(;;){
            try{
                System.out.println(poruka);
                s = Pomocno.ulaz.nextLine();
                d = sdf.parse(s);
                if (sdf.format(d).equals(s)) {
                    return d;
                }
                System.out.println("Neispravan datum");
            }catch(Exception e){
                System.out.println("Unos datuma obavezno u `formatu dd.MM.yyyy.`!");
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

    static int ucitajInteger(String poruka) {
        int i = 0;
        while (true) {            
            System.out.println(poruka);
            try {
                i = Integer.parseInt(Pomocno.ulaz.nextLine());
                if(i<0){
                    System.out.println("Broj mora biti pozitivan!");
                }else{
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Greška!");
            }
        }
        return i;
    }
}
