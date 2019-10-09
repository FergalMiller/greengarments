package com.fergalmiller.greengarments.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class GreenGarmentsConfig {

    @Bean
    public ServletRegistrationBean adminServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new org.h2.server.web.WebServlet());
        registrationBean.addUrlMappings("/admin/*");
        return registrationBean;
    }
}
