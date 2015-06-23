
package Interface;

import Business.CreateSupplier;
import Data.DataConnection;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class CreateTables 
{
    String columns[];
    ResultSetMetaData rsmd;
    public ResultSet rsSup = null;
    ArrayList<CreateSupplier> supList ;
    Object data[][] ;
    int rid=0;
    
   
    public int[] supID;
    public int[] supTel;
    public int[] AdmID;
    public String[] supName;
    public String[] drugSup;
    

    
    
    public void supplierReport()
    {
        
        try {
                DataConnection.con = null;
                DataConnection.createConn();
                Statement st = DataConnection.con.createStatement();
                rsSup = st.executeQuery("SELECT * FROM supplier");
                rsmd = rsSup.getMetaData();
            }
        catch(Exception e)
            {
                System.out.println("Error in SupplierReport Data Connection :"+e);
            }
        
        try {
        
               
            int i = 0;  
            rsSup.last();
            rid = rsSup.getRow();
            System.out.println("Row id"+rid);
            rsSup.beforeFirst();


            supID = new int[rid];
            supTel = new int[rid];
            AdmID = new int[rid];
            supName = new String[rid];
            drugSup = new String[rid];
              
              
            while(rsSup.next())
            {
                //Testing
                //System.out.println("Before"+i);
               
                supID[i] = rsSup.getInt(1);
                supName[i] = rsSup.getString(2);
                supTel[i] = rsSup.getInt(3);
                AdmID[i] = rsSup.getInt(4);
                drugSup[i]=rsSup.getString(5);

                i++;
               
            }
            
                for (int j = 0; j < supID.length; j++) 
                {
                    
                    System.out.println("a1:"+supID[j]);
                    System.out.println(""+supTel[j]);
                    System.out.println(""+AdmID[j]);
                    System.out.println(""+supName[j]);
                    System.out.println(""+drugSup[j]);
                }
            
            }
        
        catch(Exception e1)
            {
                System.out.println("Error in SupplierReport supplier data extraction :" +e1);
            } 
            
        
     }
    
    
 }