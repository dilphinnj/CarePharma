<%-- 
    Document   : logout
    Created on : Mar 30, 2014, 5:13:01 PM
    Author     : dilphinn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Logged out!</h1>
        
<%
session.setAttribute("uname", null);
session.invalidate();

%>

<button onclick="window.location.href='userLogin.jsp'">Back To Login!</button>
    </body>
</html>
