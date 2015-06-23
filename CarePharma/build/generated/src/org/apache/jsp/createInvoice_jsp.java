package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;
import Data.DataConnection;
import java.util.Enumeration;
import javax.servlet.http.*;

public final class createInvoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 static List paras = new ArrayList();
            //static int numOfParas = 0;
            static String ordDate = new String();
            static String txtMd = new String();
            static int custID = 0;
            static int noOfMeds = 0;
            static int pid = 0;

        
    // Enter Customer order details into Database  
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

        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UpdateCustOrder", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Invoice</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"displayBill();\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

                    
            Enumeration allParaNames = request.getParameterNames();

        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

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


        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 try 
        {
          PrintWriter outNewPr = response.getWriter();
          addRecord(outNewPr);
          
        }catch(Exception e)
        {
           out.print("Error in adding Record! :"+e);    
              
        }
        
          
        
        
        
      out.write("\n");
      out.write("\n");
      out.write("        ");


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
        
      out.write("   \n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <h2><b> Add Another Order? </b></h2>\n");
      out.write("        <button onclick=\"window.location.href='http://localhost:8080/CarePharma/addCusOrderForm1.jsp'\">YES</button>\n");
      out.write("        <button type=button value=\"NO\" onClick=\"closeMain();\">NO</button>\n");
      out.write("        <button type=button onClick=\"history.back()\">BACK TO FORM</button>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("        function closeMain()\n");
      out.write("        {\n");
      out.write("            var win = window.open(\"\", \"_self\");\n");
      out.write("            win.close();\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Calculate the invoice for drugs purchased\n");
      out.write("            //******************************************** \n");
      out.write("\n");
      out.write("            function displayBill()\n");
      out.write("            {\n");
      out.write("                var invoiceWindow;\n");
      out.write("\n");
      out.write("                invoiceWindow = window.open(\"\", \"invoice\", \"width=800,height=600,left=300\");\n");
      out.write("                invoiceWindow.document.write(\" <p style= background-color:cadetblue;><font color= #FFF ; size=10; align=center > CUSTOMER INVOICE</font> </p>\")\n");
      out.write("                //  invoiceWindow.document.write(\"<font face=&quot;Garamond, Times New Roman, Georgia&quot; size=6 color=&quot;#FF0000&quot;>\")\n");
      out.write("\n");
      out.write("                invoiceWindow.document.write(\"<title>CUSTOMER INVOICE</title>\");\n");
      out.write("                \n");
      out.write("\n");
      out.write("            ");


              for (int i = 1; i <= noOfMeds; i++) {
                  int drugIDNew = drugID[i];
                  int qtyNew = qty[i];
                  int drugPPUNew = drugPPU[i];
                  int price = drugPPUNew * qtyNew;

                  tot = tot + price;


            
      out.write("\n");
      out.write("\n");
      out.write("                invoiceWindow.document.write(\"<p> Drug ID :\" +");
      out.print(drugIDNew);
      out.write(" + \"</p><p> Qty :\" +");
      out.print(qtyNew);
      out.write(" + \"</p><p> Price Per Unit :\" +");
      out.print(drugPPUNew);
      out.write(" + \"</p>Price :\" +");
      out.print(price);
      out.write(" + \"</br></br></br>\");\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                 paras.clear();

              }
            
      out.write("\n");
      out.write("\n");
      out.write("                invoiceWindow.document.write(\"<h1><b>Total Amount : Rs. \" +");
      out.print(tot);
      out.write(" + \"</b></h1>\");\n");
      out.write("\n");
      out.write("                var btn = invoiceWindow.document.createElement(\"BUTTON\");\n");
      out.write("                var btn2 = invoiceWindow.document.createElement(\"BUTTON\");\n");
      out.write("                var txt = invoiceWindow.document.createTextNode(\"CLOSE\");\n");
      out.write("                var txt2 = invoiceWindow.document.createTextNode(\"PRINT\");\n");
      out.write("                btn2.appendChild(txt2);\n");
      out.write("                btn.appendChild(txt);\n");
      out.write("                invoiceWindow.document.body.appendChild(btn2);\n");
      out.write("                invoiceWindow.document.body.appendChild(btn);\n");
      out.write("                var val;\n");
      out.write("                \n");
      out.write("                btn.onclick = winClose;\n");
      out.write("                btn2.onclick = winPrint;\n");
      out.write("\n");
      out.write("                function winPrint()\n");
      out.write("                {\n");
      out.write("                   var pWin = window.open(\"\", \"invoice\"); \n");
      out.write("                   var pWin2 = pWin.print(); \n");
      out.write("\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                function winClose()\n");
      out.write("                {\n");
      out.write("                   invoiceWindow.close();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("                              \n");
      out.write("                \n");
      out.write("\n");
      out.write("        </script>                  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
