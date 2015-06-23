package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import Data.*;

public final class addCusOrderForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Customer Order Form</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #CCCCCC;\r\n");
      out.write("\tfont-family: Tahoma, Geneva, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write(" ");
 

DataConnection.createConn();
ResultSet rsDrugID = null;
Statement st = null;
st = DataConnection.con.createStatement();
List drugID = new ArrayList();
int i = 0;

try{
rsDrugID = st.executeQuery("SELECT * FROM druglist");

while(rsDrugID.next())
{
    //out.print("Drug ID :"+rsDrugID.getInt(1));
    drugID.add(rsDrugID.getInt(1));
}


}
catch(Exception e)
{
out.print("Error :"+e);
}

//



      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<table width=\"900\" height=\"\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"200\" colspan=\"2\"><img src=\"logo_carePharma.png\" width=\"900\" height=\"200\" style=\"border-bottom-color:#000\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"105\" height=\"286\" bgcolor=\"#263157\">&nbsp;</td>\r\n");
      out.write("    <td width=\"791\" height=\"286\"><form id=\"formAddCust\" name=\"formAddCust\" method=\"post\" action=\"addCustServlet\">\r\n");
      out.write("      <table id=\"tblForm\" width=\"\" border=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"80\" colspan=\"2\" align=\"center\" bgcolor=\"#E1E1FF\" style=\"font-weight: bold; font-size: 24px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif;\">Please Add A Customer Order</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"291\" height=\"80\" bgcolor=\"#FFFFFF\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;\">Enter Order Date :</td>\r\n");
      out.write("          <td width=\"506\" height=\"20\" align=\"center\" bgcolor=\"#999999\"><label for=\"txtCN2\"></label>\r\n");
      out.write("            <input name=\"txtOD\" type=\"date\" id=\"txtOD\" size=\"50px\" maxlength=\"10\" style=\"150px\"  /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"80\" bgcolor=\"#FFFFFF\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;\">Enter Customer ID:<span style=\"text-align: right\"></span></td>\r\n");
      out.write("          <td height=\"80\" align=\"center\" bgcolor=\"#999999\"><label for=\"txtTel\"></label>\r\n");
      out.write("            <input name=\"txtCI\" type=\"text\" id=\"txtCI\" size=\"50px\" maxlength=\"8\" style=\"width:150px\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"80\" bgcolor=\"#FFFFFF\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;\">No. of Medicine Purchased:<span style=\"text-align: right\"></span></td>\r\n");
      out.write("          <td height=\"80\" align=\"center\" bgcolor=\"#999999\"><label for=\"txtTel\"></label>\r\n");
      out.write("            <input name=\"txtMedNo\" type=\"text\" id=\"txtMedNo\" style=\"width:150px\" size=\"50px\" maxlength=\"8\" value=\"\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("          ");

            int noOfMed = 4;
            
            for(int k = 1;k < noOfMed ;k++)
            {
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          <tr>\r\n");
      out.write("          <td height=\"80\" bgcolor=\"#FFFFFF\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;\">Enter Drug ID:</td>\r\n");
      out.write("          <td height=\"80\" align=\"center\" bgcolor=\"#999999\"><label for=\"drugID\"></label>\r\n");
      out.write("            <select name=\"drugList\" id=\"drugListID\"  style=\"width:150px\">\r\n");
      out.write("                ");
 for(int j=0; j < drugID.size(); j++)
                {
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print( drugID.get(j));
      out.write("\"> ");
      out.print( drugID.get(j));
      out.write("  </option>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("        </select></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \r\n");
      out.write("        <td height=\"80\" bgcolor=\"#FFFFFF\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;\">Enter Quantity:</td>\r\n");
      out.write("          <td height=\"80\" align=\"center\" bgcolor=\"#999999\"><input name=\"txtQty\" type=\"number\" id=\"txtQty\" min=\"0\" size=\"50px\" maxlength=\"5\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
       
   }

      out.write("\r\n");
      out.write("        \r\n");
      out.write("             \r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"60\" bgcolor=\"#46413C\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif;\">&nbsp;</td>\r\n");
      out.write("          <td height=\"60\" align=\"left\" bgcolor=\"#46413C\"><input type=\"submit\" name=\"btnAddCust\" id=\"btnAddCust\" value=\"Add Record\" \r\n");
      out.write("          style=\"width:100px; height:40px; margin-left:150px \" />\r\n");
      out.write("          <input type=\"reset\" name=\"btnCls\" id=\"btnCls\" value=\"Clear\" \r\n");
      out.write("          style=\"width:100px; height:40px; margin-left:30px \" />\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </form></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"77\" colspan=\"2\" bgcolor=\"#000000\" style=\"color: #FFF; font-family: Tahoma, Geneva, sans-serif; text-align: center; font-size: small;\">Copyrights @ CarePharma (Pvt) Ltd 2014.</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
