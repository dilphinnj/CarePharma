
package Business;
import Data.*;
import java.sql.*;
import java.io.*;




public class UpdateUser 
{
    
       
    public void addUser(CreateUser newUser)
    {
       try
       {
            try
            {
                DataConnection.con = null;
                DataConnection.createConn();

            }catch(Exception e)
            {
                System.out.println("Connection error :"+e);
            }
            
            PreparedStatement ps2 = DataConnection.con.prepareStatement("INSERT INTO users (User_Name,User_Type,User_Full_Name,Password,User_Tel) VALUES(?,?,?,?,?)");
            ps2.setString(1,newUser.getUserName());
            ps2.setString(2,newUser.getUserType());
            ps2.setString(3,newUser.getUserFullName());
            ps2.setString(4,newUser.getPassword());
            ps2.setInt(5,newUser.getUserTel());
            ps2.executeUpdate();
            
            
            
            
            if (newUser.getUserType().equals("Manager"))
            {
                PreparedStatement ps3 = DataConnection.con.prepareStatement("INSERT INTO managers (Manager_Name,Manager_Tel) VALUES(?,?)");
                ps3.setString(1,newUser.getUserFullName());
                ps3.setInt(2,newUser.getUserTel());
                ps3.executeUpdate();
            }
            
            else if (newUser.getUserType().equals("Pharmacist"))
            {
                PreparedStatement ps4 = DataConnection.con.prepareStatement("INSERT INTO pharmacists (Pharmacist_Name,Pharmacist_Tel) VALUES(?,?)");
                ps4.setString(1,newUser.getUserFullName());
                ps4.setInt(2,newUser.getUserTel());
                ps4.executeUpdate();
            }
            
            else if (newUser.getUserType().equals("Admin"))
            {
                PreparedStatement ps5 = DataConnection.con.prepareStatement("INSERT INTO sys_admins (Admin_Name,Admin_Tel) VALUES(?,?)");
                ps5.setString(1,newUser.getUserFullName());
                ps5.setInt(2,newUser.getUserTel());
                ps5.executeUpdate();
            }
            
            else{
                System.out.println("No User type!");
            }
            
        
       } catch(Exception e2)
       {
                System.out.println("Unable to update user/ Error :"+e2);
       }
    }
    
    
           
    
    
    
}
