<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background-color: aqua;
}
</style>
</head>
<body>
<%
HttpSession session_user = request.getSession();
String login =(String) session_user.getAttribute("log");
  %>
<% 

if(login!=null){
%>

<h1>Bien Venu A notre site on Line </h1>
<h2> User Connecté : <%=login %></h2>
<h3>1. <a href="#">Acceuil</a></h3>
<h3>2. <a href="#">Admin Site</a></h3>
<h3>3. <a href="#">Visiteur</a></h3>
<h3>4. <a href="Deconnection">Deconnexion</a></h3>
<%}else{
	out.println("Vous devez vous identifié");
	out.println("<br>");
	out.println("<a href='index.html'>Connexion</a>");

	
	}%>


</body>
</html>