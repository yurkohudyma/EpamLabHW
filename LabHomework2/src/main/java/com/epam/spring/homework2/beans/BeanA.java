package com.epam.spring.homework2.beans;

import com.epam.spring.App;
import com.epam.spring.homework2.validator.Validable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/** TASK# 7 */
public class BeanA implements InitializingBean, DisposableBean, Validable {

	private String name;
	private int value;

	public BeanA(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	/** TASK# 7 */
	@Override
	public String toString() {
		return name + "=" + value;
	}

	/** TASK# 7 */
	@Override
	public void destroy() throws Exception {
		App.out("\n"+"BeanA destroy");
	}

	/** TASK# 7 */	
	@Override
	public void afterPropertiesSet() throws Exception {
		App.out("\n"+"BeanA afterPropertiesSet");
	}

}
