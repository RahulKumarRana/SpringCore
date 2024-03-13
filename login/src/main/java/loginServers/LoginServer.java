package loginServers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/loginServer")
 class LoginServer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 LoginBean obj=new LoginBean();
		 
		 String name=request.getParameter("username");
		 String password=request.getParameter("password");
		 
		obj.setName(name);
		obj.setPassword(password);
		boolean finalresult=new LoginDao().getuser(obj);
		if(finalresult) {
			out.print("<h1>you are in,,</h1>");
		}else {out.print("<h1>your are not in database...</h1>");}
		RequestDispatcher dis=request.getRequestDispatcher("loginPage.html");
		dis.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 
	}

}
