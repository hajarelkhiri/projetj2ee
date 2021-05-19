<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/mcss.css" rel="stylesheet" type="text/css"/>
<body>
<div class="box">
<form action ="addlivre" method="post">
<h1 >  Let's Add  your</h1>
 <h1>Favorit book</h1>
 <input type="text"  name="Titre" placeholder="Title.."><br/>
<input type="text"  name="NomcompletAuteur" placeholder="Name author..."><br/>
<input type="text"  name="categorie" placeholder="categorie"><br/>
<input type="text"  name="Datedeedution" placeholder="DD-month-YYYY Edition "><br/>
<input type="submit" value="add">
</form>
</div>
</body>
</html>