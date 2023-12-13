package com_sql;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class indexcontrol
 */
@WebServlet("/indexcontrol")
public class indexcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexcontrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String Password=request.getParameter("password");
		
		out.print("name" +name + "mail:  "+email+" password: "+Password);
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Datainfo", "root","");
			
			PreparedStatement prestm = conn.prepareStatement("DELETE FROM `datainfo` WHERE `datainfo`.`id` = 1");
			//PreparedStatement prestm = conn.prepareStatement("insert into datainfo(name,email) values(?,?)");
			prestm.setString(1,name);
			prestm.setString(2,email);
			int result=prestm.executeUpdate();
			
			out.println(result + "done");
			conn.close();
	
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}

}
