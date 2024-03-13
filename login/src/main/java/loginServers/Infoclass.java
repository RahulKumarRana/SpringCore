package loginServers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Infoclass{
           public static void main(String[]args) {
        	   try {
        	   Connection  con1=new Connectionclass().getcon();
        	   String query="SELECT * FROM info";
        	   PreparedStatement std=con1.prepareStatement(query);
        	   ResultSet rs=std.executeQuery();
        	   while(rs.next()) {
        		   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        	   }
        	   }catch(Exception e) {
        		   e.printStackTrace();
        	   }
           }
}
