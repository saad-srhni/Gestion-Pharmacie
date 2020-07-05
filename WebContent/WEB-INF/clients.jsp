<%@ page import="java.util.*"%>
<%@ page import="com.gestionPharmacie.entites.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des Clients</title>
</head>
<body>
	<h1>Liste des Clients</h1>
	<ul>

		<%
			Client c = (Client) request.getAttribute("clients");
		%>

		<li>
			<%
				c.getNom();
			%>
		</li>

	</ul>
</body>
</html>