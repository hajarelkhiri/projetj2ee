<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <img class="avatar" src="img/book.png" alt="" width="200" >
                <h1>Inscription</h1>
       <form    action="Test" method="post">
                    <p>Login</p>
<input type="text" placeholder="" name="log" required>
                   <p>Password</p>
<input type="password" placeholder="" name="pass" required>
                   <input type="submit" value="log in">
                   <a href="registration.jsp">create count ?</a>
                </form>
</div>
</div>


<%
if(  request.getParameter("res")!=null)
{
	if(request.getParameter("res").equals("err"))
	{
		%>
		<h3 > your  user name or password are incorrect</h3>
		<% 
		
	}
	
	}


%>


</body>
</html>