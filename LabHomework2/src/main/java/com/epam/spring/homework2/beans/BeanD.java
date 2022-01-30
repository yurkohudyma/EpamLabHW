package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.validator.Validable;

public class BeanD implements Validable {
	
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
        System.out.println("<---------Custom initMethod from BeanD---------->");
}
	
	public void destroy() {
		System.out.println("<--------Custom destroyMethod from BeanD--------->");
	}
	

}
