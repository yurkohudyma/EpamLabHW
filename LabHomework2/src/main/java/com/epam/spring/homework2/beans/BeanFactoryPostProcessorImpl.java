package com.epam.spring.homework2.beans;

import com.epam.spring.App;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) 
			throws BeansException {
		App.out("postProcessBeanFactory");
	}

	
	
	
}