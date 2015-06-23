package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import Data.*;
import Business.*;

public final class searchResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ResultSet rsSrchDrugbyName = null;
    ResultSet rsSrchDrugBySup = null;
    int rid=0;
       
    int[] drgID = null;
    String[] drgName = null;
    String[] drgDetails = null;
    int[] qty = null;
    int[] ppu = null;
    String srchWrd = null;
    
    String srchDrgByNameVal = "0";
    String srchDrgBySupVal = "0";
    
    srchDrgByNameVal = request.getParameter("txtSDN");
    srchDrgBySupVal = request.getParameter("txtDBSN");
    
    if(!srchDrgByNameVal.equals("0"))
    {
        srchWrd = srchDrgByNameVal;
        out.print("||Srch Val inside if::"+srchDrgByNameVal+"||Sup Val ::"+srchDrgBySupVal);
   
    
            
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                
                rsSrchDrugbyName = st.executeQuery("SELECT * FROM druglist WHERE Drug_Name = '"+srchWrd+"'");
                
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
    }
    
    
    
   //// Search by supplier name 
    
    
    
    else if(!srchDrgBySupVal.equals("0"))
    {
    
    srchWrd = srchDrgBySupVal; 
    out.print("||Srch Val inside Else if::"+srchDrgBySupVal); 
   
    
            
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                
                rsSrchDrugbyName = st.executeQuery("SELECT * FROM supplier WHERE Supplier_Name = '"+srchWrd+"'");
                
            }
        catch(Exception e)
            {
                out.println("Error in User Details Data Connection :"+e);
            }
        
        try {
        
               
            int i = 0;  
            rsSrchDrugBySup.last();
            rid = rsSrchDrugBySup.getRow();
            //testing
            //System.out.println("Row id"+rid);
            rsSrchDrugBySup.beforeFirst();


            drgID = new int[rid];
            drgDetails = new String[rid];
            qty = new int[rid];
            drgName = new String[rid];
            ppu = new int[rid];
              
              
            while(rsSrchDrugBySup.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                drgID[i] = rsSrchDrugBySup.getInt(1);
                drgName[i] = rsSrchDrugBySup.getString(2);
                drgDetails[i] = rsSrchDrugBySup.getString(3);
                qty[i] = rsSrchDrugBySup.getInt(4);
                ppu[i]=rsSrchDrugBySup.getInt(5);

                i++;
               
            }
            
            
            }
        
        catch(Exception e1)
            {
                out.println("Error in User Details data extraction :" +e1);
            }     
    }
    
    else
    {    
        out.print("No Results Found!");
    
    }
    
    
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("   \n");
      out.write("        \n");
      out.write("    <table id=\"tb_cusOrdRecords\" border=\"2\" align=\"center\" >\n");
      out.write("        <tr style=\" background-color: lightsteelblue\"><td colspan=\"5\" align=\"center\"><h2><b>CarePharma - Available Drug Details</b></h2></td></tr>\n");
      out.write("        <tr style=\"background-color:  yellowgreen\">\n");
      out.write("            <td ><b>Drug ID</b> </td>\n");
      out.write("            <td><b>Drug Name</b> </td>\n");
      out.write("            <td><b>Treatment for</b> </td>\n");
      out.write("            <td><b>Available Qty</b> </td>\n");
      out.write("            <td><b>Price Per Unit</b> </td>\n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("            ");

             for(int i = 0;i < drgID.length;i++)
            {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><center> ");
      out.print( drgID[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( drgName[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( drgDetails[i] );
      out.write(" </center></td>\n");
      out.write("                <td><center>");
      out.print( qty[i] );
      out.write("</center> </td>\n");
      out.write("                <td><center>");
      out.print( ppu[i] );
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
