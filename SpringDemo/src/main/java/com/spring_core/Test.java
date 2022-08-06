package com.spring_core;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
	
		Employee emp= (Employee) con.getBean("e1");
		
		
		System.out.println(emp);
		con.registerShutdownHook();
		
	}

}
