import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 String n=request.getParameter("user");
		 String p=request.getParameter("pass");
		   if(n.equals("admin") && p.equals("123")){
		     		RequestDispatcher rd=request.getRequestDispatcher("servlet2");
		     		rd.forward(request, response);
		   }else{
			   	out.print("Sorry UserName or Password Error!");
			   	RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			   	rd.include(request, response);
		        }
	}

}
