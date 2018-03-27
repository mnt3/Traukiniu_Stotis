package com.traukinio.stotis.security;

/**
 * Created by JP17-2 on 2018.03.27.
 */
import org.springframework.security.access.annotation.Secured;
public interface InterfaceInfoService {
    @Secured("authenticated")
    public String getMsg();
}

