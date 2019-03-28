package org.jspiders;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class factoryBeanRunner {
	
	public static void main(String[] args) {
		
		BeanFactory context = new XmlBeanFactory(
				new FileSystemResource("src/org/jspiders/context.xml"));
		
		

	}
}
