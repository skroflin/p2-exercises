/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak01;

import java.util.List;

/**
 *
 * @author svenk
 */
public class Kolegij {
    private int sifraKolegija;
    private String nazivKolegija;
    private int izostanak;
    private List<Izostanak> izostanci;

    public int getSifraKolegija() {
        return sifraKolegija;
    }

    public void setSifraKolegija(int sifraKolegija) {
        this.sifraKolegija = sifraKolegija;
    }

    public String getNazivKolegija() {
        return nazivKolegija;
    }

    public void setNazivKolegija(String nazivKolegija) {
        this.nazivKolegija = nazivKolegija;
    }

    public int getIzostanak() {
        return izostanak;
    }

    public void setIzostanak(int izostanak) {
        this.izostanak = izostanak;
    }

    public List<Izostanak> getIzostanci() {
        return izostanci;
    }

    public void setIzostanci(List<Izostanak> izostanci) {
        this.izostanci = izostanci;
    }
    
}
