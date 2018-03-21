package com.traukinio.stotis.model;

import javax.persistence.Entity;

/**
 * Created by JP17-2 on 2018.03.21.
 */
@Entity
public class KeleivinisVagonas extends Vagonas {

    private int klase;

    public KeleivinisVagonas() {
    }

    public KeleivinisVagonas(String gamintojas, int kiekis, double kaina, double turis, int klase) {
        super(gamintojas, kiekis, kaina, turis);
        this.klase = klase;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }
}
