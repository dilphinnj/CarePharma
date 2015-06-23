

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
    ResultSet rsSrchDrugbyName = null;
    ResultSet rsSrchDrugBySup = null;
    int rid=0;
       
    int[] drgID = null;
    String[] drgName = null;
    String[] drgDetails = null;
    int[] qty = null;
    int[] ppu = null;
    
    int[] supID = null;
    String[] supName = null;
    String[] supTel = null;
    int[] admID = null;
    String[] drugName = null;
    
    String srchWrd = null;
    
   
    
    String srchDrgByNameVal = request.getParameter("txtSDN");
    String srchDrgBySupVal = request.getParameter("txtDBSN");
    
    if(!srchDrgByNameVal.equals("")) 
    {
        srchWrd = srchDrgByNameVal;
        
            
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                
                rsSrchDrugbyName = st.executeQuery("SELECT * FROM druglist WHERE Drug_Name = '"+srchWrd+"'");
                if(!rsSrchDrugbyName.next())
                {
                    out.print("No Record Found!!!");
                }
                
                else
                out.print("Record Found!");
            }
        catch(Exception e)
            {
                out.println("Error in User Details Data Connection :"+e);
            }
        
        
        
        
        
        try {
        
            int i = 0;  
            rsSrchDrugbyName.last();
            rid = rsSrchDrugbyName.getRow();
            //testing
            //System.out.println("Row id"+rid);
            rsSrchDrugbyName.beforeFirst();


            drgID = new int[rid];
            drgDetails = new String[rid];
            qty = new int[rid];
            drgName = new String[rid];
            ppu = new int[rid];
              
              
            while(rsSrchDrugbyName.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                drgID[i] = rsSrchDrugbyName.getInt(1);
                drgName[i] = rsSrchDrugbyName.getString(2);
                drgDetails[i] = rsSrchDrugbyName.getString(3);
                qty[i] = rsSrchDrugbyName.getInt(4);
                ppu[i]=rsSrchDrugbyName.getInt(5);

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

        
        
        
        
        <%
        
        
    }    
          
    
    
   //// Search by supplier name 
    
    
    
    else if(!srchDrgBySupVal.equals("")) 
    {
    
        srchWrd = srchDrgBySupVal; 
            
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st2 = DataConnection.con.createStatement();
                
                rsSrchDrugBySup = st2.executeQuery("SELECT * FROM supplier WHERE Supplier_Name = '"+srchWrd+"'");
                if(!rsSrchDrugBySup.next())
                {
                    out.print("No Record Found!!!");
                }
                
                else
                out.print("Record Found!");
                
            }
        catch(Exception e)
            {
                out.println("Error in User Details Data Connection :"+e);
                e.printStackTrace(); 
            }
        
        try {
        
               
            int i = 0;  
            rsSrchDrugBySup.last();
            rid = rsSrchDrugBySup.getRow();
            rsSrchDrugBySup.beforeFirst();

            
            supID = new int[rid];
            supTel= new String[rid];
            admID = new int[rid];
            supName = new String[rid];
            drugName = new String[rid];
              
              
            while(rsSrchDrugBySup.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                supID[i] = rsSrchDrugBySup.getInt(1);
                supName[i] = rsSrchDrugBySup.getString(2);
                supTel[i] = rsSrchDrugBySup.getString(3);
                admID[i] = rsSrchDrugBySup.getInt(4);
                drugName[i]=rsSrchDrugBySup.getString(5);

                i++;
               
            }
            
            
            }
        
        catch(Exception e1)
            {
                out.println("Error in User Details data extraction :" +e1); 
            }     
       
        %>
        
         <table id="tb_rec2" border="2" align="center" >
        <tr style=" background-color: lightsteelblue"><td colspan="5" align="center"><h2><b>CarePharma - Available Drug Details</b></h2></td></tr>
        <tr style="background-color:  yellowgreen">
            <td ><b>Supplier ID</b> </td>
            <td><b>Supplier Name</b> </td>
            <td><b>Supplier Tel</b> </td>
            <td><b>Suppl.Created Admin ID</b> </td>
            <td><b>Drug Name</b> </td>
        </tr>
            
            <%
             for(int i = 0;i < supID.length;i++)
            {
            %>
            
            <tr> 
                <td><center> <%= supID[i] %></center> </td>
                <td><center><%= supName[i] %></center> </td>
                <td><center><%= supTel[i] %> </center></td>
                <td><center><%= admID[i] %></center> </td>
                <td><center><%= drugName[i] %></center> </td> 
            </tr>
            <%    
            }
            %> 
           
     
        </table>
        
        
   
     
        
        <%
         
        
    }
    
    else
    {    
        out.print("No Results Found!");
    
    }
    
    
    
%>

<center><input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " /></center>

  


       
   
   
        














