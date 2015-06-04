package com.samiuddin.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" },
			initParams={@WebInitParam(name="defaultUser", value="John Doe")}
)

public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		//String name = request.getParameter("userName");
		writer.println("Message from Servlet GET Method on the web page");//+name);
		writer.println("Init parameter has default username: "+this.getServletConfig().getInitParameter("defaultUser"));
	}

}
