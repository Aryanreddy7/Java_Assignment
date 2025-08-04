package com.xworkz.spring.BikeConfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BikeWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BikeConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
