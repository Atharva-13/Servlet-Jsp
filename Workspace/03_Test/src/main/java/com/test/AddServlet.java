package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		System.out.println("result is = "+k);
		
		//session management
//		req.setAttribute("k", k);
		
		
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, resp);
//		//req dis & redirecct
		
		
//		resp.sendRedirect("sq?k="+k);
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		resp.sendRedirect("sq");
		
		Cookie cookie = new Cookie("k",k+"");
		resp.addCookie(cookie);
		resp.sendRedirect("sq");
		
		
	}
	
//	@Override
//	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i+j;
//		System.out.println("result is = "+k);
//	}
}

