<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Customer Contact Form</title>
<style type="text/css">
body {
	background-color: #CCCCCC;
	font-family: Tahoma, Geneva, sans-serif;
}
</style>
</head>

<body>
<table width="900" height="" align="center">
  <tr>
    <td height="200" colspan="2"><img src="logo_carePharma.png" width="900" height="200" style="border-bottom-color:#000" /></td>
  </tr>
 
  <tr>
    <td width="105" height="286" bgcolor="#263157">&nbsp;</td>
    <td width="791" height="286"><form id="formAddCusQry" name="formAddCusQry" method="post" action="UpdateCustomerQueries">
      <table width="" border="0">
        <tr>
          <td height="80" colspan="2" align="center" bgcolor="#E1E1FF" style="font-weight: bold; font-size: 24px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif;">Please Enter Details To Add A Query</td>
        </tr>
        <tr>
          <td width="291" height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Name :</td>
          <td width="506" height="20" align="center" bgcolor="#999999"><label for="txtCN2"></label>
            <input name="txtCN" type="text" required="required" id="txtCN2" size="50px" maxlength="30" checked="checked"  /></td>
        </tr>
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Age :<span style="text-align: right"></span></td>
          <td height="80" align="center" bgcolor="#999999"><label for="txtAge"></label>
            <input name="txtAge" type="number" required="required" id="txtAge" min="0" checked="checked" style=" width:200px" /></td>
        </tr>
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Email Address :</td>
          <td height="80" align="center" bgcolor="#999999"><input name="txtEml" type="email" required="required" id="txtEml" size="50px" maxlength="30"  /></td>
        </tr>
        
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">Enter Contact No (optional) :</td>
          <td height="80" align="center" bgcolor="#999999">
          <input name="txtTel" type="tel" id="txtTel" size="50px" maxlength="30" style=" width:200px" /></td>
        </tr>
        
        
         <tr>
          <td height="80" bgcolor="#FFFFFF" style="text-align: center; font-family: Tahoma, Geneva, sans-serif; font-weight: bold;">How Can We Help You ?</td>
          <td height="80" align="center" bgcolor="#999999"><textarea name="txtQstn" cols="50px" rows="4" required="required" id="txtQstn"></textarea></td>
        </tr>
        
        
        
        
        <tr>
          <td height="60" bgcolor="#46413C" style="text-align: center; font-family: Tahoma, Geneva, sans-serif;">&nbsp;</td>
          <td height="60" align="left" bgcolor="#46413C"><input name="btnAddCust" type="submit" id="btnAddCust" 
          style="width:100px; height:40px; margin-left:150px " value="Ask!"  /></b>
          <input type="reset" name="btnCls" id="btnCls" value="Clear" 
          style="width:100px; height:40px; margin-left:30px " />
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