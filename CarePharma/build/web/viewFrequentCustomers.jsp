

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.sql.Date" %>
<%@page import="java.util.*" %>
<%@page import="Data.*" %>
<%@page import="Business.*" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Drug Details</title>
    </head>
    <body>


<%
  
    String columns[];
    ResultSet rsFqCusts = null;
    int rid=0;
       
    int[] custID = null;
    String[] custName = null;
    int[] noOfOrders = null;
    
    

           
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                rsFqCusts = st.executeQuery("SELECT customers.Customer_ID,customers.Customer_Name, COUNT(customer_order.Customer_ID) AS Number_Of_Orders FROM (customer_order INNER JOIN customers ON customer_order.Customer_ID=Customers.Customer_ID)GROUP BY Customer_ID HAVING COUNT(customer_order.Customer_ID) > 10 ORDER BY Number_Of_Orders  DESC;");





                
            }
        catch(Exception e)
            {
                out.println("Error in Data Connection :"+e);
            }
        
        try {
        
               
            int i = 0;  
            rsFqCusts.last();
            rid = rsFqCusts.getRow();
            //testing
            //System.out.println("Row id"+rid);
            rsFqCusts.beforeFirst();


            custID = new int[rid];
            custName = new String[rid];
            noOfOrders = new int[rid];
              
              
            while(rsFqCusts.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                custID[i] = rsFqCusts.getInt(1);
                custName[i] = rsFqCusts.getString(2);
                noOfOrders[i]=rsFqCusts.getInt(3);

                i++;
               
            }
            
            
            }
        
        catch(Exception e1)
            {
                out.println("Error in User Details data extraction :" +e1);
            } 
 
%>



       
   
        
    <table id="tb_cusOrdRecords" border="2" align="center" >
        <tr style=" background-color: lightsteelblue"><td colspan="5" align="center"><h2><b>CarePharma - Frequent Customer Details</b></h2><p><b>(customers who has placed more than 10 orders)</b></p></td></tr>
        <tr style="background-color:  yellowgreen">
            <td ><b>Customer ID</b> </td>
            <td><b>Customer Name</b> </td>
            <td><b>No Of Orders</b> </td>
            
        </tr>
            
            <%
             for(int i = 0;i < custID.length;i++)
            {
            %>
            
            <tr>
                <td><center> <%= custID[i] %></center> </td>
                <td><center><%= custName[i] %></center> </td>
                <td><center><%= noOfOrders[i] %></center> </td>
            </tr>
            <%    
            }
            %> 
           
     
        </table>
        
        <center><input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " /></center>
        














