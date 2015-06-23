

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
        <title>Drug Supplied Info</title>
    </head>
    <body>


<%
  
    String columns[];
    ResultSet rsOrd = null;
    int rid=0;
       
    int[] supID = null;
    String[] supName = null;
    int[] drugID = null;
    int[] qty = null;
    Date[] supDate = null;
    String[] reOrdLvl = null;
        

           
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                rsOrd = st.executeQuery("SELECT supplier.Supplier_ID, supplier.Supplier_Name,medicine_supplier.Drug_ID, medicine_supplier.Supplied_Quantity, medicine_supplier.Supplied_date,medicine_supplier.Re_Order_Level FROM supplier INNER JOIN medicine_supplier ON supplier.supplier_ID=medicine_supplier.Supplier_ID ORDER BY supplier.Supplier_ID");
                
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


            supID = new int[rid];
            supName = new String[rid];
            drugID = new int[rid];
            supDate = new Date[rid];
            qty = new int[rid];
            reOrdLvl = new String[rid];  
              
            while(rsOrd.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                supID[i] = rsOrd.getInt(1);
                supName[i] = rsOrd.getString(2);
                drugID[i] = rsOrd.getInt(3);
                qty[i]=rsOrd.getInt(4);
                supDate[i] = rsOrd.getDate(5);
                reOrdLvl[i] = rsOrd.getString(6); 
                
                i++;

                
            }
            
                           
            }
        
        catch(Exception e1)
            {
                out.println("Error in OrderReport History data extraction :" +e1);
            } 
 
%>



       
   
        
    <table id="tb_cusOrdRecords" border="2" align="center" >
        <tr style=" background-color: lightsteelblue"><td colspan="6" align="center"><h2><b>CarePharma - Drugs Supplied History</b></h2></td></tr>
        <tr style="background-color:  yellowgreen">
            <td ><b>Supplier ID</b> </td>
            <td><b>Supplier Name</b> </td>
            <td><b>Drug ID</b> </td>
            <td><b>Quantity</b> </td>
            <td><b>Supplied Date</b> </td>
            <td><b>ReOrder Level</b> </td>
            
        </tr>
            
            <%
             for(int i = 0;i < supID.length;i++)
            {
            %>
            
            <tr>
                <td><center> <%= supID[i] %></center> </td>
                <td><center><%= supName[i] %> </center></td>
                <td><center><%= drugID[i] %></center> </td>
                <td><center><%= qty[i] %></center> </td>
                <td><center><%= supDate[i] %></center> </td>
                <td><center><%= reOrdLvl[i] %></center> </td>
            </tr>
            <%    
            }
            %> 
           
     
        </table>
        
<center><input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " /></center>













