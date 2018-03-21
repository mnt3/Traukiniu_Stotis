package com.traukinio.stotis.service;

import com.traukinio.stotis.model.Traukinys;
import com.traukinio.stotis.repository.TraukinysRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.21.
 */
@Service
public class TraukinysServiceImpl implements TraukinysService {

    private TraukinysRepozitory traukinysRepozitory;

    @Autowired

    public TraukinysServiceImpl(TraukinysRepozitory traukinysRepozitory) {
        this.traukinysRepozitory = traukinysRepozitory;
    }

    @Override
    @Transactional
    public List<Traukinys> rodytiTraukinius() {
        return traukinysRepozitory.findAll();
    }

    @Override
    @Transactional
    public Traukinys rodytiTraukiniPagalID(Long id) {
        return traukinysRepozitory.findById(id).get();
    }

    @Override
    @Transactional
    public void sukurtiTraukini(Traukinys traukinys) {
        traukinysRepozitory.save(traukinys);

    }

    @Override
    @Transactional
    public void istrintiTraukini(Long id) {
        traukinysRepozitory.deleteById(id);
    }

    @Override
    @Transactional
    public void keitiInfoTraukinio(Traukinys traukinys, Long id) {
        Traukinys oldTraukinys = traukinysRepozitory.findById(id).get();
        oldTraukinys.setData(traukinys.getData());
        oldTraukinys.setGamintojas(traukinys.getGamintojas());
        oldTraukinys.setMiestas(traukinys.getMiestas());

    }

}
