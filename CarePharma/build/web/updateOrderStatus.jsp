
<%@page import="java.sql.Statement"%>
<%@page import="Data.DataConnection"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.*"%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<% //String strReOrd = request.getParameter("ordStatus[j])");
//out.print("CHK :::::"+strReOrd);
    
    

Enumeration allParaNames = request.getParameterNames();
List paras = new ArrayList();
//int i = 0;

DataConnection.con = null;
DataConnection.createConn();
Statement st = DataConnection.con.createStatement();  

while (allParaNames.hasMoreElements()) 
{
    String paraName = (String) allParaNames.nextElement();
    String paraVal = request.getParameter(paraName);
    paras.add(paraVal);
    
    //out.print("| i::"+i+"_ paraVal ::"+ paras.get(i));
    //out.print("|||Before i:"+i); 
    
   try{
        for (int i = 0; i < paras.size()- 1; i++) 
        {
            st.executeUpdate("UPDATE druglist SET Re_Order_Level ='"+paras.get(i+1).toString()+"' WHERE Drug_ID = '"+paras.get(i).toString()+"' "); 
            
        }
   }
   catch(Exception e)
   {
       out.print("ERROR IN UPDATING ORDER LEVELS! "+e);
       //e.printStackTrace();
   } 
   
   
}


response.sendRedirect("setReorderLevel.jsp");
out.print("SUCCESSFULLY UPDATED!");


%>

