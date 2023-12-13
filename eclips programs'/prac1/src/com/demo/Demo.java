package com.demo;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Demo_c obj=new Demo_c(request.getParameter("name"),request.getParameter("phone"),request.getParameter("email"),request.getParameter("dob"),request.getParameter("gender"),request.getParameter("language"),request.getParameter("program"));
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1 style=\"text-align: center;\">\r\n" + 
				"		Profile Detail\r\n" + 
				"	</h1>\r\n" + 
				"	<hr>\r\n" + 
				"	<br><br><br>\r\n" + 
				"	<form style=\"text-align: left;\" action=\"./Demo\" method=\"get\">\r\n" + 
				"		<table style=\"margin: auto;\">\r\n" + 
				"			<tr>\r\n" + 
				"				<th>Name:-</th>\r\n" + 
				"				<td>"+obj.display("name")+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<th>Phone No.:-</th>\r\n" + 
				"				<td>"+obj.display("phone")+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<th>Email id:-</th>\r\n" + 
				"				<td>"+obj.display("email")+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<th>DOB:-</th>\r\n" + 
				"				<td>"+obj.display("dob")+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<th>Gender:-</th>\r\n" + 
				"				<td>"+obj.display("gender")+"\r\n" + 
				"			</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<th>Mother Language:-</th>\r\n" + 
				"				<td>"+obj.display("language")+"\r\n" + 
				"				</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<th>Selected Language</th>\r\n" + 
				"				<td>"+obj.display("language")+"\r\n" + 
				"				</td>\r\n" + 
				"			</tr>\r\n" + 
				"		</table>\r\n" + 
				"<br><input type=\"submit\" name=\"submit\" value=\"Back\" style=\"display:block;margin:auto;\">"+
				"	</form>\r\n" + 
				"	<br><br><br>\r\n" + 
				"	<hr>\r\n" + 
				"	<footer style=\"text-align:center;\">Created by ABHISHEK</footer>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
