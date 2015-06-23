package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head profile=\"../jsSlider/themes/5/js-image-slider.js\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<!-- TemplateBeginEditable name=\"doctitle\" -->\r\n");
      out.write("<title>Login</title>\r\n");
      out.write(" <link href=\"../jsSlider/themes/5/js-image-slider.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write(" <script src=\"../jsSlider/themes/5/js-image-slider.js\"  type=\"text/javascript\"></script>\r\n");
      out.write(" <link href=\"../jsSlider/generic.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write(" \r\n");
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
      out.write("    <td width=\"189\" height=\"39\" valign=\"top\"><a href=\"../../CarePharmaSite/web/flexAdds_home.html\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Home</a></td>\r\n");
      out.write("    <td width=\"278\" valign=\"top\"><a href=\"../../CarePharmaSite/web/About_us.html\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">About Us</a></td>\r\n");
      out.write("    <td width=\"217\" valign=\"top\"><a href=\"../../CarePharmaSite/web/ContactUs.html\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Contact Us</a></td>\r\n");
      out.write("    \r\n");
      out.write("    <td width=\"216\" valign=\"top\"><a href=\"http://localhost:8080/CarePharma/user_login.jsp\" style=\"font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif\">Login </a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFF99\">\r\n");
      out.write("    <td height=\"400\" width=\"175\" align=\"left\" valign=\"top\" bgcolor=\"#666699\"><p style=\"text-align: left; color: #000;\">&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p></td>\r\n");
      out.write("    <td height=\"400\" colspan=\"4\" align=\"center\" valign=\"top\" bgcolor=\"#6699CC\" class=\"para\"><p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;\r\n");
      out.write("    \r\n");
      out.write("     <div class=\"div1\"><h2>Demo 5 - Semi-transparent Thumbnails</h2>\r\n");
      out.write("        <p>Demos: <a href=\"demo1.html\">1</a><a href=\"demo2.html\">2</a><a href=\"demo3.html\">3</a><a href=\"demo4.html\">4</a>\r\n");
      out.write("        <a href=\"demo5.html\" class=\"current\">5</a><a href=\"demo6.html\">6</a><a href=\"demo7.html\">7</a><a href=\"demo8.html\">8</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"sliderFrame\">\r\n");
      out.write("        <div id=\"ribbon\"></div>\r\n");
      out.write("        <div id=\"slider\">\r\n");
      out.write("            <a href=\"http://www.menucool.com/\">\r\n");
      out.write("                <img src=\"images/image-slider-1.jpg\" alt=\"Welcome to Menucool.com\" />\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"lazyImage\" href=\"images/image-slider-2.jpg\" title=\"Customizable Transition Effects\">Customizable Transition Effects</a>\r\n");
      out.write("            <a href=\"http://www.menucool.com/javascript-image-slider\">\r\n");
      out.write("                <b data-src=\"images/image-slider-3.jpg\" data-alt=\"#htmlcaption3\">Image Slider</b>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"lazyImage\" href=\"images/image-slider-4.jpg\" title=\"Pure Javascript. No jQuery. No flash.\">Plain Javascript Slider</a>\r\n");
      out.write("            <a class=\"lazyImage\" href=\"images/image-slider-5.jpg\" title=\"#htmlcaption5\">Lazy Loading Image</a>\r\n");
      out.write("            <a class=\"lazyImage\" href=\"images/image-slider-1.jpg\" title=\"Light weight Image Slider\">Light weight Image Slider</a>\r\n");
      out.write("            <a class=\"lazyImage\" href=\"images/image-slider-2.jpg\" title=\"Fine tuned. Sleek & Smooth\">Fine tuned. Sleek & Smooth</a>\r\n");
      out.write("            <a class=\"lazyImage\" href=\"images/image-slider-3.jpg\" title=\"Easy-to-Use Slider\">Easy-to-Use Slider</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"display: none;\">\r\n");
      out.write("            <div id=\"htmlcaption3\">\r\n");
      out.write("                <em>HTML</em> caption. Back to <a href=\"http://www.menucool.com/\">Menucool</a>.\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"htmlcaption5\">\r\n");
      out.write("                Smart Lazy Loading Image\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                \r\n");
      out.write("        <!--thumbnails-->\r\n");
      out.write("        <div id=\"thumbs\">\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb1.jpg\" /></div>\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb2.jpg\" /></div>\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb3.jpg\" /></div>\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb4.jpg\" /></div>\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb5.jpg\" /></div>\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb1.jpg\" /></div>\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb2.jpg\" /></div>\r\n");
      out.write("            <div class=\"thumb\"><img src=\"images/thumb3.jpg\" /></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    </p></td>\r\n");
      out.write("  </tr><tr></br></tr>\r\n");
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
