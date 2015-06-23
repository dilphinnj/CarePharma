

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
    ResultSet rdDrgs = null;
    int rid=0;
       
    int[] drgID = null;
    String[] drgName = null;
    String[] drgDetails = null;
    int[] qty = null;
    int[] ppu = null;
    
    

           
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                rdDrgs = st.executeQuery("SELECT * FROM druglist");
                
            }
        catch(Exception e)
            {
                out.println("Error in User Details Data Connection :"+e);
            }
        
        try {
        
               
            int i = 0;  
            rdDrgs.last();
            rid = rdDrgs.getRow();
            //testing
            //System.out.println("Row id"+rid);
            rdDrgs.beforeFirst();


            drgID = new int[rid];
            drgDetails = new String[rid];
            qty = new int[rid];
            drgName = new String[rid];
            ppu = new int[rid];
              
              
            while(rdDrgs.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                drgID[i] = rdDrgs.getInt(1);
                drgName[i] = rdDrgs.getString(2);
                drgDetails[i] = rdDrgs.getString(3);
                qty[i] = rdDrgs.getInt(4);
                ppu[i]=rdDrgs.getInt(5);

                i++;
               
            }
            
            
            }
        
        catch(Exception e1)
            {
                out.println("Error in User Details data extraction :" +e1);
            } 
 
%>



       
   
        
    <table id="tb_cusOrdRecords" border="2" align="center" >
        <tr style=" background-color: lightsteelblue"><td colspan="5" align="center"><h2><b>CarePharma - Available Drug Details</b></h2></td></tr>
        <tr style="background-color:  yellowgreen">
            <td ><b>Drug ID</b> </td>
            <td><b>Drug Name</b> </td>
            <td><b>Treatment for</b> </td>
            <td><b>Available Qty</b> </td>
            <td><b>Price Per Unit</b> </td>
        </tr>
            
            <%
             for(int i = 0;i < drgID.length;i++)
            {
            %>
            
            <tr>
                <td><center> <%= drgID[i] %></center> </td>
                <td><center><%= drgName[i] %></center> </td>
                <td><center><%= drgDetails[i] %> </center></td>
                <td><center><%= qty[i] %></center> </td>
                <td><center><%= ppu[i] %></center> </td>
            </tr>
            <%    
            }
            %> 
           
     
        </table>
        
<center><input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " /></center>













