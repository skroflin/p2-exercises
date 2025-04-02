/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak04;

/**
 *
 * @author svenk
 */
public class Projekt {
    private String sifra;
    private String nazivProjekta;
    private boolean jeGotov;
    private Voditelj voditelj;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNazivProjekta() {
        return nazivProjekta;
    }

    public void setNazivProjekta(String nazivProjekta) {
        this.nazivProjekta = nazivProjekta;
    }

    public boolean isJeGotov() {
        return jeGotov;
    }

    public void setJeGotov(boolean jeGotov) {
        this.jeGotov = jeGotov;
    }

    public Voditelj getVoditelj() {
        return voditelj;
    }

    public void setVoditelj(Voditelj voditelj) {
        this.voditelj = voditelj;
    }
    
}
