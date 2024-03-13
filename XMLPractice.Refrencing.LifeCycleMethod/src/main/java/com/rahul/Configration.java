package com.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Configration {
public static void main(String[]agrs) {
	
	ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("StudentFile.xml");
//	StudentInfo obj= (StudentInfo) con.getBean("std");
//	System.out.println(obj);
	
	
	StudentInfo obj2=(StudentInfo) con.getBean("collection");
	System.out.println(obj2);
	System.out.println(ob));
	
}
}
