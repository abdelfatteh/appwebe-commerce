<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>

      <h2>Liste des produits</h2>
    <table border="1" width="50%">
		<tr>
			<th>id</th>
			<th>designation</th>
			<th>prix</h>
			<th>qantite</th>			
		</tr>
		
		<!--  listeProduit  -->
		<sw:forEach items="${listeProduit}" var="o" >
			<tr>
				<td>${o.id }</td>
				<td>${o.desgnation }</td>
				<td>${o.prix }</td>
				<td>${o.qantite }</td>				
			</tr>
		</sw:forEach>
	</table>
   </body>
   
</html>