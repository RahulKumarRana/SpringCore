package com.Utilities;

public class Student1 {
	private String Name;
       private int id;
       private String cource;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Student1 [Name=" + Name + ", id=" + id + ", cource=" + cource + "]";
	}  
       
}
