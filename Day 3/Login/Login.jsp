<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body align="center">
    <h3>LOGIN</h3>
    <div style="color: red;font-weight: bold;">
    <%
        if(request.getAttribute("errormsg") != null)
        	out.print(request.getAttribute("errormsg"));
    %>
    </div>
    <form action="LoginServlet" method="post">
         <input type="text" name="uid" placeholder="ENTER USER ID">
         <br/><br/>
         <input type="password" name="pass" placeholder="ENTER PASSWORD">
    	 <br/><br/>
    	 <input type="submit" value="LOGIN"> 
    </form>

</body>
</html>