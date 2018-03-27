package com.traukinio.stotis;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static javax.servlet.http.HttpServletResponse.*;

/**
 * Created by JP17-2 on 2018.03.27.
 */
@Component("restAuthenticationEntryPoint")
public class SecurityEntryPoint implements AuthenticationEntryPoint {
   @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
       response.sendError(SC_UNAUTHORIZED, "Unauthorized");
    }
}

