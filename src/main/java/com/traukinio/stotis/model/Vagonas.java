package com.traukinio.stotis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

/**
 * Created by JP17-2 on 2018.03.21.
 */

        @Entity
        public abstract class Vagonas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gamintojas;
    private int kiekis;
    private double kaina;
    private double turis;

    @ManyToOne
    @JsonIgnore
    private Traukinys traukinys;

    public Traukinys getTraukinys() {
        return traukinys;
    }

    public void setTraukinys(Traukinys traukinys) {
        this.traukinys = traukinys;
    }

    public Vagonas() {
    }

    public Vagonas(String gamintojas, int kiekis, double kaina, double turis) {
        this.gamintojas = gamintojas;
        this.kiekis = kiekis;
        this.kaina = kaina;
        this.turis = turis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public double getTuris() {
        return turis;
    }

    public void setTuris(double turis) {
        this.turis = turis;
    }
    public String toString(){
        return "Kaina: "+(kaina*kiekis);
    }
}
