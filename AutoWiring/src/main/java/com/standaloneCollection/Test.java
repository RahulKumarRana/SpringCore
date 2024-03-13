package com.standaloneCollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
         public static void main(String [] args) {
        	 ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("com/standAloneCollection/AloneConfig.xml");
        	 Employee obj=c.getBean("standAlone",Employee.class);
        	 System.out.println("List of bestFriends is:-\n"+obj);
        	 System.out.println(obj.getFriends().getClass().getName());
        	 
         }
}
