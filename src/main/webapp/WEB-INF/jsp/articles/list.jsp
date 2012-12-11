<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

	<head>
		<title>siteweb</title>
		<link rel="stylesheet" type="text/css" href="resources/styles/standard.css" />
	</head>

	<body>
	
		<div id="wrapper">
	
			<%@include file="../nav.jsp" %>
		
			<h1>Liste des Articles</h1>
			
			<c:if test="${empty articles}">
				<h2>Aucune Article</h2>
			</c:if>
		
			<c:forEach var="article" items="${articles}">
				<article>
					<h2>
						<c:out value="${article.titre}"/>
					</h2>					
					<h4>
						<c:out value="${article.auteur}"/>
					</h4>
					<p>
						<c:out value="${article.contenu}"/>
					</p>
				</article>
				<hr/>
			</c:forEach>
		
		</div>
	
	</body>

</html>