package Interface;



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import Business.*;
import javax.servlet.annotation.WebServlet;
import Data.DataConnection;







@WebServlet(name = "AddSupplierServlet", urlPatterns = {"/AddSupplierServlet"})
public class AddSupplierServlet extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
       // PrintWriter out = response.getWriter();
        
        String supName = request.getParameter("txtSN");
        String supTel = request.getParameter("txtTel");
        String admID = request.getParameter("txtAID");
        String drugName = request.getParameter("txtDN");
        
        int supTelInt = Integer.parseInt(supTel);
        int admIDInt = Integer.parseInt(admID);
        
        try{ 
            //Connection con = null;
            

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
                CreateSupplier newSup = new CreateSupplier(supName,supTelInt,admIDInt,drugName);
                UpdateSupplier uSup = new UpdateSupplier();
                
                
                if (supName.length()!= 0 && drugName.length()!=0 )
                {
                    response.sendRedirect("success.jsp");
                    uSup.addSupplier(newSup);
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














    
