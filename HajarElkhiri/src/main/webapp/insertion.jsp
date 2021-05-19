<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>

 <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
 <div class="box">
 <h1> hello you are connected</h1>
<h3>Search....</h3>
<br/>
<br/>
<form  action="affichage" method="Post">
<input type=text name="NomcompletAuteur" placeholder="author name searched.. ">
<input type="submit" value="Search">
<p>Or<p>
</form>
<br/>
<br/>
<form action="affichagecate" method = "post">
<input type=text name="Categorie" placeholder="category searched..">
<input type="submit" value="Search">
<p><a href=" add.jsp">Go to Add your favorit book</a></p>
</form>
</div>



</body>
</body>
</html>