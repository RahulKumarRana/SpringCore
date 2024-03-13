package com.standaloneCollection;

import java.util.List;

public class Employee {
         private String Name;
         private List<String> Friends;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public List<String> getFriends() {
			return Friends;
		}
		public void setFriends(List<String> friends) {
			Friends = friends;
		}
		@Override
		public String toString() {
			return "Employee [Name=" + Name + ", Friends=" + Friends + "]";
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
         
         
         
}
