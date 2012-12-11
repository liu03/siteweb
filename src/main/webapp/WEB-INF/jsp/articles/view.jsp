<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

	<head>
		<title>siteweb</title>
		<link rel="stylesheet" type="text/css" href="../resources/styles/standard.css" />
	</head>

	<body>
	
		<div id="wrapper">
	
			<%@include file="../nav.jsp" %>
		
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
		
		</div>
	
	</body>

</html>