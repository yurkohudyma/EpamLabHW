package com.epam.spring.homework1.pet;

import org.springframework.stereotype.Component;

@Component
public class Cheetah implements Animal {
	
	@Override
	public String getPet() {
		return "Cheetah";
	}
	
}
