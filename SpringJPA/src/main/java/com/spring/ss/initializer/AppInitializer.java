package com.spring.ss.initializer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {

	public static String CONFIG_LOCATION = "com.spring.ss.*";

	public void onStartup(ServletContext arg0) throws ServletException {
		System.out.println("Shahid - 1");
		WebApplicationContext context = getContext();
		arg0.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcher = arg0.addServlet("DispatcherServlet", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/*");
		System.out.println("Shahid - 2");
	}

	private AnnotationConfigWebApplicationContext getContext() {
		System.out.println("Shahid - 3");
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation(CONFIG_LOCATION);
		System.out.println("Shahid - 4");
		return context;
	}

}