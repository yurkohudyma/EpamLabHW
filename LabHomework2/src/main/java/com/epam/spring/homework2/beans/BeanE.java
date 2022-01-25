package com.epam.spring.homework2.beans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.epam.spring.App;
import com.epam.spring.CustomValidator;

public class BeanE implements CustomValidator {
	
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
	@PostConstruct
	public static void postConstructMethod() {
		App.out("postConstructMethod invoked from BeanE");
	}
	
	@PreDestroy
	public static void preDestroyMethod() {
		App.out("preDestroyMethod invoked from BeanE");
		
	}
	
	@Override
	public void validate() {
		if (null == this.name) {
			App.out("%%%%% '"+this.name+"' is not allowed for 'name' " 
					+ this.getClass().getSimpleName());
		}
		if (0 > this.value) {
			App.out("%%%%% Entry error for  '"
					+ this.value+"': only positive value is allowed for " 
					+ this.getClass().getCanonicalName());

		}

	}
}
