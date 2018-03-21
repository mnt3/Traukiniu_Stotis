package com.traukinio.stotis.model;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;
import java.util.*;

/**
 * Created by JP17-2 on 2018.03.21.
 */
@Entity
public class Traukinys {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date data;
    private String gamintojas;
    private String miestas;

    @OneToMany
    List<Vagonas> vagonai = new ArrayList<>();


    public List<Vagonas> getVagonai() {
        return vagonai;
    }

    public void setVagonai(List<Vagonas> vagonai) {
        this.vagonai = vagonai;
    }

    public Traukinys() {
    }

    public Traukinys(Long id, Date data, String gamintojas, String miestas) {
        this.id = id;
        this.data = data;
        this.gamintojas = gamintojas;
        this.miestas = miestas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }
}
