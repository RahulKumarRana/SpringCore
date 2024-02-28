package com.AutoWired;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
         private Details detail;

		@Override
		public String toString() {
			return "Student [detail=" + detail + "]";
		}

		public Details getDetail() {
			return detail;
		}

		public void setDetail(Details detail) {
			this.detail = detail;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
         
         
         
         
}
