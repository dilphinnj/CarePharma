/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.DataConnection;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




 // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
     @WebServlet(name = "UpdateCustOrder", urlPatterns = {"/UpdateCustOrder"})

public class UpdateCustOrder extends HttpServlet 
{

    static int ordNo = 0;
    static ResultSet rsOrdID;
    static Statement st;
    List paras = new ArrayList();
    private String ordDate;
    private int custID;
    private static int noOfMeds;
    File filename = new File("C:\\Users\\dilphinn\\Desktop\\CarePharma\\CarePharma\\CustFullOrdersLog.txt");
    
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException
    {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter outPr = response.getWriter();
            
            
            PrintWriter outFile = new PrintWriter(new FileWriter(filename, true));
                        

            Enumeration allParaNames=request.getParameterNames();
            CreateCustomerOrder ord = new CreateCustomerOrder();

            while(allParaNames.hasMoreElements())
            {
                
                String paraName = (String)allParaNames.nextElement();
                String paraVal = request.getParameter(paraName);
                
                //Testing
               // outPr.print("||paraName::"+paraName+"|paraVal :::::"+paraVal);
                
                paras.add(paraVal);
                


                
                if(paraName.equals("txtOD"))
                {
                    ordDate = paraVal;
                    ord.ordDate(ordDate);
                    //Testing
                   // outPr.print("THE ORD DATE IS : "+ordDate);
                }

                else if(paraName.equals("txtCI"))
                {
                    custID = Integer.parseInt(paraVal);
                    ord.custID(custID);
                    //Testing
                   // outPr.print("THE CUST ID IS : "+custID);
                }

                else if(paraName.equals("txtMedNo"))
                {
                    noOfMeds = Integer.parseInt(paraVal);
                   //Testing 
                  // outPr.print("THE MED NO IS : "+noOfMeds);

                }
                
                
                try{
                    
                    
                    for (int i = 1; i <= noOfMeds; i++) 
                    {
                        String id = Integer.toString(i);
                        String dr = "drugList".concat(id);
                        String qty = "txtQty".concat(id);
                        
                        if(paraName.equals(dr))
                            {
                                ord.drugID.add(paraVal);
                                //Testing
//                                outPr.print("||drugList =="+dr );
//                                outPr.print("|drugList Val ="+paraVal );
                            }
                        else if(paraName.equals(qty))
                            {
                                ord.drugQty.add(paraVal);
                                //Testing
//                                outPr.print("||QtyList =="+qty );
//                                outPr.print("|QtyList Val ="+paraVal );
                            }
                    }    
                  
                
                }catch(Exception e)
                {
                    e.printStackTrace();
                    outPr.print("ERROR :"+e);
                }
               

            }
            
            

            
          
           synchronized(this)
           {
               ordNo = readOrderID();
               ordNo++;
               
           }
            
            
       // Add record to the file
            
            try
            {
                
             addRecord(ord,filename);
             outPr.print("Successfully Entered Order No :::::::"+ ordNo);
            
            }catch(Exception e)
            {
            
                outPr.print("error in adding record!"+ e);
                e.printStackTrace();
            }
                                     
               
           
        
           
    }
    
    
    
    
    
    
    public int readOrderID() throws IOException 
     {
      
         // retrieving last order id from the log file
           
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String sRead = "Order No";
            String fileRead = new String();
            String strOrdID = new String();
            String ordIDFile;


            Scanner sc =  new Scanner(filename);

            try{
            while(sc.hasNextLine())
            {

            fileRead = sc.nextLine(); 

            if(fileRead.contains(sRead.trim()))
            {
               strOrdID = fileRead.trim(); 
               strOrdID = strOrdID.substring(10);
            }


            }
            }catch(Exception e)
            {
            e.printStackTrace();
            }

            ordIDFile = strOrdID;

            return Integer.parseInt(ordIDFile);
    }             
                
                
    public synchronized static void addRecord(CreateCustomerOrder ord, File filename) throws IOException 
    {                

                
                 
            int  nextOrderNo = ordNo;
            PrintWriter out = new PrintWriter(new FileWriter(filename, true));


            out.println(" ");
            out.println(" ");
            out.println("**************** ");
            out.println(" Order No :"+ nextOrderNo);
            out.println("=====================");
            out.println("|| Order Date: "+ ord.getOrderDate());
            out.println("|| Customer ID: "+ ord.getCustID());

            for (ord.ordCntr = 0; ord.ordCntr < noOfMeds; ord.ordCntr++) 
            {
                out.println("|| Drug ID :" + ord.getDrugID() + "| Purchased Qty :" + ord.getQty());

            }

            out.close();

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
   
        

        
        
        
        
        
        
        

 
