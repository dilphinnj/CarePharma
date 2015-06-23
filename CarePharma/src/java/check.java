import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import javax.servlet.http.HttpSession;
import Business.*;
import java.sql.*;



public class check extends HttpServlet 
{
    //public String a,b,c;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,java.io.IOException
    {
        try{
                
                String uName = request.getParameter("tUn");
                String uType = request.getParameter("lUt");
                String uPass = request.getParameter("tPw");
                
                
                CreateUser user = new CreateUser(uName,uType,uPass);
                
                //user = UserDAO.login(user);
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:/care_ph","root", "");
                Statement st = con.createStatement();
                ResultSet rs;
                rs = st.executeQuery("select * from members where User_Name='" + uName + "' and UserType='" + uType + "' and Password= '"+ uPass+"'");
                
                if (rs.next()) 
                {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("UserName", uName);
                    //out.println("welcome " + userid);
                    //out.println("<a href='logout.jsp'>Log out</a>");
                    response.sendRedirect("index.html");
                } 
                
                else 
                {
                    System.out.println("Invalid password <a href='login.html'>try again</a>");
                }
        }
        
        catch(Exception e)
        {
            System.out.println(""+ e);
            System.out.println("\n\n Please check your correct user name & password and try again!");
        }
    }
    
    
}
