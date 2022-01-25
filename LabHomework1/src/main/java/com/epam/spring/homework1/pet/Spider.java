package com.epam.spring.homework1.pet;

import org.springframework.stereotype.Component;

@Component
//@Order
public class Spider implements Animal {
	
	@Override
	public String getPet() {
		return "Spider";
	}

}
