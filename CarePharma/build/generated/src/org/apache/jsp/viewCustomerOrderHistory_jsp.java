package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import Data.*;
import Business.*;

public final class viewCustomerOrderHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Customer Order History</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");

  
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
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("   \n");
      out.write("        \n");
      out.write("    <table id=\"tb_cusOrdRecords\" border=\"2\" align=\"center\" >\n");
      out.write("        <tr style=\" background-color: lightsteelblue\"><td colspan=\"5\" align=\"center\"><h2><b>CarePharma - Customer Order History</b></h2></td></tr>\n");
      out.write("        <tr style=\"background-color:  yellowgreen\">\n");
      out.write("            <td ><b>Order ID</b> </td>\n");
      out.write("            <td><b>Order Date</b> </td>\n");
      out.write("            <td><b>Customer ID</b> </td>\n");
      out.write("            <td><b>Drug ID</b> </td>\n");
      out.write("            <td><b>Quantity</b> </td>\n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("            ");

             for(int i = 0;i < ordID.length;i++)
            {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><center> ");
      out.print( ordID[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( ordDate[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( cusID[i] );
      out.write(" </center></td>\n");
      out.write("                <td><center>");
      out.print( drugID[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( qty[i] );
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
      out.write("    </body>\n");
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
