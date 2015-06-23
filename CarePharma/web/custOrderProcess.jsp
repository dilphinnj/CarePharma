<%-- 
    Document   : custOrderProcess
    Created on : Apr 17, 2014, 3:20:49 PM
    Author     : dilphinn
--%>

<%@page import="java.util.*"%>
<%@page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<% 
       
        String  = request.getParameter("txtCN");
        String custTelTxt = request.getParameter("txtTel");
        String custAge = request.getParameter("txtAge");
        
        int custTel = Integer.parseInt(custTelTxt);
        
        try{ 
            //Connection con = null;
            

            try {
                
                  DataConnection.con = null;
                  DataConnection.createConn();
//                Class.forName("com.mysql.jdbc.Driver").newInstance();
//                DataConnection.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/care_ph","root","");

            } catch(Exception e1)
            {
                System.out.println("Connection Error :"+e1.getMessage());
            }
            
            // creating a new customer and adding to records
           try
           {    
                CreateCustomer newCust1 = new CreateCustomer(custName,custTel,custAge);
                UpdateCustomer uCust = new UpdateCustomer();
                
                
                if (custName.length()!= 0 && custAge.length()!=0 )
                {
                    response.sendRedirect("success.jsp");
                    uCust.addCustomer(newCust1);
                }

                else
                {
                    response.sendRedirect("error.jsp");
                }
           }
           
           catch(Exception e3)
           {
               System.out.println("Error in adding record!"+e3);
           }
           
           

            
        }catch(Exception e2)
        {
            System.out.println("SQL error :"+ e2.getMessage());
        }
        
    
    
%>