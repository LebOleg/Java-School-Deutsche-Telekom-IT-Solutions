package ru.lebedev.SBBProject.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

public class MainWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();

        root.scan("ru.lebedev.SBBProject");
        servletContext.addListener(new ContextLoaderListener(root));

        DispatcherServlet dispatcherServlet = new DispatcherServlet(new GenericWebApplicationContext());
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        ServletRegistration.Dynamic appServlet = servletContext.addServlet("dispatcher", dispatcherServlet);
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/");
    }
}
