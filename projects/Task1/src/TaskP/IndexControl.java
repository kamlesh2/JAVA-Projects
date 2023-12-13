package TaskP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexControl
 */
@WebServlet("/IndexControl")
public class IndexControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String mail=request.getParameter("Email");
		String phone=request.getParameter("Phone");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("password");
	//	int pws=Integer,parseInt(request.getParameter("password"));
		
		out.print("name" +name + "Email:  "+mail+" Password: "+password);
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}

	
	private void parseInt(String parameter) {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		doGet(request, response);
		
		
	}

}
