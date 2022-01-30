package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.validator.Validable;

public class BeanF implements Validable {
	
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
	
}
