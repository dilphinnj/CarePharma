<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>

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


 <script type="text/javascript">

function validateForm()
{
		

if(formAddCust.txtMedNo.value == "")
	{
		window.alert("Please enter No of Meds!");
		formAddCust.txtMedNo.focus();
		return false;
	}	

}

</script>
    
<script>
    function displayDrugs()
    {
       var win = window.open("http://localhost:8080/CarePharma/viewDrugDetails.jsp", "drugWin", "width=400,height=600,left=300");
        
    }
    
</script>



<body vlink="#0033CC">
<table width="900" height="" align="center">
  <tr>
    <td height="200" colspan="2"><img src="logo_carePharma.png" width="900" height="200" style="border-bottom-color:#000" /></td>
  </tr>
 
  <tr>
    <td width="105" height="230" bgcolor="#263157">&nbsp;</td>
    <td width="791" height="230"><form id="formAddCust" name="formAddCust" method="post" action="addCusOrderForm2.jsp" onsubmit="return validateForm()">
      <table width="" border="0">
        <tr>
          <td height="80" colspan="2" align="center" bgcolor="#E1E1FF" style="font-weight: bold; font-size: 24px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif;">Please Add Details To Create A User</td>
        </tr>
                
        
        <tr>
          <td width="291" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter No. Of Medicine:</td>
          <td width="506" height="20" align="center" bgcolor="#999999"><label for="txtMedNo"></label>
            <input name="txtMedNo" type="text" id="txtCN" maxlength="10" style="width:150px"  /></td>
        </tr>
        
        <tr>
          <td width="291" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Open Drug Info ---&gt;</td>
          <td width="506" height="20" align="center" bgcolor="#999999"><label for="txtDrugWin" style="color: #FFF; font-style: italic;" ><a href="" onclick="displayDrugs()" > <u>Click Here To Open The Drug Information Window </u></a></label></td>
        </tr>
        
      
        <tr>
          <td height="60" bgcolor="#46413C" style="text-align: center; font-family: Tahoma, Geneva, sans-serif;">&nbsp;</td>
          <td height="60" align="left" bgcolor="#46413C"><input type="submit" name="btnAddCust" id="btnAddCust" value="Add Record" 
          style="width:100px; height:40px; margin-left:100px " />
          <input type="reset" name="btnCls" id="btnCls" value="Clear" 
          style="width:100px; height:40px; margin-left:20px " />
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