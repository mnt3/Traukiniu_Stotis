package com.traukinio.stotis.model;

import javax.persistence.Entity;

/**
 * Created by JP17-2 on 2018.03.21.
 */
@Entity
public class KrovininisVagonas extends Vagonas {
    private double keliamojiGalia;

    public KrovininisVagonas() {
    }

    public KrovininisVagonas(String gamintojas, int kiekis, double kaina, double turis, double keliamojiGalia) {
        super(gamintojas, kiekis, kaina, turis);
        this.keliamojiGalia = keliamojiGalia;
    }

    public double getKeliamojiGalia() {
        return keliamojiGalia;
    }

    public void setKeliamojiGalia(double keliamojiGalia) {
        this.keliamojiGalia = keliamojiGalia;
    }
}
