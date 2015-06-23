<%@ page import ="java.sql.*"%>
<%
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
    
    out.println("\t\n User Name :" +uName);%><br><%
    out.println("\t\n User Type :" +uType );%><br><%
    out.println("\t\n Password :" +uPass); %><br><%   
    
    
    
        if(rs.next())
        {
            
            int usrID = rs.getInt(1);
            rsPhID = st.executeQuery("select Pharmacist_ID from pharmacists where User_ID='"+usrID+"'");
            
            
            session.setAttribute("uname", uName);
            session.setAttribute("utype", uType);
            
            int phID = 0;
            
            while(rsPhID.next())
            {
                phID =rsPhID.getInt(1);
            }
            
            
            
            session.setAttribute("pid",phID); 
                        
            
            
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
            response.sendRedirect("error.jsp");%><br><%
            out.println("Please check your User Name, User Type and Password and login again!");
        }
 
    }
    catch(Exception ex)
    {
        out.println("\n *****SQLException: " + ex.getMessage());
       // out.println("SQLState: " + ex.);
       // out.println("VendorError: " + ex.getErrorCode());
    }
    
    
%>