package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanFactoryPostProcessorImpl;
import com.epam.spring.homework2.beans.BeanPostProcessorImpl;
import com.epam.spring.homework2.beans.BeanX;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.epam.spring.homework1.beans")
public class OtherConfig {
		
	@Bean ("beanFactoryPostProcessorImpl")
	public static BeanFactoryPostProcessorImpl getBeanFactoryPostProcessorImpl() {
		return new BeanFactoryPostProcessorImpl();
	}

	@Bean ("beanPostProcessorImpl")
	public static BeanPostProcessorImpl getBeanPostProcessorImpl() {
		return new BeanPostProcessorImpl();
	}
	
	@Bean ("beanX")
	public BeanX getBeanX() {
		return new BeanX();
	}
}
