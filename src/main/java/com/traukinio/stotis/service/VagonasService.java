package com.traukinio.stotis.service;

import com.traukinio.stotis.model.Vagonas;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.21.
 */
public interface VagonasService {
    List<Vagonas> rodytiVagonus();
    Vagonas rodytiVagona(Long id);
    void sukurtiVagona(Vagonas vagonas);
    void istrintiVagona(Long id);
}
