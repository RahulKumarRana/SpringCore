package com.StereotypeServers;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*component Annotation is make class reference objects, just convert the class name in camel case-->*/
//@Component
/* @Component("")  is used for specify the name of class reference object.*/
@Component
public class Student {
	@Value("rahul rana")
              private String StudentName;
	@Value("1001")
	          private int StudentRoll;
	@Value("#{friends}")
	          private List<String> Names;
              
			public String getStudentName() {
				return StudentName;
			}
			public void setStudentName(String studentName) {
				StudentName = studentName;
			}
			public int getStudentRoll() {
				return StudentRoll;
			}
			public void setStudentRoll(int studentRoll) {
				StudentRoll = studentRoll;
			}
			public List<String> getNames() {
				return Names;
			}
			public void setNames(List<String> names) {
				Names = names;
			}
			@Override
			public String toString() {
				return "Student [StudentName=" + StudentName + ", Names=" + Names + ", StudentRoll=" + StudentRoll
						+ "]";
			}
			
			
	}
              
