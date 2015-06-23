

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
        <title>User Details</title>
    </head>
    <body>


<%
  
    String columns[];
    ResultSet rsOrd = null;
    int rid=0;
       
    int[] usrID = null;
    String[] usrName = null;
    String[] usrType = null;
    String[] usrFullName = null;
    int[] usrTel = null;
    
    

           
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                rsOrd = st.executeQuery("SELECT * FROM users");
                
            }
        catch(Exception e)
            {
                out.println("Error in User Details Data Connection :"+e);
            }
        
        try {
        
               
            int i = 0;  
            rsOrd.last();
            rid = rsOrd.getRow();
            System.out.println("Row id"+rid);
            rsOrd.beforeFirst();


            usrID = new int[rid];
            usrType = new String[rid];
            usrFullName = new String[rid];
            usrName = new String[rid];
            usrTel = new int[rid];
              
              
            while(rsOrd.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                usrID[i] = rsOrd.getInt(1);
                usrName[i] = rsOrd.getString(2);
                usrType[i] = rsOrd.getString(3);
                usrFullName[i] = rsOrd.getString(4);
                usrTel[i]=rsOrd.getInt(6);

                i++;
               
            }
            
            
            }
        
        catch(Exception e1)
            {
                out.println("Error in User Details data extraction :" +e1);
            } 
 
%>



       
   
        
    <table id="tb_cusOrdRecords" border="2" align="center" >
        <tr style=" background-color: lightsteelblue"><td colspan="5" align="center"><h2><b>CarePharma - System User Details</b></h2></td></tr>
        <tr style="background-color:  yellowgreen">
            <td ><b>User ID</b> </td>
            <td><b>User Name</b> </td>
            <td><b>User Type</b> </td>
            <td><b>User Full Name</b> </td>
            <td><b>User Tel No.</b> </td>
        </tr>
            
            <%
             for(int i = 0;i < usrID.length;i++)
            {
            %>
            
            <tr>
                <td><center> <%= usrID[i] %></center> </td>
                <td><center><%= usrName[i] %></center> </td>
                <td><center><%= usrType[i] %> </center></td>
                <td><center><%= usrFullName[i] %></center> </td>
                <td><center><%= usrTel[i] %></center> </td>
            </tr>
            <%    
            }
            %> 
           
     
        </table>
        

<center><input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " /></center>












