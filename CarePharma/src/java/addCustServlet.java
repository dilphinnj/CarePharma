/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import Business.UpdateCustomer;
import Business.CreateCustomer;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author dilphinn
 */
@WebServlet(urlPatterns = {"/addCustServlet"})
public class addCustServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
       // PrintWriter out = response.getWriter();
        
        String custName = request.getParameter("txtCN");
        String custTel = request.getParameter("txtTel");
        String custEml = request.getParameter("txtEml");
        
        try{    
            Connection con = null;

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/care_ph","root","");

            } catch(Exception e1)
            {
                System.out.println("Connection Error :"+e1.getMessage());
            }
            
            // creating a new customer and adding to records
           try
           {    
                CreateCustomer newCust1 = new CreateCustomer(custName,custTel,custEml);
                UpdateCustomer uCust = new UpdateCustomer();

                
                if (custName.length()!= 0 && custTel.length()!=0 && custEml.length()!=0)
                {
                    response.sendRedirect("success.jsp");
                    uCust.addCustomer(newCust1);
                }

                else
                {
                    response.sendRedirect("error.jsp");
                }
           }
           
           catch(Exception e3)
           {
               System.out.println("Error in adding record!"+e3);
           }
           
           

            
        }catch(Exception e2)
        {
            System.out.println("SQL error :"+ e2.getMessage());
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
