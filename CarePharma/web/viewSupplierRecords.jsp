<%-- 
    Document   : viewSupplierRecords
    Created on : Apr 16, 2014, 5:05:44 PM
    Author     : dilphinn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Interface.CreateTables" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supplier Details</title>
    </head>
    <body>
       
    <% CreateTables ct = new CreateTables(); 
    ct.supplierReport();
    %>
        
    <table id="tb_supRecords" border="2" align="center"   >
         <tr style=" background-color: lightsteelblue"><td colspan="5" align="center"><h2><b>CarePharma - Supplier Record</b></h2></td></tr>
        <tr style="background-color:  yellowgreen">
            <td ><b>Supplier ID</b> </td>
            <td><b>Supplier Name</b> </td>
            <td><b>Supplier Telephone</b> </td>
            <td><b>Drug Supplied</b> </td>
            <td><b>Created Admin ID</b> </td>
        </tr>
            
            <%
             for(int i = 0;i < ct.supID.length;i++)
            {
            %>
            
            <tr>
                <td><center> <%= ct.supID[i] %></center> </td>
                <td><center><%= ct.supName[i] %></center> </td>
                <td><center><%= ct.supTel[i] %> </center></td>
                <td><center><%= ct.drugSup[i] %></center> </td>
                <td><center><%= ct.AdmID[i] %></center> </td>
            </tr>
            <%    
            }
            %> 
           
     
        </table>
        
        
       <center><input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " /></center>
      
        
        
        
        
        
        
        
    </body>
</html>
