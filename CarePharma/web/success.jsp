<%-- 
    Document   : success
    Created on : Mar 29, 2014, 10:02:48 PM
    Author     : dilphinn
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Data.DataConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <h1>Success!</h1>
        
       
            Welcome <%=session.getAttribute("uname")%>
            
            <a href='logout.jsp'>Log out</a>
      
    </body>
</html>
