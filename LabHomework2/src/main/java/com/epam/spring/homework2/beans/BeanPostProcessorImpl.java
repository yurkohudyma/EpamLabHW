package com.epam.spring.homework2.beans;

import com.epam.spring.App;
import com.epam.spring.CustomValidator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		App.out(beanName+": postProcessBeforeInitialization");
		if(bean instanceof CustomValidator) {
			((CustomValidator)bean).validate();
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		App.out(beanName+": postProcessAfterInitialization");
		return bean;
	}
}
