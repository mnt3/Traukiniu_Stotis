package com.traukinio.stotis.security;

/**
 * Created by JP17-2 on 2018.03.27.
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@ComponentScan("com.concretepage")
@EnableWebMvc
@Import({ SecurityConfig.class })
public class AppConfig {
}
