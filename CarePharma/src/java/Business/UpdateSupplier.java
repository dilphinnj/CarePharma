
package Business;

import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import Data.*;


public class UpdateSupplier 
{
    
    
    public void addSupplier(CreateSupplier sup)
    {
        // creating data connection
         DataConnection.con = null;       
         DataConnection.createConn();
                
        // creating sql queries
        
        try
        {
            PreparedStatement ps = DataConnection.con.prepareStatement("INSERT INTO supplier(Supplier_Name,Supplier_Tel,Admin_ID,Drugs_Supplied) VALUES(?,?,?,?)");
            
            ps.setString(1,sup.getSupName());
            ps.setInt(2,sup.getsupTel());
            ps.setInt(3,sup.getAdmID());
            ps.setString(4,sup.getSupDrug());
            ps.executeUpdate();
            
        }catch(Exception e2)
        {
            System.out.println("SQL error :"+ e2);
        }
        
        
        
    }
}
