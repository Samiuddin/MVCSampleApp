package com.samiuddin.javaee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samiuddin.javaee.dto.User;
import com.samiuddin.javaee.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServletPath")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID, password;
		
		userID  = request.getParameter("userid");
		password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userID, password);
		
		if (result) {
			User user = loginService.getUserDetails(userID);
			//request.getSession().setAttribute("user", user);
			request.setAttribute("user", user);
			//response.sendRedirect("success.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");//this doesnt require request from brower again - done on server side only
			dispatcher.forward(request, response);//this transmits control to servlet defined above
			return ;
		}
		else {
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
