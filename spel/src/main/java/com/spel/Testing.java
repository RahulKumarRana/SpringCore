package com.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
     public static void main(String[]args) {
    	 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/configs/std.xml");
    	 Student2 object=(Student2) context.getBean("stdObject");
    	 System.out.println(object);
     }
}
