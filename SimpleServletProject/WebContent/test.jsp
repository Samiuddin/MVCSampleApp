<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Servlet JSP</title>
</head>
<body>

<h3>Testing sample JSPs</h3>

<%!
public int add (int a, int b) {
	return a + b;
}
%>

<%
int i = 1, j = 2, k;
k = i + j;
%>
<br>
Value of K is: <%=k%>
<br>
<%
k = add(199,2001);
%>
<br>
Second Value of K is: <%=k %>
<br>

<%
for (i = 0; i < 5; i++) {
%>
	<br> The new i = <%=i %>
<%}
%>

</body>
</html>