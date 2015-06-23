/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CreateDrug;
import Business.UpdateDrug;
import Data.DataConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dilphinn
 */
@WebServlet(name = "AddDrugServlet", urlPatterns = {"/AddDrugServlet"})
public class AddDrugServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String drugName = request.getParameter("txtDN");
        String drugDetails = request.getParameter("txtDD");
        String drugQty = request.getParameter("txtQty");
        String drugPPU = request.getParameter("txtPPU");
        
        int drugQtyNo =  Integer.parseInt(drugQty);
        double drugPPUNo = Double.parseDouble(drugPPU);
        
        
        
      
            

            try {
                
                  DataConnection.con = null;
                  DataConnection.createConn();
                  

            } catch(Exception e1)
            {
                System.out.println("Connection Error :"+e1.getMessage());
            }
            
            // creating a new customer and adding to records
           try
           {    
                CreateDrug dr = new CreateDrug(drugName,drugDetails,drugQtyNo,drugPPUNo);
                UpdateDrug uDrug = new UpdateDrug();
                
                
                
                if (drugName.length()!= 0 && drugQty.length()!=0 )
                {
                  
                    uDrug.addDrug(dr);
                    response.sendRedirect("success.jsp");
                    
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
