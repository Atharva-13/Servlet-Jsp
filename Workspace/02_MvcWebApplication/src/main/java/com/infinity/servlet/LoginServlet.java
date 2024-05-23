package com.infinity.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("username");	
		String pass = request.getParameter("password");
		
		if(user.equalsIgnoreCase("admin") && pass.equals("admin1234")) {
			//home.jsp
			response.sendRedirect("Home.jsp");
		}else {
			//Error.jsp
			response.sendRedirect("Error.jsp");
		}
	}

}
