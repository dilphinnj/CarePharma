package Interface;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Business.*;
import Data.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class AddUserServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        try 
        
        {
        
            String usrFullName = request.getParameter("txtFN");
            String usrName = request.getParameter("txtUN");
            String usrType = request.getParameter("uRegList");
            String usrTelTxt = request.getParameter("txtTel");
            String usrPass = request.getParameter("txtPw1");

            int usrTel = Integer.parseInt(usrTelTxt);
           

            CreateUser newUser1 = new CreateUser(usrFullName,usrName,usrType,usrPass,usrTel);
            UpdateUser upUser1 = new UpdateUser();

            upUser1.addUser(newUser1);

            ResultSet rsChk;
                     
            
            out.println("Adding User...");
         
         
            
            try
            {
                Statement st = DataConnection.con.createStatement();
                
           
                //Statement st = DataConnection.con.prepareStatement("select * from users where User_Name='" + usrName + "'&& User_Type='" +usrType+ "'  && Password= '"+ usrPass +"'");
                rsChk = st.executeQuery("select User_ID from users where User_Name='" + usrName + "'&& User_Type='" +usrType+ "'  && Password= '"+ usrPass +"'");
            
                
            
            
                if(rsChk.next())
                {
                    out.println("Successfully User entered into records!");
                    
                    
                    int uID = rsChk.getInt("User_ID");
                    
                    
                    
                    if ((usrType).equals("Manager"))
                    {
                        st.executeUpdate("UPDATE managers SET User_ID ='"+uID+"'WHERE Manager_Name='" + usrFullName + "'&& Manager_Tel='" +usrTel+ "'");

                    }

                    else if ((usrType).equals("Pharmacist"))
                    {
                        st.executeUpdate("UPDATE pharmacists SET User_ID ='"+uID+"'WHERE Pharmacist_Name='" + usrFullName + "'&& Pharmacist_Tel='" +usrTel+ "'");

                    }

                    else if ((usrType).equals("Admin"))
                    {
                        st.executeUpdate("UPDATE sys_admins SET User_ID ='"+uID+"'WHERE Admin_Name='" + usrFullName + "'&& Admin_Tel='" +usrTel+ "'");
                    }
                }
            
            }catch(Exception e3)
            {
                out.println("Connection error:"+ e3);
            } 
          
        } finally {       
            
            out.println("\n Try again to add a new record!");
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
