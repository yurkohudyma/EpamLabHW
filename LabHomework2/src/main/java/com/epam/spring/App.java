package com.epam.spring;

import com.epam.spring.homework2.config.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	public static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	public static void main(String[] args) {

		out("");
		out("\n--------TASK#9-------");
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			out(beanDefinitionName);
		}
		out("--------TASK#9.END-------\n");

		outBeanFromXmlContext("beanB");
		outBeanFromXmlContext("beanC");
		outBeanFromXmlContext("beanD");

		outBeanFromAppContext("beanA");
		outBeanFromAppContext("beanE");
		outBeanFromAppContext("beanF");

		out("\n--------TASK#12-------");
		outAppContextBeanDefinition("beanA");
		outAppContextBeanDefinition("beanE");
		outAppContextBeanDefinition("beanF");
		out("--------TASK#12.END-------\n");

		context.close();
		xmlContext.close();

	}

	public static void out(String string) {
		System.out.println(string);
	}

	public static void outBeanFromXmlContext(String beanName) {
		System.out.println(xmlContext.getBean(beanName).toString());
	}

	public static void outBeanFromAppContext(String beanName) {
		System.out.println(context.getBean(beanName).toString());
	}

	public static void outAppContextBeanDefinition(String beanName) {
		System.out.println(beanName + " definition: " + context.getBeanDefinition(beanName).toString());
	}

}
