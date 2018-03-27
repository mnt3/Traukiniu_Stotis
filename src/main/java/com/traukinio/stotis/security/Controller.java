package com.traukinio.stotis.security;

/**
 * Created by JP17-2 on 2018.03.27.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private UserDetailsService userService;

    @RequestMapping(path = "/info2", method = RequestMethod.GET)
    public @ResponseBody
    String greeting(Authentication authentication) {
        return "Spring Security In-memory Authentication Example";
    }

}
