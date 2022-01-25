package com.epam.spring.homework2.beans;

import com.epam.spring.App;
import com.epam.spring.CustomValidator;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="beans.properties")
public class BeanB implements CustomValidator {
	
	private String name;
	private int value;
	
	@Override
	public String toString() {
		return name+"="+value;
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
	
    public void init() {
        System.out.println("<---------Custom initMethod from BeanB---------->");
}
	
	public void destroy() {
		System.out.println("<--------Custom destroyMethod from BeanB--------->");
	}

	@Override
	public void validate() {
		if (null == this.name) {
			App.out("%%%%% '"+this.name+"' is not allowed for 'name' " + this.getClass().getSimpleName());
		}
		if (0 > this.value) {
			App.out("%%%%% Entry error for  '"+this.value+"': only positive value is allowed for " + this.getClass().getCanonicalName());

		}

	}
}