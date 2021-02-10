package com.wing.spring.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.wing.spring.beans");
		Car car = (Car) context.getBean("car");
		System.out.println(car);
	}
}
