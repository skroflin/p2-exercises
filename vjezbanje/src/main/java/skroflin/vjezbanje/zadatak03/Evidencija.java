/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skroflin.vjezbanje.zadatak03;

import java.util.List;

/**
 *
 * @author svenk
 */
public class Evidencija {
   private String nazivEvidencije;
   private String imeSlusatelja;
   private List<Pjesma> pjesme;

    public String getImeSlusatelja() {
        return imeSlusatelja;
    }

    public void setImeSlusatelja(String imeSlusatelja) {
        this.imeSlusatelja = imeSlusatelja;
    }

    public String getNazivEvidencije() {
        return nazivEvidencije;
    }

    public void setNazivEvidencije(String nazivEvidencije) {
        this.nazivEvidencije = nazivEvidencije;
    }

    public List<Pjesma> getPjesme() {
        return pjesme;
    }

    public void setPjesme(List<Pjesma> pjesme) {
        this.pjesme = pjesme;
    }
    
}
