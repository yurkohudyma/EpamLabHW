package com.epam.spring.homework2.beans;

import com.epam.spring.App;
import com.epam.spring.CustomValidator;

public class BeanF implements CustomValidator {
	
	private String name;
	private int value;

	public BeanF(String name, int value) {
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

	@Override
	public String toString() {
		return name+"="+value;
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
