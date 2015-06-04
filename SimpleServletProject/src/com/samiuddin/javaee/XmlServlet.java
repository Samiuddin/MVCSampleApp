/**
 * 
 */
package com.samiuddin.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author sami
 *
 */
public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet Get Method Called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		out.println("Request Username is: "+userName);
		out.println("Session Username is: "+ (String) session.getAttribute("savedUserName"));
		out.println("Context Username is: "+ (String) context.getAttribute("savedUserName"));
	}
	 
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet Post Method Called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("Hello, World from Post! "+userName + "! Full Name: " + fullName);
		String prof = request.getParameter("prof");
		out.println("You are a "+ prof);
		//String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		out.println("You are at location: "+ location.length + " places");
		for (int i = 0; i < location.length; i++) {
			out.println(location[i]);
		}
	}*/
}
