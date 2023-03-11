package com.techpalle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class MyServletTwo extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		pw.append("<h1>Application Form</h1>");
		
		pw.append("Name : <input type=\"text\" /> <br/> ");
		
		pw.append("Email : <input type=\"email\" /> <br/> ");
		
		pw.append("Gender: <input type=\"radio\" name=\"gender\" /> Male"
				+ "<input type=\"radio\" name=\"gender\" /> Female"
				+ "<input type=\"radio\" name=\"gender\" /> Others <br/>");
		
		pw.append("Course : <input type=\"checkbox\" /> Java "
				+ " <input type=\"checkbox\" /> Python"
				+ " <input type=\"checkbox\" /> .Net <br/>");
		
		pw.append("<input type=\"submit\" value=\"submit\" />");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
