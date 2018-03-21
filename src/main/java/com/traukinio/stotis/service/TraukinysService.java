package com.traukinio.stotis.service;

import com.traukinio.stotis.model.Traukinys;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.21.
 */

public interface TraukinysService {
    List<Traukinys> rodytiTraukinius();
    Traukinys rodytiTraukiniPagalID(Long id);
    void sukurtiTraukini(Traukinys traukinys);
    void istrintiTraukini(Long id);
    void keitiInfoTraukinio(Traukinys traukinys, Long id);

}
