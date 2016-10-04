package com.carbecho.facade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@ComponentScan(basePackages = {"Beans,ConnectionPackage,Controller,DAO,facade_layer,Factory"})

public class FacadeFactory {
	public Facade getFacade(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Facade facade = (Facade)context.getBean("facade");
		return facade;		
	}
}
