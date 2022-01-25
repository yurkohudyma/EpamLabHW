package com.epam.spring;

import com.epam.spring.homework2.beans.BeanA;
import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import com.epam.spring.homework2.beans.BeanE;
import com.epam.spring.homework2.beans.BeanF;
import com.epam.spring.homework2.config.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		var xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		var context = new AnnotationConfigApplicationContext(AppConfig.class);
		out("");
		out("---------------------------");
		out("---------AppContext--------");
		out("---------------------------");
		for (String var : context.getBeanDefinitionNames()) {
			out(var);
		}
		out("------AppContext-END-------");
		out("");
		out("---------------------------");
		out("---------XMLContext--------");
		out("---------------------------");
		for (String var : xmlContext.getBeanDefinitionNames()) {
			out(var);
		}
		out("------XMLContext-END-------\n");

		out(xmlContext.getBean("beanB", BeanB.class).toString());
		out(xmlContext.getBean("beanC", BeanC.class).toString());
		out(xmlContext.getBean("beanD", BeanD.class).toString());

		out(context.getBean("beanA", BeanA.class).toString());
		out(context.getBean("beanE", BeanE.class).toString());
		out(context.getBean("beanF", BeanF.class).toString());

		context.close();
		xmlContext.close();

	}

	public static void out(String string) {
		System.out.println(string);
	}

	public static void out(String[] beanDefinitionNames) {

	}

	public static void out(Class<? extends Object> clazz) {

	}
}
