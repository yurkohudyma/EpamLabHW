package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanA;
import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import com.epam.spring.homework2.beans.BeanE;
import com.epam.spring.homework2.beans.BeanF;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import (OtherConfig.class)
public class AppConfig {
	
@Bean ("beanA")
@DependsOn(value= {"beanD", "beanB", "beanC"})
public BeanA getBeanA() {
	return new BeanA("Кіло печенька", Integer.MIN_VALUE);
}

@Bean (name = "beanB", initMethod="init", destroyMethod = "destroy")
@ConfigurationProperties (prefix = "beanB")
public static BeanB getBeanB() {
	return new BeanB();
}

@Bean (name = "beanC", initMethod="init", destroyMethod = "destroy")
public BeanC getBeanC() {
	return new BeanC();
}

@Bean (name = "beanD", initMethod="init", destroyMethod = "destroy")
public BeanD getBeanD() {
	return new BeanD();
}

@Bean ("beanE")
public BeanE getBeanE() {
	return new BeanE("Баян Степанович", 13);
}

@Bean ("beanF")
@Lazy
public BeanF getBeanF() {
	return new BeanF("Мерзенний лежебока", Integer.MAX_VALUE);
}
}
