package com.traukinio.stotis.service;

import com.traukinio.stotis.model.Vagonas;
import com.traukinio.stotis.repository.VagonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.21.
 */
@Service
public class VagonasServiceImpl implements VagonasService {

    private VagonasRepository vagonasRepository;

    @Autowired
    public VagonasServiceImpl(VagonasRepository vagonasRepository) {
        this.vagonasRepository = vagonasRepository;
    }

    @Override
    @Transactional
    public List<Vagonas> rodytiVagonus() {
        return vagonasRepository.findAll();
    }

    @Override
    @Transactional
    public Vagonas rodytiVagona(Long id) {
        return vagonasRepository.findById(id).get();
    }
    public String rodytiVagonoBendraKaina(Long id){
        return vagonasRepository.findById(id).toString();
    }

    @Override
    @Transactional
    public void sukurtiVagona(Vagonas vagonas) {
        vagonasRepository.save(vagonas);

    }

    @Override
    @Transactional
    public void istrintiVagona(Long id) {
        vagonasRepository.deleteById(id);
    }
}
