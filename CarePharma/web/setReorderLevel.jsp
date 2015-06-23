

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
                rdDrgs = st.executeQuery("SELECT * FROM druglist WHERE Qty_In_Stock < '5000'");
                
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
            <td ><b><center>Drug ID</center></b> </td>
            <td><b><center>Drug Name</center></b> </td>
            <td><b><center>Treatment for</center></b> </td>
            <td><b><center>Available Qty</center></b> </td>
            <td><b><center>Price Per Unit</center></b> </td>
        </tr>
            
            <%
             for(int i = 0;i < drgID.length;i++)
            {
            %>
            
            <tr>
                <td><center><%= drgID[i] %></center> </td>
                <td><center><%= drgName[i] %></center> </td>
                <td><center><%= drgDetails[i] %> </center></td>
                <td><center><%= qty[i] %></center> </td>
                <td><center><%= ppu[i] %></center> </td>
            </tr>
            <%    
            }
            %> 
           
     
        </table>
            <p> </br> </br> </br>  </p>
            <p><center><b><h2> Would you like to re-order the drugs? </h2>
              </p> 
                  <input type="button" name="Yes" id="button" value="Yes" style="width:50px" onclick="drawTable();">
              <input type="button" name="No" id="button" value="No" style="width:50px; margin-left:25px" onClick="history.back()">  			              </p>
              
              
              
              <% 
				
				//DataConnection.createConn();
				ResultSet rsReOrdDrugID = null;
				Statement st = null;
				st = DataConnection.con.createStatement();
				List drugIDRe = new ArrayList();
				int i = 0;
				
				try{
				rsReOrdDrugID = st.executeQuery("SELECT * FROM druglist");
				
				while(rsReOrdDrugID.next())
				{
					drugIDRe.add(rsReOrdDrugID.getInt(1));
                                        //out.print("drugIDRe ::"+drugIDRe.get(i));
                                        //i++;
				}
				
				
				}
				catch(Exception e)
				{
				out.print("Error :"+e);
				}
                                
                                
                                
                         
		%>
              
              
              
              <script>
                  
              var ordStatus = new Array();
              var ordStDrID = new Array();
              var tblVal=0;
              
              function drawTable()
                {
                        
                        
                        tblVal = prompt("How many drugs would you like to Re-Order ?");
                        document.write("<center><h1> Set Re-Order Levels! </h1></center>");
                        document.write("<center> <table border=2> <form id=frmSetLvl name=frmSetLvl method=post action=updateOrderStatus.jsp>");
                        
                        for(var i=1; i<=tblVal ; i++)
                        {
                            var opID1 = "dr".concat(i.toString());                
                            var opID2 = "ord".concat(i.toString());
            
                            
                            document.write("<tr>");
                            document.write("<td>Drug </td><td> Order Required? </td></tr>");
                            document.write("<tr><td>ID:<Select name="+opID1+"> ");
                             <% for(int j = 0; j < drugIDRe.size();j++)
                             { 
                                 
                             %>
                            
                            document.write("<option value =<%= drugIDRe.get(j)%> ><%= drugIDRe.get(j)%></option>");
                            
                            <% } %>
                            document.write(" </select></td>");
                            document.write("<td><center><Select name="+opID2+" id="+opID2+"> <option  value =Yes>Yes</option> <option value =No>No</option></center> ");
                            document.write("</td></tr>");
                            
                            ordStatus[i] = opID1;
                            ordStDrID[i] = opID2;
                         }
                         
                            document.write("<tr><td><center><input type=submit name=btnSub id=btnSub value=Submit style=width:100px; height:40px; margin-left:30px /></center></td></tr>");
                            document.write("</form></table></center>");  
		}	
                
                </script>
                
               
              
            












