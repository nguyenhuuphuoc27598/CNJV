

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginChecker extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 String user = request.getParameter("user");
		 String pass = request.getParameter("pass");
		 if(user.equals("admin") && pass.equals("123")) {
			 out.println("Xin chào: " + user);
			 } else {
				 out.println("Vui lòng đăng nhập lại");
				 }      
		 out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
