<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title> Liste des produits</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Liste des produits</h1>
    
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>id</th>
          <th>desgnation</th>
          <th>prix</th>
          <th>qantite</th>
        </tr>
        
        <tr>
          <td>${produit.id}</td>
          <td>${produit.desgnation}</td>
          <td>${produit.prix}</td>
          <td>${produit.qantite}</td>
        </tr>
        
      </table>
    </div>
  </body>
  
</html>