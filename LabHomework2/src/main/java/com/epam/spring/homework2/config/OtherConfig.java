package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanX;
import com.epam.spring.homework2.extensions.BeanFactoryPostProcessorImpl;
import com.epam.spring.homework2.extensions.BeanPostProcessorImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
