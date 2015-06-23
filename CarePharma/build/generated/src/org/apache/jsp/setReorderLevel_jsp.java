package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import Data.*;
import Business.*;

public final class setReorderLevel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <td ><b><center>Drug ID</center></b> </td>\n");
      out.write("            <td><b><center>Drug Name</center></b> </td>\n");
      out.write("            <td><b><center>Treatment for</center></b> </td>\n");
      out.write("            <td><b><center>Available Qty</center></b> </td>\n");
      out.write("            <td><b><center>Price Per Unit</center></b> </td>\n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("            ");

             for(int i = 0;i < drgID.length;i++)
            {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><center>");
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
      out.write("            <p> </br> </br> </br>  </p>\n");
      out.write("            <p><center><b><h2> Would you like to re-order the drugs? </h2>\n");
      out.write("              </p> \n");
      out.write("                  <input type=\"button\" name=\"Yes\" id=\"button\" value=\"Yes\" style=\"width:50px\" onclick=\"drawTable();\">\n");
      out.write("              <input type=\"button\" name=\"No\" id=\"button\" value=\"No\" style=\"width:50px; margin-left:25px\" onClick=\"history.back()\">  \t\t\t              </p>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              ");
 
				
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
				}
				
				
				}
				catch(Exception e)
				{
				out.print("Error :"+e);
				}
                                
                                
                                
                         
		
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <script>\n");
      out.write("                  \n");
      out.write("              var ordStatus = new Array();\n");
      out.write("              var ordStDrID = new Array();\n");
      out.write("              var tblVal=0;\n");
      out.write("              \n");
      out.write("              function drawTable()\n");
      out.write("                {\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        tblVal = prompt(\"How many drugs would you like to Re-Order ?\");\n");
      out.write("                        document.write(\"<center><h1> Set Re-Order Levels! </h1></center>\");\n");
      out.write("                        \n");
      out.write("                        for(var i=0; i<tblVal ; i++)\n");
      out.write("                        {\n");
      out.write("                            var opID1 = \"dr\".concat(i.toString());                \n");
      out.write("                            var opID2 = \"ord\".concat(i.toString());\n");
      out.write("            \n");
      out.write("                            document.write(\"<center> <table border=2>\");\n");
      out.write("                            document.write(\"<tr>\");\n");
      out.write("                            document.write(\"<td>Drug ID </td><td> Order Required? </td></tr>\");\n");
      out.write("                            document.write(\"<tr><td> ID : <Select>\");\n");
      out.write("                             ");
 for(int j=0; j < drugIDRe.size(); j++)
                            { 
      out.write("\n");
      out.write("                            document.write(\"<option id=\"+opID1+\" value =");
      out.print( drugIDRe.get(j));
      out.write(' ');
      out.write('>');
      out.print( drugIDRe.get(j));
      out.write("</option>  \");\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                            document.write(\"</td><td>\");\n");
      out.write("                            document.write(\"<center><Select> <option id=\"+opID2+\" value =Yes>Yes</option> <option value =No>No</option></center> \");\n");
      out.write("                            document.write(\"</td></tr></table></center>\");\n");
      out.write("                            \n");
      out.write("                            ordStatus[i] = opID1;\n");
      out.write("                            ordStDrID[i] = opID2;\n");
      out.write("                         }\n");
      out.write("                         \n");
      out.write("                        document.write(\"<center><input type=button name=btnSub id=btnSub value=Submit onClick=submitLvl(); style=width:100px; height:40px; margin-left:30px /></center>\");\n");
      out.write("\t\t\t  \n");
      out.write("\t\t}\t\n");
      out.write("                \n");
      out.write("                </script>\n");
      out.write("                \n");
      out.write("                <script> \n");
      out.write("                  function submitLvl()\n");
      out.write("                  {\n");
      out.write("                   ");

                   String strReOrd = null;
                   String strDrID = "Yes";
      out.write("\n");
      out.write("                      \n");
      out.write("                   var chk = window.alert(\"You are inside submitLvl :\"+tblVal);\n");
      out.write("                    \n");
      out.write("                    for(var j=0; j<tblVal ; j++)\n");
      out.write("                    {\n");
      out.write("                           \n");
      out.write("                            var chk = window.alert(\"ReOrdSt :\"+ordStatus[j]);\n");
      out.write("                   </script> \n");
      out.write("                            \n");
      out.write("                            ");
 strReOrd = "<script> document.writeln(ordStatus[j])</script>";
      out.write("\n");
      out.write("                   <script>        \n");
      out.write("                            var c1 = ");
      out.print(strReOrd);
      out.write(";\n");
      out.write("                            document.writeln(\"chk2:\"+c1);\n");
      out.write("                            \n");
      out.write("                                              \n");
      out.write("                            ");
 
                             st.executeUpdate("UPDATE druglist SET Re_Order_Level ='"+strReOrd+"' WHERE Drug_ID = '"+strDrID+"' "); 
                             
                            
      out.write(" \n");
      out.write("                                        \n");
      out.write("                      \n");
      out.write("                               \n");
      out.write("                        }\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                  }\n");
      out.write("                  \n");
      out.write("              \n");
      out.write("                \n");
      out.write("              </script>\n");
      out.write("              \n");
      out.write("            \n");
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
