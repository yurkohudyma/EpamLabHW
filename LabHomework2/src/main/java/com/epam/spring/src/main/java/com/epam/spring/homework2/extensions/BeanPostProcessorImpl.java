package com.epam.spring.homework2.extensions;

import java.lang.reflect.Field;

import com.epam.spring.App;
import com.epam.spring.homework2.validator.Validable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/** TASK#10 */
public class BeanPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		App.out("\n"+beanName + ": postProcessBeforeInitialization");

		if (bean instanceof Validable) {
			Field fieldName = null;
			Field fieldValue = null;
			String name = null;
			int value = 0;
			try {
				fieldName = bean.getClass().getDeclaredField("name");
				fieldValue = bean.getClass().getDeclaredField("value");
			} catch (NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
			}
			fieldName.setAccessible(true);
			fieldValue.setAccessible(true);
			try {
				name = (String)fieldName.get(bean);
				value = fieldValue.getInt(bean);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			App.out("\n------------------------------------");
			App.out("$$$ VALIDATING " + bean.getClass().getSimpleName());
			App.out("NAME: " + name + "\nVALUE: " + value);
			
			boolean isValid=true;
			if (null == name) {
				App.out("%%%%% '" + name + "' is not allowed for 'name' " + bean.getClass().getSimpleName());
				isValid=false;
			}
			if (0 >= value) {
				App.out("%%%%% '" + value + "' is not allowed for " + bean.getClass().getSimpleName()
						+ ". Only positive is accepted");
				isValid=false;
			}
			if (isValid) {
			App.out("$$$ VALIDATION FOR " + bean.getClass().getSimpleName() + " ACCOMPLISHED");
			}
			else {
				App.out("$$$ VALIDATION FOR " + bean.getClass().getSimpleName() + " FAILED");
			}
			App.out("------------------------------------");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		App.out("\n"+beanName + ": postProcessAfterInitialization");
		return bean;
	}
}
