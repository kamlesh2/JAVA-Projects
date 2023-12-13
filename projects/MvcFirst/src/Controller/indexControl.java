package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LogicControl.ADDLogic;

/**
 * Servlet implementation class indexControl
 */
@WebServlet("/indexControl")
public class indexControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		int first=Integer.parseInt(request.getParameter("firstnumber"));
		int second=Integer.parseInt(request.getParameter("secondnumber"));
		
		ADDLogic add=new ADDLogic();
		int sum = add.sumlogic(first, second);
		
		out.print("Two number sum="+sum);
		

	}

}
