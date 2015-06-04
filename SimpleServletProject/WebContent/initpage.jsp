<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Init Params</title>
</head>

<%!
public void jspinit() {
	String defaultUser = getServletConfig().getInitParameter("defaultUser");
	ServletContext context = this.getServletContext();
	context.setAttribute("defaultUser", defaultUser);
}
%>

<body>

The default user from the servlet config is: <%=getServletConfig().getInitParameter("defaultUser")%>
<br>
The init value in Servlet Context is: <%=getServletContext().getAttribute("defaultUser") %>

</body>
</html>