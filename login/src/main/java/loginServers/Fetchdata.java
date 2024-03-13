package loginServers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Fetchdata
 */
public class Fetchdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fetchdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		   try {
        	   new Connectionclass();
			Connection  con1=Connectionclass.getcon();
        	   String query="SELECT * FROM info";
        	   PreparedStatement std=con1.prepareStatement(query);
        	   ResultSet rs=std.executeQuery();
//        	   while(rs.next()) {
//        		   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//        	   }
                    
//        	
        	   con1.close();
        	   std.close();
        	   
        	   }catch(Exception e) {
        		   e.printStackTrace();
        	   }
		  
		  
	}

}
