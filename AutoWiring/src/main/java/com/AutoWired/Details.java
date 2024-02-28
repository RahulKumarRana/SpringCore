package com.AutoWired;

public class Details {
         private String Name;
         private String Address;
         private int Roll;
         private String Session;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public int getRoll() {
			return Roll;
		}
		public void setRoll(int roll) {
			Roll = roll;
		}
		public String getSession() {
			return Session;
		}
		public void setSession(String session) {
			Session = session;
		}
		@Override
		public String toString() {
			return "Details [Name=" + Name + ", Address=" + Address + ", Roll=" + Roll + ", Session=" + Session + "]";
		}
		public Details() {
			super();
			// TODO Auto-generated constructor stub
		}
         
         
}
