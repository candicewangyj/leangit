package com.briup.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="firstServlet",urlPatterns={"/firstServlet"})
public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in first servlet....");
//		PrintWriter out = resp.getWriter();
//		out.println("hello world");
//		out.flush();
//		out.close();
		
		req.getRequestDispatcher("./WEB-INF/jsp/first.html").forward(req, resp);
	//	resp.sendRedirect("./WEB-INF/jsp/first.html");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
