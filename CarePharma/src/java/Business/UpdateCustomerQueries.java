/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UpdateCustomerQueries", urlPatterns = {"/UpdateCustomerQueries"})
public class UpdateCustomerQueries extends HttpServlet 
{

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        List cusQry = new ArrayList();
        
        String cusName = request.getParameter("txtCN");
        String cusAge = request.getParameter("txtAge");
        String cusEmail = request.getParameter("txtEml");
        String cusTel = request.getParameter("txtTel");
        String cusQstn = request.getParameter("txtQstn");
        
        
        cusQry.add(cusName);
        cusQry.add(cusAge);
        cusQry.add(cusEmail);
        cusQry.add(cusTel);
        cusQry.add(cusQstn);
        
        File filCusQuery = new File("C:\\Users\\dilphinn\\Desktop\\CarePharma\\CarePharma\\CustQueries.txt");
        
        addRecord(cusQry,filCusQuery);
                
        out.print("Thank you for sending your query... we will respond to you back soon! ");
        out.print("</br>");
        out.print("<input id=btnBack type=button onclick=history.back() value=GO_BACK />");
    }
    
    public synchronized static void addRecord(List newCusQry,File filename) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new FileWriter(filename,true));
        
        outFile.println("Customer Query");
        outFile.println("***************");
        outFile.println("");
        outFile.println("Name :"+newCusQry.get(0));
        outFile.println("Age :"+newCusQry.get(1));
        outFile.println("Email :"+newCusQry.get(2));
        outFile.println("Tel :"+newCusQry.get(3));
        outFile.println("Query :"+newCusQry.get(4));
        outFile.close();
        
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
