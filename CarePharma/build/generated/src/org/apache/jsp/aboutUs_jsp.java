package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"SpryAssets/SpryAccordion.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"SpryAssets/SpryAccordion.js\" type=\"text/javascript\"></script>\r\n");
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
      out.write("    <td height=\"200\" colspan=\"4\" valign=\"top\"><img src=\"logo_carePharma.png\" width=\"900\" height=\"200\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#000000\" style=\"text-align: center; font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;\">\r\n");
      out.write("    <td width=\"194\" height=\"39\" valign=\"top\"><a href=\"home.jsp\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Home</a></td>\r\n");
      out.write("    <td width=\"273\" valign=\"top\"><a href=\"aboutUs.jsp\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">About Us</a></td>\r\n");
      out.write("    <td width=\"217\" valign=\"top\"><a href=\"contactUsNew.jsp\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Contact Us</a></td>\r\n");
      out.write("    \r\n");
      out.write("    <td width=\"216\" valign=\"top\"><a href=\"userLogin.jsp\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Login </a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFF99\">\r\n");
      out.write("    <td height=\"400\" width=\"175\" align=\"left\" valign=\"top\" bgcolor=\"#003366\"><p style=\"text-align: left; color: #000;\">&nbsp;</p>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"Accordion1\" class=\"Accordion\" tabindex=\"0\">\r\n");
      out.write("        <div class=\"AccordionPanel\">\r\n");
      out.write("          <div class=\"AccordionPanelTab\">Why We are the Best!</div>\r\n");
      out.write("          <div class=\"AccordionPanelContent\">We are one of the leading companies in the country in importing quality drugs...</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"AccordionPanel\">\r\n");
      out.write("          <div class=\"AccordionPanelTab\">Why you want to buy from us?</div>\r\n");
      out.write("          <div class=\"AccordionPanelContent\">We guarantee the quality of the products and we are reachable to customers easily through on line and via our contact numbers.</div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </td>\r\n");
      out.write("    <td height=\"400\" colspan=\"4\" align=\"center\" valign=\"top\" bgcolor=\"#6699CC\" class=\"para\"></br>\r\n");
      out.write("      <p style=\"color: #000; margin-left:30px; margin-right:30px\">&nbsp;</p>\r\n");
      out.write("      <p style=\"color: #000; margin-left:30px; margin-right:30px\"> <em><strong>Care Pharma</strong> is a recently started pharmacy with a growing customer base.<br />\r\n");
      out.write("        We believe in providing quality products to our valued customers. It is one of the reasons why our customers believe in us when it comes to buying the all types of medicine they require...</em></p>\r\n");
      out.write("      <p style=\"color: #000; margin-left:30px; margin-right:30px\"><em>At <strong>Care Pharma</strong> you will also be able to not find the medicine but also other related medicine related type of items..</em></p>\r\n");
      out.write("    </p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#000000\">\r\n");
      out.write("    <td height=\"55\" colspan=\"5\" align=\"left\" valign=\"top\" style=\"color: #FFF; font-size: small;\">Copy rights @ CarePharma (Pvt) Ltd 2014.</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var Accordion1 = new Spry.Widget.Accordion(\"Accordion1\");\r\n");
      out.write("</script>\r\n");
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
