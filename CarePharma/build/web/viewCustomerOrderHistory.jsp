

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
        <title>Customer Order History</title>
    </head>
    <body>


<%
  
    String columns[];
    ResultSet rsOrd = null;
    int rid=0;
       
    int[] ordID = null;
    Date[] ordDate = null;
    int[] cusID = null;
    int[] drugID = null;
    int[] qty = null;
    
    

           
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                rsOrd = st.executeQuery("SELECT * FROM customer_order");
                
            }
        catch(Exception e)
            {
                out.println("Error in OrderReport Data Connection :"+e);
            }
        
        try {
        
               
            int i = 0;  
            rsOrd.last();
            rid = rsOrd.getRow();
            System.out.println("Row id"+rid);
            rsOrd.beforeFirst();


            ordID = new int[rid];
            cusID = new int[rid];
            drugID = new int[rid];
            ordDate = new Date[rid];
            qty = new int[rid];
              
              
            while(rsOrd.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                ordID[i] = rsOrd.getInt(1);
                ordDate[i] = rsOrd.getDate(2);
                cusID[i] = rsOrd.getInt(3);
                drugID[i] = rsOrd.getInt(4);
                qty[i]=rsOrd.getInt(5);

                i++;
               
            }
            
            
            }
        
        catch(Exception e1)
            {
                out.println("Error in OrderReport History data extraction :" +e1);
            } 
 
%>



       
   
        
    <table id="tb_cusOrdRecords" border="2" align="center" >
        <tr style=" background-color: lightsteelblue"><td colspan="5" align="center"><h2><b>CarePharma - Customer Order History</b></h2></td></tr>
        <tr style="background-color:  yellowgreen">
            <td ><b>Order ID</b> </td>
            <td><b>Order Date</b> </td>
            <td><b>Customer ID</b> </td>
            <td><b>Drug ID</b> </td>
            <td><b>Quantity</b> </td>
        </tr>
            
            <%
             for(int i = 0;i < ordID.length;i++)
            {
            %>
            
            <tr>
                <td><center> <%= ordID[i] %></center> </td>
                <td><center><%= ordDate[i] %></center> </td>
                <td><center><%= cusID[i] %> </center></td>
                <td><center><%= drugID[i] %></center> </td>
                <td><center><%= qty[i] %></center> </td>
            </tr>
            <%    
            }
            %> 
           
     
        </table>
        
        <center><input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " /></center>
        

    </body>












