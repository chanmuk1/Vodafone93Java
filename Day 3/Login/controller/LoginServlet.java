package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userid = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		if (userid.equals("user1") && password.equals("user1"))
		{
			System.out.println("VALID USER");
			response.sendRedirect("AfterLogin.jsp");
		}
		else
		{
			System.out.println("INVALID USER");
			//                      key            VALUE
			request.setAttribute("errormsg", "INVALID USERID OR PASSWORD");
        	
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
        	rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("INSIDE DOPOST METHOD");
		doGet(request, response);
		
	}
}
