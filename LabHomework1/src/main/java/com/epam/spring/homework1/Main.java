package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Pet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(BeansConfig.class);
		ctx.getBean(Pet.class).printPets();
		ctx.close();
	}
}
