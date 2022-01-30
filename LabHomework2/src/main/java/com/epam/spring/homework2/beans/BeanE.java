package com.epam.spring.homework2.beans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.epam.spring.App;
import com.epam.spring.homework2.validator.Validable;

public class BeanE implements Validable {
	
	private String name;
	private int value;
	
	
	public String getName() {
		return name;
	}

	public void setName() {
	}

	public int getValue() {
		return value;
	}

	public void setValue() {
		}

	@Override
	public String toString() {
		return name+"="+value;
	}
	
	public BeanE(String name, int value) {
		this.name=name;
		this.value=value;
	}
	
	/** TASK#8 */
	@PostConstruct
	public static void postConstructMethod() {
		App.out("postConstructMethod invoked from BeanE");
	}

	/** TASK#8 */
	@PreDestroy
	public static void preDestroyMethod() {
		App.out("preDestroyMethod invoked from BeanE");
		
	}
	
}
