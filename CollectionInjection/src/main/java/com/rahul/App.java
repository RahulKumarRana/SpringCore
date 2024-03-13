package com.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
          public static void main(String[]args) {
        	 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("std.xml");
        	 System.out.println(context);
        	 Std obj= (Std) context.getBean("std1");
        	 System.out.println("Your avilable Names in list is:-" +obj.getNames());
        	 System.out.println("Your rollId's :-"+obj.getRolls());
        	 System.out.println("Avilable course and Duration:-"+obj.getCourse());
          }
}
