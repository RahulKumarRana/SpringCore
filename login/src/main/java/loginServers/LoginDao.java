package loginServers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
         public boolean getuser(LoginBean obj2) {
        	 
        	 Connectionclass con2=new Connectionclass();
        	 String fillName=obj2.getName();
        	 boolean q=false;
        	 String result=null;
        	  String query="SELECT  userName FROM register WHERE name="+"'"+fillName+"'";
        	  try {
				PreparedStatement std=con2.getcon().prepareStatement(query);
				ResultSet rs=std.executeQuery();
				
				while(rs.next()) {
					result=rs.getString(0);
				}
				if(result==fillName) {
					 q=true;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
        	  return q;
        	 
         }
}
