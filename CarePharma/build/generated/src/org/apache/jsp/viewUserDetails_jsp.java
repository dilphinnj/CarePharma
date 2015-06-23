package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import Data.*;
import Business.*;

public final class viewUserDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>User Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");

  
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
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("   \n");
      out.write("        \n");
      out.write("    <table id=\"tb_cusOrdRecords\" border=\"2\" align=\"center\" >\n");
      out.write("        <tr style=\" background-color: lightsteelblue\"><td colspan=\"5\" align=\"center\"><h2><b>CarePharma - System User Details</b></h2></td></tr>\n");
      out.write("        <tr style=\"background-color:  yellowgreen\">\n");
      out.write("            <td ><b>User ID</b> </td>\n");
      out.write("            <td><b>User Name</b> </td>\n");
      out.write("            <td><b>User Type</b> </td>\n");
      out.write("            <td><b>User Full Name</b> </td>\n");
      out.write("            <td><b>User Tel No.</b> </td>\n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("            ");

             for(int i = 0;i < usrID.length;i++)
            {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><center> ");
      out.print( usrID[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( usrName[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( usrType[i] );
      out.write(" </center></td>\n");
      out.write("                <td><center>");
      out.print( usrFullName[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( usrTel[i] );
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
