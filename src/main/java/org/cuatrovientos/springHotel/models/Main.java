package org.cuatrovientos.springHotel.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring.xml");
		
		Hotel hotel = (Hotel) contexto.getBean("hotel1");
		
		
		System.out.println(hotel.toString());
		
	}
}
