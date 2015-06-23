/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dilphinn
 */
public class DataConnection {
    
    public static Connection con = null;
    
    public static void createConn()
    {
        // adding a connection
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/care_ph","admin","admin123");
        
        }catch(Exception e1)
        {
            System.out.println("Driver Error :"+ e1);
        }
    }
    
}
