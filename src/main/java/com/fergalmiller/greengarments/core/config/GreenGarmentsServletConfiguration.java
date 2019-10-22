package com.fergalmiller.greengarments.core.config;

import javax.annotation.Nonnull;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.fergalmiller.greengarments.GreengarmentsApplication;

public class GreenGarmentsServletConfiguration implements WebApplicationInitializer
{
    public void onStartup(@Nonnull final ServletContext servletContext)
    {
        final AnnotationConfigWebApplicationContext webApplicationContext =
                new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(GreengarmentsApplication.class);
        webApplicationContext.setServletContext(servletContext);

        final ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispatcher", new DispatcherServlet(webApplicationContext));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

    
}
