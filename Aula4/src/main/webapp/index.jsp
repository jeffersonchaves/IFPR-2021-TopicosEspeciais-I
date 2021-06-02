<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<%
	String mensagem = "ola Scriplet";

	String msg = (String) application.getAttribute("msg");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="menu.jsp" %>
	
	<!-- olaaa -->
	
	<%-- --%>
	
	<h1>Olá JSP</h1>
	<h5><% out.println(mensagem + 10 * 5); %></h5>
	
	<h6><%= msg %></h6>
	
	<% for(int i= 0; i < 5; i++ ){ %>
		<p>repetiu</p>
	<% } %>
	
	<% System.out.print("Tudo foi executado"); %>
	
	<%@ include file="menu.jsp" %>
</body>
</html>