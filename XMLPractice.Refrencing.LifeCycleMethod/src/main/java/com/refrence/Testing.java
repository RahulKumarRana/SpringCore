package com.refrence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ref/ConfigrationFile.xml");
		A obj=(A) c.getBean("Aref");
		System.out.println(c);
		System.out.println(obj);

	}

}
