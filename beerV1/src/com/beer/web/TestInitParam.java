package com.beer.web;


import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;

public class TestInitParam extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("Test Init Param<br/>");
		

		Enumeration email = getServletConfig().getInitParameterNames();
		while(email.hasMoreElements()){
			pw.println("<br>param name = " + email.nextElements() + "<br>");
		}
		

	}
}