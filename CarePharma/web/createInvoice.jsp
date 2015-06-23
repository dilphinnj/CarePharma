<%-- 
    Document   : c1
    Created on : Apr 19, 2014, 1:15:48 PM
    Author     : dilphinn
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Statement"%>
<%@page import="Data.DataConnection"%>
<%@page import="java.util.Enumeration"%>
<%@page import="javax.servlet.http.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>

<jsp:include page="UpdateCustOrder"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invoice</title>
    </head>
    <body onload="displayBill();">



        <%
                    
            Enumeration allParaNames = request.getParameterNames();

        %>

        <%! static List paras = new ArrayList();
            //static int numOfParas = 0;
            static String ordDate = new String();
            static String txtMd = new String();
            static int custID = 0;
            static int noOfMeds = 0;
            static int pid = 0;

        %>
        <%
            while (allParaNames.hasMoreElements()) {
                String paraName = (String) allParaNames.nextElement();
                String paraVal = request.getParameter(paraName);
                paras.add(paraVal);

                if (paraName.equals("txtOD")) {
                    ordDate = paraVal;
                } else if (paraName.equals("txtCI")) {
                    custID = Integer.parseInt(paraVal);
                } else if (paraName.equals("txtMedNo")) {
                    noOfMeds = Integer.parseInt(paraVal);
                    //txtMd = paraName;
                }
            }

        DataConnection.con = null;
        DataConnection.createConn();
        Statement st = DataConnection.con.createStatement();

        pid = Integer.parseInt(session.getAttribute("pid").toString()); 


        %>

        <%!    // Enter Customer order details into Database  
            //*****************************************************
            // synchronize to restrict one user access the method at one time
            public synchronized static void addRecord(PrintWriter out) throws IOException,SQLException {


                try {
                    DataConnection.con = null;
                    DataConnection.createConn();
                    Statement st = DataConnection.con.createStatement();

                    for (int i = 3; i < paras.size()- 1; i++) 
                    {

                        ////Testing
                        //out.println("\\\\\\Array SIZE :"+paras.size()); 
                        st.executeUpdate("INSERT INTO customer_order(Order_Date,Customer_ID,Drug_ID,Quantity,Pharmacist_ID) VALUES('" + ordDate + "','" + custID + "','" + paras.get(i) + "','" + paras.get(i + 1) + "','"+ pid+"')");  
                       
                        i++;
                    }


                } catch (Exception e) 
                {
                    out.print("ERROR IN ADDING DETAILS :"+e);
                    //e.printStackTrace();
                    
                }
            }

        %>
        
        <% try 
        {
          PrintWriter outNewPr = response.getWriter();
          addRecord(outNewPr);
          
        }catch(Exception e)
        {
           out.print("Error in adding Record! :"+e);    
              
        }
        
          
        
        
        %>

        <%

            // Retrieve Price per unit for each drug from Database  
            //*****************************************************   

            //int[] qtyPerDrug = new int[noOfMeds];
            int tot = 0;
            int[] drugID = new int[noOfMeds + 1];
            int[] qty = new int[noOfMeds + 1];
            int[] drugPPU = new int[noOfMeds + 1];
            int[] stkQty = new int[noOfMeds + 1];

            try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st2 = DataConnection.con.createStatement();

                int j = 4;




                for (int i = 1; i <= noOfMeds; i++) 
                {
                    // String cntr = ;
                    String drID = request.getParameter("drugList".concat(String.valueOf(i)));
                    ResultSet rsDrugDtl = st2.executeQuery("SELECT Drug_ID,Price_Per_Unit,Qty_In_Stock FROM druglist WHERE Drug_ID ='" + drID + "'");

                    while (rsDrugDtl.next()) 
                    {
                        drugID[i] = rsDrugDtl.getInt(1);
                        qty[i] = Integer.parseInt(paras.get(j).toString());
                        drugPPU[i] = rsDrugDtl.getInt(2);
                        stkQty[i] = rsDrugDtl.getInt(3);
                        stkQty[i] = stkQty[i] - qty[i];
                        
                    }
                    
                    
                }



            } catch (Exception e) {
                out.println("Error in retrieving drug prices :" + e);
            }

            try{
                for (int i = 1; i <= noOfMeds; i++) 
                {
                    st.executeUpdate("UPDATE druglist SET Qty_In_Stock ='"+stkQty[i]+"' WHERE Drug_ID = '"+drugID[i]+"' ");
                }
            } catch (Exception e) 
            {
                out.println("Error in updating drug quantities :" + e);
            }
        %>   
        
      
        <h2><b> Add Another Order? </b></h2>
        <button onclick="window.location.href='addCusOrderForm1.jsp'">YES</button>
        <button type=button value="NO" onClick="closeMain();">NO</button>
        <button type=button onClick="history.back()">BACK TO FORM</button>
        
        <script>
        function closeMain()
        {
            var win = window.open("", "_self");
            win.close();
        }
        </script>

        <script>
            // Calculate the invoice for drugs purchased
            //******************************************** 

            function displayBill()
            {
                var invoiceWindow;

                invoiceWindow = window.open("", "invoice", "width=800,height=600,left=300");
                invoiceWindow.document.write(" <p style= background-color:cadetblue;><font color= #FFF ; size=10; align=center > CUSTOMER INVOICE</font> </p>")
                //  invoiceWindow.document.write("<font face=&quot;Garamond, Times New Roman, Georgia&quot; size=6 color=&quot;#FF0000&quot;>")

                invoiceWindow.document.write("<title>CUSTOMER INVOICE</title>");
                

            <%

              for (int i = 1; i <= noOfMeds; i++) {
                  int drugIDNew = drugID[i];
                  int qtyNew = qty[i];
                  int drugPPUNew = drugPPU[i];
                  int price = drugPPUNew * qtyNew;

                  tot = tot + price;


            %>

                invoiceWindow.document.write("<p> Drug ID :" +<%=drugIDNew%> + "</p><p> Qty :" +<%=qtyNew%> + "</p><p> Price Per Unit :" +<%=drugPPUNew%> + "</p>Price :" +<%=price%> + "</br></br></br>");





            <%
                 paras.clear();

              }
            %>

                invoiceWindow.document.write("<h1><b>Total Amount : Rs. " +<%=tot%> + "</b></h1>");

                var btn = invoiceWindow.document.createElement("BUTTON");
                var btn2 = invoiceWindow.document.createElement("BUTTON");
                var txt = invoiceWindow.document.createTextNode("CLOSE");
                var txt2 = invoiceWindow.document.createTextNode("PRINT");
                btn2.appendChild(txt2);
                btn.appendChild(txt);
                invoiceWindow.document.body.appendChild(btn2);
                invoiceWindow.document.body.appendChild(btn);
                var val;
                
                btn.onclick = winClose;
                btn2.onclick = winPrint;

                function winPrint()
                {
                   var pWin = window.open("", "invoice"); 
                   var pWin2 = pWin.print(); 

                }
                
                function winClose()
                {
                   invoiceWindow.close();
                }

            }
            
                              
                

        </script>                  



    </body>
</html>
