package com.traukinio.stotis.model;

import javax.persistence.Entity;

/**
 * Created by JP17-2 on 2018.03.21.
 */
@Entity
public class LokomatyvasVagonas extends Vagonas{

    private String traukiantisArStumiantis;

    public LokomatyvasVagonas() {
    }

    public LokomatyvasVagonas(String gamintojas, int kiekis, double kaina, double turis, String traukiantisArStumiantis) {
        super(gamintojas, kiekis, kaina, turis);
        this.traukiantisArStumiantis = traukiantisArStumiantis;
    }

    public String getTraukiantisArStumiantis() {
        return traukiantisArStumiantis;
    }

    public void setTraukiantisArStumiantis(String traukiantisArStumiantis) {
        this.traukiantisArStumiantis = traukiantisArStumiantis;
    }
}
