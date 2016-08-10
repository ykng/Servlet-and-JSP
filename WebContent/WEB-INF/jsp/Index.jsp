<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SiteEV" %>
<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>siteEV page</title>
</head>
<body>
<h1>Welocome to this page!</h1>
<p>
<a href="/example/SiteIndex?action=like">good</a>:<%= siteEV.getLike() %>人
<a href="/example/SiteIndex?action=dislike">bad</a>:<%= siteEV.getDislike() %>人
<p>
<h2>Do you like Japan?</h2>
</p>
</body>
</html>