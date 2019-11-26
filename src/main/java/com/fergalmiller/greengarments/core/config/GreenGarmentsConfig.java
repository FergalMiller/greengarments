package com.fergalmiller.greengarments.core.config;


import javax.annotation.Nonnull;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
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
    @Value(value = "${spring.mvc.view.prefix:/WEB-INF/jsp/}")
    private String viewPrefix;

    @Value(value = "${spring.mvc.view.suffix:.jsp}")
    private String viewSuffix;

    @Bean
    @SuppressWarnings("unchecked")
    public ServletRegistrationBean adminServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new org.h2.server.web.WebServlet());
        registrationBean.addUrlMappings("/admin/*");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean siteMeshFilter()
    {
        final FilterRegistrationBean<CustomSiteMeshFilter> filter = new FilterRegistrationBean<>();
        final CustomSiteMeshFilter siteMeshFilter = new CustomSiteMeshFilter();
        filter.setFilter(siteMeshFilter);
        return filter;
    }

    @Override
    public void configureDefaultServletHandling(@NotNull final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    @Nonnull
    public ViewResolver viewResolver() {
        final InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix(viewPrefix);
        resolver.setSuffix(viewSuffix);
        resolver.setContentType("text/html");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Override
    public void addResourceHandlers(@Nonnull final ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
        registry.addResourceHandler("/favicon.ico")
                .addResourceLocations("/resources/static/");
    }
}
