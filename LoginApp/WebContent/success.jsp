<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.samiuddin.javaee.dto.User"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Successful Login</title>
</head>
<body>

<h3>LOGIN SUCCESSFUL!!</h3>

<!--  <%
//User user = (User)session.getAttribute("user");// from session object
//User user = (User)request.getAttribute("user");// from request object
%> -->

<jsp:useBean id="user" class="com.samiuddin.javaee.dto.User" scope="request"></jsp:useBean>
<jsp:setProperty property="userName" name="user" value="Joker Doe"/>
<!-- Hello <%// = user.getUserName() %> --> <!-- replace it by below line -->

Hello <jsp:getProperty property="userName" name="user"/>

</body>
</html>