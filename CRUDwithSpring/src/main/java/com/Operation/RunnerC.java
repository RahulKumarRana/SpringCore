package com.Operation;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Utilities.Student1;

public class RunnerC {
	
	public JdbcTemplate tem;
   public static void main(String []args){
	   
	   try (
	   //Creating Object of bean of operation's..
	   ClassPathXmlApplicationContext Operations=
			              new ClassPathXmlApplicationContext("com/OperationConfig/OperationConfig.xml");
	   
			   //Creating Object of bean of Utilities bean's...
	ClassPathXmlApplicationContext utility = new ClassPathXmlApplicationContext("com/Utilityconfig/StudentConfig.xml")) {
		Student1 stdObj=utility.getBean("std",Student1.class);
		   
		Scanner sc=new Scanner(System.in);
		   System.out.println("Do you want to register?[y/n]");char choice=sc.next().charAt(0);
		   if(choice=='y') {
			   System.out.println("Enter your Qulified Name:");
			   String Name=sc.next();
			   System.out.println("Enter your University roll-code:");
			   int roll=sc.nextInt();
			   System.out.println("Enter your Cource:");
			   String cource=sc.next();
			   stdObj.setName(Name);
			   stdObj.setId(roll);
			   stdObj.setCource(cource);
			   
			   DAO Obj=Operations.getBean("stdDAO",DAO.class);
			   
			   int result=Obj.create(stdObj);
			   System.out.println(result+"\t Effected...");
			   
		   }else {System.out.println("Ok Fuck you , You Mather Fucker..");}
//		   System.out.println(stdObj);
		   // Extracting bean of DAO_C..
		 
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
   }
}
