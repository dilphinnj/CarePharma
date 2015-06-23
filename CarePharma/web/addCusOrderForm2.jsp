

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*"  %>
<%@page import="Data.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Customer Order Form</title>
<style type="text/css">
body {
	background-color: #CCCCCC;
	font-family: Tahoma, Geneva, sans-serif;
}
</style>


</head>
<script>
  function createDate()
{
    var d2 = new Date();
    var x2 = d2.getFullYear()+"-0"+ d2.getMonth()+"-"+ d2.getDate();
    formAddCust.txtOD.value = x2;
}
</script>



 <% 

DataConnection.createConn();
ResultSet rsDrugID = null;
Statement st = null;
st = DataConnection.con.createStatement();
List drugID = new ArrayList();
int i = 0;

try{
rsDrugID = st.executeQuery("SELECT * FROM druglist");

while(rsDrugID.next())
{
    //out.print("Drug ID :"+rsDrugID.getInt(1));
    drugID.add(rsDrugID.getInt(1));
}


}
catch(Exception e)
{
out.print("Error :"+e);
}

//
int noOfMeds = Integer.parseInt(request.getParameter("txtMedNo"));

%>
    
   
    
<body onload="createDate()">
    
<table width="900" height="" align="center">
  <tr>
    <td height="200" colspan="2"><img src="logo_carePharma.png" width="900" height="200" style="border-bottom-color:#000" /></td>
  </tr>
 
  <tr>
    <td width="105" height="286" bgcolor="#263157">&nbsp;</td>
    <td width="791" height="286">
        <form id="formAddCust" name="formOrdCust" method="post" action="createInvoice.jsp" >
         
      <table id="tblForm" width="" border="0">
        <tr>
          <td height="80" colspan="2" align="center" bgcolor="#E1E1FF" style="font-weight: bold; font-size: 24px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif;">Please Add A Customer Order</td>
        </tr>
        <tr>
          <td width="291" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Order Date :</td>
          <td width="506" height="20" align="center" bgcolor="#999999"><label for="txtCN2"></label>
            <input name="txtOD" type="text" id="txtOD" size="50px" maxlength="10" style="width:150px"  /></td>
        </tr>
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Customer ID:<span style="text-align: right"></span></td>
          <td height="80" align="center" bgcolor="#999999"><label for="txtTel"></label>
            <input name="txtCI" type="text" id="txtCI" size="50px" maxlength="8" style="width:150px" /></td>
        </tr>
        
        
        
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">No. of Medicine Purchased:<span style="text-align: right"></span></td>
          <td height="80" align="center" bgcolor="#999999"><label for="txtTel"></label>
            <input name="txtMedNo" type="text" id="txtMedNo" style="width:150px" size="50px" maxlength="8" value="<%=noOfMeds%>" /></td>
        </tr>
        
          <%
            //int noOfMed = 4;
            
            for(int k = 1;k <= noOfMeds ;k++)
            {
            %>
            
          <tr>
          <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Drug ID:</td>
          <td height="80" align="center" bgcolor="#999999"><label for="drugID"></label>
            <select name="drugList<%=k%>" id="drugListID<%=k%>"  style="width:150px">
                <% for(int j=0; j < drugID.size(); j++)
                {%>
                <option value="<%= drugID.get(j)%>"> <%= drugID.get(j)%>  </option>
                <% }%>
        </select></td>
        </tr>
        <tr>
        
        <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Quantity:</td>
          <td height="80" align="center" bgcolor="#999999"><input name="txtQty<%=k%>" type="number" id="txtQty<%=k%>" min="0" size="50px"  maxlength="5" style=" width:150px" /></td>
        </tr>
        <%       
   }
%>
     
        <tr>
          <td height="60" bgcolor="#46413C" style="text-align: center; font-family: Tahoma, Geneva, sans-serif;">&nbsp;</td>
          <td height="60" align="left" bgcolor="#46413C">
              <input type="submit" name="btnAddCust" id="btnAddCust" value="Add Record" style="width:100px; height:40px; margin-left:100px " />
              
              <input type="reset" name="btnCls" id="btnCls" value="Clear"style="width:100px; height:40px; margin-left:20px " />
              <input type="button" name="btnBack" id="btnBack" value="Back" onclick="history.back()" 
          style="width:100px; height:40px; margin-left:20px " />
          </td>
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

