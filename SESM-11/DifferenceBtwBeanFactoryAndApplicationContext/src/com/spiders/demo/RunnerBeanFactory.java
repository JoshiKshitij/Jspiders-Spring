package com.spiders.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class RunnerBeanFactory {

	public static void main(String[] args) {

		System.out.println("conyainer created");
		ClassPathResource resource = new ClassPathResource("spring.xml");
		BeanFactory container = new XmlBeanFactory(resource);
		
		
		  System.out.println((Human)container.getBean("yum"));
		//  System.out.println((Human)container.getBean("yum"));
		//  System.out.println((Human)container.getBean("yum"));
		 
	}

}
