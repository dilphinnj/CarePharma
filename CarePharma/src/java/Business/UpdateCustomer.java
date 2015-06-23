
package Business;

import java.util.*;
import java.sql.*;
import javax.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import Data.*;


public class UpdateCustomer 
{
    
    
    public void addCustomer(CreateCustomer cust)
    {
        // creating data connection
         DataConnection.con = null;       
         DataConnection.createConn();
                
        // creating sql queries
        
        try
        {
            PreparedStatement ps = DataConnection.con.prepareStatement("INSERT INTO customers(Customer_Name,Customer_Tel,Customer_Age) VALUES(?,?,?)");
            
            ps.setString(1,cust.getCustName());
            ps.setInt(2,cust.getCustTel());
            ps.setString(3,cust.getCustAge());
            ps.executeUpdate();
            
        }catch(Exception e2)
        {
            System.out.println("SQL error :"+ e2);
        }
        
        
        
    }
}
