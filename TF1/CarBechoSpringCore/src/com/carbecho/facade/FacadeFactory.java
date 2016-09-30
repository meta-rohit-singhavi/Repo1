package com.carbecho.facade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@ComponentScan(basePackages = {"Beans,ConnectionPackage,Controller,DAO,facade_layer,Factory"})

public class FacadeFactory {
	public Facade getFacade(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");System.out.println("context :" +context.toString());
		Facade facade = (Facade)context.getBean("facade");System.out.println("facade :" +facade.toString());
		return facade;		
	}
}
