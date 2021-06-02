<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="incluido.jsp" %>
	
	<% 
		String definicao = (String) application.getAttribute("sagacidade");	
		out.print(definicao);
	%>
	
	<h2>${sagacidade}</h2>
	<h2>${livro1.autor}</h2>
	
	
	
	

</body>
</html>