<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common.jsp" %>
<%
List<String> list = new ArrayList<String>();
for(int i=0; i<10; i++){
	String number = String.valueOf(i);
	list.add(number);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include sample</title>
</head>
<body>
<h1>Sample page</h1>
<p>Show number from 0 to 9</p>
<% for (int i=0; i<list.size(); i++){ %>
<p><%= list.get(i) %></p>
<% } %>
<jsp:include page="/footer.jsp" />
</body>
</html>