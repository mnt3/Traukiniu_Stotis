package com.traukinio.stotis.repository;

import com.traukinio.stotis.model.Traukinys;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by JP17-2 on 2018.03.21.
 */
public interface TraukinysRepozitory extends JpaRepository<Traukinys,Long> {
}
