package com.AutoWired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("com/AutoWiredconfig/config.xml");
           Object obj = con.getBean("std",Student.class);
           System.out.println(obj);
	}

}
