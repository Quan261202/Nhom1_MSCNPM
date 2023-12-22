package com.example.app;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer { 
    @Override
    public void configureContentNegotiation( ContentNegotiationConfigurer configurer )
    {
        configurer.defaultContentType( MediaType.APPLICATION_JSON );
    }
    
}
