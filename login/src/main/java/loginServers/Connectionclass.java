package loginServers;

import java.sql.Connection;
import java.sql.DriverManager;
public class Connectionclass {
            static Connection con=null;
            public static Connection getcon() {
            	 String user="root";
            	 String url="jdbc:mysql://localhost:3306/login";
            	String password="password9";
            	try {
            		 con=DriverManager.getConnection(url,user,password);
            	}catch(Exception e) {
            		e.printStackTrace();
            	}
            	return con;
            }
}
