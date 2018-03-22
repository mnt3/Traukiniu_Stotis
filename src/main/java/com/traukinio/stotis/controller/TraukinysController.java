package com.traukinio.stotis.controller;

import com.traukinio.stotis.model.*;
import com.traukinio.stotis.service.TraukinysService;
import com.traukinio.stotis.service.VagonasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.21.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/traukiniai")
public class TraukinysController {

    private TraukinysService traukinysService;
    private VagonasService vagonasService;

    public TraukinysController(TraukinysService traukinysService, VagonasService vagonasService) {
        this.traukinysService = traukinysService;
        this.vagonasService = vagonasService;
    }
    @RequestMapping(method = RequestMethod.GET)
    List<Traukinys> rodytiTraukinius(){
    return traukinysService.rodytiTraukinius();
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    Traukinys rodytiTraukini(@PathVariable final Long id){

        return traukinysService.rodytiTraukiniPagalID(id);
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    void istrintiTraukini(@PathVariable final Long id){
        traukinysService.istrintiTraukini(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    void sukurtiTraukini(@RequestBody final Traukinys traukinys){
        traukinysService.sukurtiTraukini(traukinys);
    }
    @RequestMapping(method = RequestMethod.PUT)
    void atnaujintiTraukini(@RequestBody final Traukinys traukinys, @PathVariable final Long id){
        traukinysService.keitiInfoTraukinio(traukinys,id);
    }
    @RequestMapping( path = "/{id}/Kvagonas",method = RequestMethod.PUT)
    void pridetiVagona(@RequestBody final KeleivinisVagonas vagonas, @PathVariable final Long id){

        vagonas.setTraukinys(traukinysService.rodytiTraukiniPagalID(id));
        traukinysService.rodytiTraukiniPagalID(id).getVagonai().add(vagonas);
        vagonasService.sukurtiVagona(vagonas);


    }
    @RequestMapping( path = "/{id}/Krovvagonas",method = RequestMethod.PUT)
    void pridetiVagona(@RequestBody final KrovininisVagonas vagonas, @PathVariable final Long id){

        vagonas.setTraukinys(traukinysService.rodytiTraukiniPagalID(id));
        traukinysService.rodytiTraukiniPagalID(id).getVagonai().add(vagonas);
        vagonasService.sukurtiVagona(vagonas);


    }
    @RequestMapping( path = "/{id}/Lvagonas",method = RequestMethod.PUT)
    void pridetiVagona(@RequestBody final LokomatyvasVagonas vagonas, @PathVariable final Long id){

        vagonas.setTraukinys(traukinysService.rodytiTraukiniPagalID(id));
        traukinysService.rodytiTraukiniPagalID(id).getVagonai().add(vagonas);
        vagonasService.sukurtiVagona(vagonas);


    }
    @RequestMapping( path = "/{id}/vagonas",method = RequestMethod.DELETE)
    void istrintiVagona(@PathVariable final Long id1){
        vagonasService.istrintiVagona(id1);
    }

}


