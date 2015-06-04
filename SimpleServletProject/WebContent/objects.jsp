<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Scope in JSPs</title>
</head>
<body>

<%
String userName = request.getParameter("name");

if (userName != null) {
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContextUserName", userName);
	//pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
	//pageContext.findAttribute("userName");
}
%>

<br>
The username in the request object is: <%=userName %>
<br>
The username in the session object is: <%=session.getAttribute("sessionUserName") %>
<br>
The username in the context (application) object is: <%=application.getAttribute("applicationUserName") %>
<br>
The username in the page context object is: <%=pageContext.getAttribute("pageContextUserName") %>

</body>
</html>