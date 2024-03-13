package com.rahul;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Std {
          private List<String> Names;
          private Set<Integer> rolls;
          private Map<String , String> course;
		public List<String> getNames() {
			return Names;
		}
		public void setNames(List<String> names) {
			Names = names;
		}
		public Set<Integer> getRolls() {
			return rolls;
		}
		public void setRolls(Set<Integer> rolls) {
			this.rolls = rolls;
		}
		public Map<String, String> getCourse() {
			return course;
		}
		public void setCourse(Map<String, String> course) {
			this.course = course;
		}
		public Std(List<String> names, Set<Integer> rolls, Map<String, String> course) {
			super();
			Names = names;
			this.rolls = rolls;
			this.course = course;
		}
		public Std() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Std [Names=" + Names + ", rolls=" + rolls + ", course=" + course + "]";
		}
          
          
}
