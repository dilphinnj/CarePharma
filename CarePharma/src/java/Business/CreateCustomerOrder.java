
package Business;
import Data.*;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;




public class CreateCustomerOrder 
{
    
    private String ordDate;
    private int custID;
    private int noOfMeds;
    private String custAge;
    List drugID = new ArrayList();
    List drugQty = new ArrayList();
    public int ordCntr;
    
    
    
    public CreateCustomerOrder(String od,int cid,int nom,int di,int qty)
    {
        ordDate = od;
        custID = cid;
        noOfMeds = nom;
        drugID.add(di);
        drugQty.add(qty);
    }
    
    public CreateCustomerOrder()
    {
    
    }
    
    public String getOrderDate()
    {
        return ordDate;
    }
    
    public void ordDate(String od)
    {
        ordDate = od;
    }
    
   public int getCustID()
    {
        return custID;
    }
    
    public void custID(int cid)
    {
        custID = cid;
    }
    
    public int getMedsPurchsd()
    {
        return noOfMeds;
    }
    
    public void MedsPurchsd(int nom)
    {
        noOfMeds = nom;
    }
    
     public String getDrugID()
    {
        return drugID.get(ordCntr).toString();
    }
    
    public void drugID(int di)
    {
        drugID.add(di);
    }
    
    public String getQty()
    {
        return drugQty.get(ordCntr).toString();
    }
    
    public void drugQty(int qty)
    {
        drugQty.add(qty);
    }
    
   
    
}


    
    
    

