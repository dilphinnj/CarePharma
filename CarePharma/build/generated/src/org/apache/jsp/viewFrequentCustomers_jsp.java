package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import Data.*;
import Business.*;

public final class viewFrequentCustomers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Drug Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");

  
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
                rsFqCusts = st.executeQuery("SELECT customers.Customer_ID,customers.Customer_Name, COUNT(customer_order.Customer_ID) AS Number_Of_Orders FROM (customer_order INNER JOIN customersON customer_order.Customer_ID=Customers.Customer_ID)GROUP BY Customer_ID HAVING COUNT(customer_order.Customer_ID) > 10 ORDER BY Number_Of_Orders  DESC;");





                
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
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("   \n");
      out.write("        \n");
      out.write("    <table id=\"tb_cusOrdRecords\" border=\"2\" align=\"center\" >\n");
      out.write("        <tr style=\" background-color: lightsteelblue\"><td colspan=\"5\" align=\"center\"><h2><b>CarePharma - Frequent Customer Details</b></h2></td></tr>\n");
      out.write("        <tr style=\"background-color:  yellowgreen\">\n");
      out.write("            <td ><b>Customer ID</b> </td>\n");
      out.write("            <td><b>Customer Name</b> </td>\n");
      out.write("            <td><b>No Of Orders</b> </td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("            ");

             for(int i = 0;i < custID.length;i++)
            {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><center> ");
      out.print( custID[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( custName[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( noOfOrders[i] );
      out.write("</center> </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
    
            }
            
      out.write(" \n");
      out.write("           \n");
      out.write("     \n");
      out.write("        </table>\n");
      out.write("        \n");
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
