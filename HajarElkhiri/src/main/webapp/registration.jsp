<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Register Account</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/Stylecss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <img class="avatar" src="img/book.png">
                <h1>Register Account</h1>
<form action="adduser" method="post">
                   <p>last name</p>
<input type="text" placeholder="" name="Nom" required>
                   <p>first name</p>
<input type="text" placeholder="" name="prenom" required>
                          <p>Age</p>
<input type="number" placeholder="" name="Age" required>
                           <p>log</p>
<input type="text" placeholder="" name="log" required>
                   <p>Password</p>
<input type="password" placeholder="" name="pass" required>
                   <input type="submit" value="Register">
              <p><a href="index.jsp">log in</a>
  </form>
</div>
</div>
</body>

</body>
</html>