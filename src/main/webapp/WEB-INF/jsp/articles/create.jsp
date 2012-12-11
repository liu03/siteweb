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
		
			<h1>Poster un article</h1>
			
			<form:form action="poster" method="post" commandName="article">
				
				<form:label path="titre">Titre : </form:label>
				<form:input type="text" path="titre"/>
				
				<br/>
				
				<form:label path="auteur">Auteur : </form:label>
				<form:input type="text" path="auteur"/>
				
				<br/>
				
				<form:label path="contenu">Contenu : </form:label>
				<form:textarea path="contenu"/>
				
				<br/>
				
				<div class="submit">
					<input type="submit" value="poster"/>
        		</div>
				
			</form:form>
		</div>
		
	</body>

</html>