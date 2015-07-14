package com.beer.web;


import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
import com.beer.model.BeerExpert;

public class BeerSelect extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		BeerExpert be= new BeerExpert();

		pw.println("Beer selection advice<br/>");
		String c = req.getParameter("color");
		List result = be.getBrands(c);

		Iterator it = result.iterator();
		while(it.hasNext()){
			pw.println("<br/> tyr: " + it.next());
		}
		
	}
}