package com.epam.spring.homework2.beans;

import com.epam.spring.App;
import com.epam.spring.homework2.validator.Validable;

public class BeanB implements Validable {
	
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
	
	/**
	 * init method defined by XmlApplicationContext
	 */
    public void init() {
        App.out("<---------Custom initMethod from BeanB---------->");
}
    
    /**
	 * init method defined by BeanFactoryPostProcessor
	 */
    
    public void initByBeanFactoryPostProcessor() {
    	App.out("<---------Custom initMethod for BeanB from initByBeanFactoryPostProcessor---------->");
    }
	
	public void destroy() {
		App.out("<--------Custom destroyMethod from BeanB--------->");
	}


}