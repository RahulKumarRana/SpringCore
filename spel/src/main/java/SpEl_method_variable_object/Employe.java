package SpEl_method_variable_object;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employe {
	    @Value("T{}")
          private String EmpName;
          private String Address;
          private String position;
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		@Override
		public String toString() {
			return "Employe [EmpName=" + EmpName + ", Address=" + Address + ", position=" + position + "]";
		}
          
          
}
