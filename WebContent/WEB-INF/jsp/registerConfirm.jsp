<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User"%>
<%
User registerUser = (User) session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registeration</title>
</head>
<body>
<p>We will register this user.</p>
<p>
Name:<%= registerUser.getId() %><br>
LoginID:<%= registerUser.getName() %><br>
<a href="/example/RegisterUser">back</a>
<a href="/example/RegisterUser?action=done">ok</a>
</body>
</html>