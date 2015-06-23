package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addCust_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"900\" height=\"915\" border=\"1\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"200\" colspan=\"2\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td height=\"202\" colspan=\"2\"><h1 style=\"text-align: center; font-size: 36px;\">Add Customer</h1></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"111\">&nbsp;</td>\r\n");
      out.write("    <td><form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("    <table width=\"773\" height=\"254\" border=\"1\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"86\" colspan=\"2\" align=\"center\" style=\"font-weight: bold; font-family: Tahoma, Geneva, sans-serif; font-size: 24px;\">Please Enter Details To Add A Customer</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"289\" height=\"79\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif;\">Enter Customer Full Name :</td>\r\n");
      out.write("    <td width=\"468\" align=\"center\"><label for=\"txtCN\"></label>\r\n");
      out.write("      <input type=\"text\" name=\"txtCN\" id=\"txtCN\" size=\"70px\"  /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"79\" style=\"text-align: center; font-family: Tahoma, Geneva, sans-serif;\">Enter Customer Medication:</td>\r\n");
      out.write("    <td align=\"center\"><label for=\"txtMd\"></label>\r\n");
      out.write("      <input type=\"text\" name=\"txtMd\" id=\"txtMd\" size=\"70px\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </form></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
