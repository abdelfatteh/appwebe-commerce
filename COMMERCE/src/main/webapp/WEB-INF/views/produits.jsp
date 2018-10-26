<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
   <head>
      <title>Spring MVC Form Handling</title> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">      
   
   </head>

   <body>
<div class="row">
  <div class="col-2 text-truncate">
Liste des produits
  </div>
</div>

    <table class="table">
    <thead class="thead-dark">
		<tr>
			<th scope="col">id</th>
			<th scope="col">designation</th>
			<th scope="col">prix</h>
			<th scope="col">qantite</th>			
		</tr>
	</thead>	
		
		<sw:forEach items="${listeProduit}" var="o" >
			<tr align="CENTER">
				<td>${o.id }</td>
				<td>${o.desgnation }</td>
				<td>${o.prix }</td>
				<td>${o.qantite }</td>	
           </td>		
			</tr>
		</sw:forEach>
	</table>
   </body>
   
</html>