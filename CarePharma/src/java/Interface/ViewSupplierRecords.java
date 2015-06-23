/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Interface.CreateTables;
import javax.swing.JFrame;

/**
 *
 * @author dilphinn
 */
@WebServlet(name = "ViewSupplierRecords", urlPatterns = {"/ViewSupplierRecords"})
public class ViewSupplierRecords extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
//        JFrame fr1 = new JFrame();
//            fr1.setSize(500,500);
//            fr1.setVisible(true);
        
        try {
            
            CreateTables ct = new CreateTables();
            ct.supplierReport();
            out.println("Welcome!"+ct.supTel[1]);
            Data.DataConnection.createConn();
            
            try{
            while(ct.rsSup.next())
            {
                out.print("rsSup :"+ct.rsSup.getInt(1));
            }
            }
            catch(Exception e)
            {
                out.println("Draw Tables Error in servlet :"+e);
            }
            
            
            
//            try{
//            Data.DataConnection.con = null;
//            Data.DataConnection.createConn();
//            while(ct.rsSup.next())
//            {
//            out.print("\\\\\rsSup :"+ct.rsSup.getString("Supplier_Name"));
//            }
//            }catch(Exception e)
//            {
//                out.print("rsSup error1");
//            }
//            try{
//            ct.drawTables();
//            }
//            catch(Exception e)
//            {
//                out.print("Draw table error :"+e);
//                
//            }
            
        } finally {            
            out.close();
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
