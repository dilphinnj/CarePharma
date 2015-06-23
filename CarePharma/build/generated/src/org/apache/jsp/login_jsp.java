package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String uName = request.getParameter("tUn");  
    String uType = request.getParameter("lUt");
    String uPass = request.getParameter("tPw");
  
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/care_ph","root","");
    Statement st = con.createStatement();
    ResultSet rs;
    ResultSet rsPhID;
    rs = st.executeQuery("select * from users where User_Name='" + uName + "'&& User_Type='"+uType+ "'  && Password= '"+ uPass+"'");
    
    out.println("\t\n User Name :" +uName);
      out.write("<br>");

    out.println("\t\n User Type :" +uType );
      out.write("<br>");

    out.println("\t\n Password :" +uPass); 
      out.write("<br>");
   
    
    
    
        if(rs.next())
        {
            
            int usrID = rs.getInt(1);
            rsPhID = st.executeQuery("select Pharmacist_ID from pharmacists where User_ID='"+usrID+"'");
            int phID =rsPhID.getInt(1);
            
            session.setAttribute("uname", uName);
            session.setAttribute("utype", uType);
            session.setAttribute("pid", phID); 
                        
            while(rsPhID.next()){}
            
            if(uType.equals("Admin"))
            {
                response.sendRedirect("admin.jsp");
            }
            
            else if(uType.equals("Pharmacist"))
            {
                response.sendRedirect("pharmacist.jsp");
            }
            
            else if(uType.equals("Manager"))
            {
                response.sendRedirect("manager.jsp");
            }
            
            
            
         }

        else
        {
            response.sendRedirect("error.jsp");
      out.write("<br>");

            out.println("Please check your User Name, User Type and Password and login again!");
        }
 
    }
    catch(Exception ex)
    {
        out.println("\n *****SQLException: " + ex.getMessage());
       // out.println("SQLState: " + ex.);
       // out.println("VendorError: " + ex.getErrorCode());
    }
    
    

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
