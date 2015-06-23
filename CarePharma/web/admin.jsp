


<%@ page contentType="text/html; charset=utf-8" import="java.sql.*"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Add Customer Order</title>
<style type="text/css">
body {
	background-color: #CCCCCC;
	font-family: Tahoma, Geneva, sans-serif;
}
</style>
</head>



<script>
        function logOut()
        {
            
            var winlogout = window.open("http://localhost:8080/CarePharma/logout.jsp", "_self");
                
            
        }
        
    </script>
    
    <script>
        function pageCheck()
        {
            
            var sVar = <%=session.getAttribute("uname")%>;
            
            if(sVar == null)
            {
                var win = window.open("http://localhost:8080/CarePharma/userLogin.jsp", "_self");
                
            }
        }
        
    </script>



    <body vlink="#0033CC" onload="pageCheck();">
<table width="900" height="" align="center">
  <tr>
    <td height="200" colspan="2"><img src="logo_carePharma.png" width="900" height="200" style="border-bottom-color:#000" /></td>
  </tr>
 
  <tr>
    <td width="105" height="230" bgcolor="#263157">&nbsp;</td>
    <td width="791" height="230"><form id="formAddCust" name="formAddCust" method="post" action="addCusOrderForm2.jsp">
      <table width="" border="0">
        <tr>
          <td height="80" colspan="2" align="center" bgcolor="#E1E1FF" style="font-weight: bold; font-size: 24px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif;"><p>Welcome <%=session.getAttribute("uname")%>!</p>
          <p>  You have access to  <%=session.getAttribute("utype")%> privileges!</p>
               ===================================   
          
          </td>
          
        </tr>
                
        
        <tr>
          <td width="353" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">  View User Details ---&gt;</td>
          <td width="429" height="20" align="center" bgcolor="#999999"><a href="viewUserDetails.jsp" style="font-size: 20px; color: #FFF">Click Here!</a></td>
        </tr>
        
        <tr>
          <td width="353" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">View Drugs Info ---&gt;</td>
          <td width="429" height="20" align="center" bgcolor="#999999"><a href="viewDrugDetails.jsp" style="font-size: 20px; color: #FFF">Click Here!</a> 
          </td>
        </tr>
        
        
          <tr>
            <td width="353" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;"> Supplier Record ---&gt;</td>
            <td width="429" height="20" align="center" bgcolor="#999999"><label for="txtchk"><a href="viewSupplierRecords.jsp" style="font-size: 20px; color: #FFF">Click Here!</a></label></td>
          </tr>
               
         <tr>
          <td width="353" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;"> Add a User to System ---&gt;</td>
          <td width="429" height="20" align="center" bgcolor="#999999"><label for="txtchk"><a href="addUserForm.jsp" style="font-size: 20px; color: #FFF">Click Here!</a></label></td>
        </tr>
        
        <tr>
          <td width="353" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;"> Add a Drug to System ---&gt;</td>
          <td width="429" height="20" align="center" bgcolor="#999999"><label for="txtchk"><a href="addDrugForm.jsp" style="font-size: 20px; color: #FFF">Click Here!</a></label></td>
        </tr>
        
        <tr>
          <td width="353" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;"> Register a Supplier---&gt;</td>
          <td width="429" height="20" align="center" bgcolor="#999999"><label for="txtchk"><a href="addSupplierForm.jsp" style="font-size: 20px; color: #FFF">Click Here!</a></label></td>
        </tr>


<tr>
          <td width="353" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;"> Go to Database ---&gt;</td>
          <td width="429" height="20" align="center" bgcolor="#999999"><label for="txtchk"><a href="http://localhost/sqlbuddy/login.php" style="font-size: 20px; color: #FFF">Click Here!</a></label></td>
        </tr>

      
        <tr>
          <td height="60" bgcolor="#46413C" style="text-align: center; font-family: Tahoma, Geneva, sans-serif;">&nbsp;</td>
          <td height="60" align="left" bgcolor="#46413C"><input type="button" name="btnlgout" id="btnlgout" value="Log Out!" 
          style="width:100px; height:40px; margin-left:150px " onclick="logOut();"  /></td>
        </tr>
        
        
        
      </table>
    </form></td>
  </tr>
  <tr>
    <td height="77" colspan="2" bgcolor="#000000" style="color: #FFF; font-family: Tahoma, Geneva, sans-serif; text-align: center; font-size: small;">Copyrights @ CarePharma (Pvt) Ltd 2014.</td>
  </tr>
</table>
<p>&nbsp;</p>
</body>
</html>
               

