<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<table style="border: solid 1px">
		<thead>
			<tr>
				<th>id</th>
				<th>titulo</th>
				<th>data</th>
				<th>preco</th>
				<th>paginas</th>
				<th>autor</th>
			</tr>
		
		</thead>
		
		<c:forEach var="livro" items="${attrLivros}">
			
			<tr>
				<td>${livro.id}</td>
				<td>${livro.titulo}</td>
				<td><f:formatDate value="${livro.dataPublicacao}" pattern="dd/mm/YYYY" /></td>
				<td><f:formatNumber type="currency" value="${livro.preco}" /></td>
				<td>${livro.paginas}</td>
				<td>${livro.autores[0].nome}</td>
			</tr>
		
		</c:forEach>
			

	
	</table>
	

</body>
</html>