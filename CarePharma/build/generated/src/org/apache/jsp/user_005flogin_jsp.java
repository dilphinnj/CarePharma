package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<!-- TemplateBeginEditable name=\"doctitle\" -->\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<!-- TemplateEndEditable -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: threedlightshadow;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tfont-size: large;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".backg tr td {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-family: \"Lucida Sans Unicode\", \"Lucida Grande\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write(".backg tr td #MenuBar1 li {\r\n");
      out.write("\tfont-family: \"Lucida Sans Unicode\", \"Lucida Grande\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".backg tr td #MenuBar1 li {\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("}\r\n");
      out.write(".backg tr td {\r\n");
      out.write("\tfont-family: Calibri, \"Calisto MT\";\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\tfont-family: Georgia, \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\tfont-family: Verdana, Geneva, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("para {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("para {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write(".para {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("#para {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para2 {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("#para2 {\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para #para2 {\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para p span {\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write(".backg tr td old {\r\n");
      out.write("\ttext-align: justify;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("a:link {\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-family: \"Palatino Linotype\", \"Book Antiqua\", Palatino, serif;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para #form1 label {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para #form1 label span {\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para #form1 label span {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para #form1 span label {\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para #form1 label span {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".backg tr .para #form1 table tr td {\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("}\r\n");
      out.write(".backg {\r\n");
      out.write("\tfont-family: Georgia, \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<!-- TemplateBeginEditable name=\"head\" -->\r\n");
      out.write("<!-- TemplateEndEditable -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" text=\"#666666\" alink=\"#666666\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"800\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"backg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"200\" width=\"200\" colspan=\"4\" valign=\"top\"><img src=\"logo_carePharma.png\" width=\"900\" height=\"200\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#000000\" style=\"text-align: center; font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;\">\r\n");
      out.write("    <td width=\"200\" height=\"39\" valign=\"top\"><a href=\"../../CarePharmaSite/web/flexAdds_home.html\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Home</a></td>\r\n");
      out.write("    <td width=\"200\" valign=\"top\"><a href=\"../../CarePharmaSite/web/About_us.html\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">About Us</a></td>\r\n");
      out.write("    <td width=\"200\" valign=\"top\"><a href=\"../../CarePharmaSite/web/ContactUs.html\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Contact Us</a></td>\r\n");
      out.write("    \r\n");
      out.write("    <td width=\"200\" valign=\"top\"><a href=\"http://localhost:8080/CarePharma/user_login.jsp\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Login </a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFF99\">\r\n");
      out.write("    <td height=\"400\" width=\"231\" align=\"left\" valign=\"top\" bgcolor=\"#666699\"><p style=\"text-align: left; color: #000;\">&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p></td>\r\n");
      out.write("    <td height=\"400\" colspan=\"4\" align=\"center\" valign=\"top\" bgcolor=\"#6699CC\" class=\"para\"><p style=\"color: #000\">&nbsp;</p>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <form id=\"form1\" name=\"formlog\" method=\"post\" action=\"login.jsp\">\r\n");
      out.write("\r\n");
      out.write("      <label> </label>\r\n");
      out.write("      <table width=\"531\" border=\"0\" align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"138\" height=\"55\" bgcolor=\"#FFFFFF\">&nbsp;&nbsp;User Name :</td>\r\n");
      out.write("          <td width=\"303\" bgcolor=\"#CCCCCC\"><input type=\"text\" name=\"tUn\" id=\"tUn\" style=\"margin-left:30px\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("              <td width=\"138\" height=\"55\" bgcolor=\"#FFFFFF\">User Type :</td>\r\n");
      out.write("              <td bgcolor=\"#CCCCCC\"><label for=\"lUt\" style=\"margin-left:30px; height:5px; width: 50px\" ></label>\r\n");
      out.write("            <select name=\"lUt\" style=\"width:150px\" id=\"lUt\" >\r\n");
      out.write("            <option value=\"Admin\">Admin</option>\r\n");
      out.write("            <option value=\"Pharmacist\" selected=\"selected\">Pharmacist</option>\r\n");
      out.write("            <option value=\"Manager\">Manager</option>\r\n");
      out.write("            \r\n");
      out.write("        </select></td></tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"57\" bgcolor=\"#FFFFFF\"><span style=\"text-align:left\">Password  :</span></td>\r\n");
      out.write("          <td width=\"303\" bgcolor=\"#CCCCCC\"><input type=\"password\" name=\"tPw\" id=\"tPw\" style=\"margin-left:30px\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"48\" bgcolor=\"#474045\">&nbsp;</td>\r\n");
      out.write("          <td align=\"left\" bgcolor=\"#474045\"><input type=\"submit\" name=\"send\" id=\"send\" value=\"Login\" style=\"height:30px; width:80px;\" /> \r\n");
      out.write("        <input type=\"reset\" name=\"clear\" id=\"clear\" value=\"Clear\" style=\"margin-left:30px; height:30px; width:80px\"  /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <label><span style=\"text-align: left; color: #000;\"><br>\r\n");
      out.write("        </span></label>\r\n");
      out.write("      <span style=\"text-align:center\">\r\n");
      out.write("      <label><br />\r\n");
      out.write("      </label>\r\n");
      out.write("      </span><span style=\"text-align: left\">\r\n");
      out.write("      <label></label>\r\n");
      out.write("        </span>\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <span style=\"text-align: center\"></span>\r\n");
      out.write("      </form>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#000000\">\r\n");
      out.write("    <td height=\"55\" colspan=\"5\" align=\"left\" valign=\"top\" style=\"color: #FFF; font-size: small;\">Copy rights @ CarePharma (Pvt) Ltd 2014.</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
