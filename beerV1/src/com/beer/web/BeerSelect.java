package com.beer.web;


import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
import com.beer.model.BeerExpert;

public class BeerSelect extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		// res.setContentType("text/html");
		// PrintWriter pw = res.getWriter();
		// pw.println("Beer selection advice<br/>");
		BeerExpert be= new BeerExpert();
		String c = req.getParameter("color");
		List result = be.getBrands(c);
		
		req.setAttribute("styles", result);
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		// try{
			view.forward(req,res);
		// } catch (Exception e) {
		// 	System.out.println("some thing wrong in view.forward");
		// 	e.printStackTrace();
		// }
		
		

		// Iterator it = result.iterator();
		// while(it.hasNext()){
		// 	pw.println("<br/> tyr: " + it.next());
		// }
		
	}
}