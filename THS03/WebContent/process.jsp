<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="u" class="beans.UserBean"></jsp:useBean>   
    <jsp:setProperty property="username" name="u"/>     
      <jsp:setProperty property="pass" name="u"/>   
 
           You entered:<br>    
              <jsp:getProperty property="username" name="u"/><br>    
                 <jsp:getProperty property="pass" name="u"/><br>
</body>
</html>