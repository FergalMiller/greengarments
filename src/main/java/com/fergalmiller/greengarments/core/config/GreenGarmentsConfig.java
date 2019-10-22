package com.fergalmiller.greengarments.core.config;


import javax.annotation.Nonnull;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.fergalmiller")
public class GreenGarmentsConfig implements WebMvcConfigurer
{
    @Bean
    public ServletRegistrationBean adminServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new org.h2.server.web.WebServlet());
        registrationBean.addUrlMappings("/admin/*");
        return registrationBean;
    }

    @Override
    public void configureDefaultServletHandling(@NotNull final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public ViewResolver viewResolver() {
        final InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setContentType("text/html");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Override
    public void addResourceHandlers(@Nonnull final ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
}
