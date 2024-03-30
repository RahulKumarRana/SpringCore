package com.Operation;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Utilities.Student1;

public class DAO_C implements DAO{
   private JdbcTemplate template;
	@Override
	public int create(Student1 std) {
		// TODO Auto-generated method stub
		try {
		String query="CREATE DATABASE"+" "+std.getName();
		this.template.execute(query);}catch(Exception e) {
			e.printStackTrace();
		}
	     return 1;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
