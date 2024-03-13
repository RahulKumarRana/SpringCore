package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("stdObject")
public class Student2 {
	     @Value("rahul rana")
              private String Name;
	     @Value("#{33+5}")
              private int roll;
	     @Value("BCA")
	          private String course;
	     
              public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public int getRoll() {
				return roll;
			}
			public void setRoll(int roll) {
				this.roll = roll;
			}
			public String getCourse() {
				return course;
			}
			public void setCourse(String course) {
				this.course = course;
			}
			
			
			public Student2() {
				super();
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				return "Student2 [Name=" + Name + ", roll=" + roll + ", course=" + course + "]";
			}
			
              
}
