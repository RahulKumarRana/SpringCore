package com.rahul;

import java.util.List;
import java.util.Set;

public class StudentInfo {
    private String Name;
    private int roll;
    private String class_Name;
    private List<String> phones;
    private Set<Integer>Id ;
    
    
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
	public String getClass_Name() {
		return class_Name;
	}
	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<Integer> getId() {
		return Id;
	}
	public void setId(Set<Integer> id) {
		Id = id;
	}

    
	public StudentInfo() {
		super();
	}    
	
    
}
