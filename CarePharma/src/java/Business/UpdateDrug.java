
package Business;

import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import Data.*;


public class UpdateDrug 
{
    
    
    public void addDrug(CreateDrug dr)
    {
        // creating data connection
         DataConnection.con = null;       
         DataConnection.createConn();
                
        // creating sql queries
        
        try
        {
            PreparedStatement ps = DataConnection.con.prepareStatement("INSERT INTO druglist(Drug_Name,Drug_Detail,Qty_In_Stock,Price_Per_Unit) VALUES(?,?,?,?)");
            
            ps.setString(1,dr.getDrugName());
            ps.setString(2,dr.getDrugDetails());
            ps.setInt(3,dr.getDrugQty());
            ps.setDouble(4,dr.getDrugPPU());
            ps.executeUpdate();
            
        }catch(Exception e2)
        {
            System.out.println("SQL error :"+ e2);
        }
        
        
        
    }
}
