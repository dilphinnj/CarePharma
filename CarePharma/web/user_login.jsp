
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- TemplateBeginEditable name="doctitle" -->
<title>Login</title>
<!-- TemplateEndEditable -->
<style type="text/css">
<!--
body {
	background-color: threedlightshadow;
	text-align: center;
	color: #FFF;
	font-size: large;
}
a:hover {
	color: #000;
	text-decoration: none;
}
.backg tr td {
	text-align: center;
	font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
}
.backg {
	text-align: left;
}
.backg tr td #MenuBar1 li {
	font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
}
.backg tr td #MenuBar1 li {
	color: #FFF;
	width: auto;
}
.backg tr td {
	font-family: Calibri, "Calisto MT";
	text-align: center;
}
.backg {
	font-family: Georgia, "Times New Roman", Times, serif;
}
.backg {
	font-family: Verdana, Geneva, sans-serif;
}
para {
	text-align: left;
}
para {
	text-align: left;
}
.para {
	text-align: left;
}
#para {
	text-align: left;
}
.backg tr .para2 {
	text-align: left;
}
#para2 {
}
.backg tr .para #para2 {
	font-family: "Times New Roman", Times, serif;
	text-align: left;
}
.backg tr .para p span {
	color: #000;
	text-align: left;
	font-family: "Times New Roman", Times, serif;
}
.backg tr td old {
	text-align: justify;
}
.backg {
	text-align: center;
}
-->
</style>
<style type="text/css">
<!--
a:link {
	color: #FFF;
	text-decoration: none;
}
a:visited {
	color: #FFF;
	text-decoration: none;
}
a:active {
	color: #FFF;
	text-decoration: none;
	text-align: center;
	font-family: "Palatino Linotype", "Book Antiqua", Palatino, serif;
}
.backg tr .para #form1 label {
	text-align: left;
}
.backg tr .para #form1 label span {
	color: #000;
}
.backg {
	text-align: center;
}
.backg {
	text-align: center;
}
.backg {
	text-align: center;
}
.backg {
	text-align: center;
}
.backg tr .para #form1 label span {
	text-align: center;
}
.backg tr .para #form1 span label {
	color: #000;
}
.backg tr .para #form1 label span {
	text-align: center;
}
.backg tr .para #form1 table tr td {
	color: #000;
}
.backg {
	font-family: Georgia, "Times New Roman", Times, serif;
}
-->
</style>
<!-- TemplateBeginEditable name="head" -->
<!-- TemplateEndEditable -->
</head>



<body bgcolor="#FFFFFF" text="#666666" alink="#666666">

<table width="800" align="center" cellpadding="0" cellspacing="0" class="backg">
  <tr>
    <td height="200" width="200" colspan="4" valign="top"><img src="logo_carePharma.png" width="900" height="200" /></td>
  </tr>
  <tr bgcolor="#000000" style="text-align: center; font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;">
    <td width="200" height="39" valign="top"><a href="../../CarePharmaSite/web/flexAdds_home.html" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">Home</a></td>
    <td width="200" valign="top"><a href="../../CarePharmaSite/web/About_us.html" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">About Us</a></td>
    <td width="200" valign="top"><a href="../../CarePharmaSite/web/ContactUs.html" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">Contact Us</a></td>
    
    <td width="200" valign="top"><a href="http://localhost:8080/CarePharma/user_login.jsp" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">Login </a></td>
  </tr>
  <tr bgcolor="#FFFF99">
    <td height="400" width="231" align="left" valign="top" bgcolor="#666699"><p style="text-align: left; color: #000;">&nbsp;</p>
    <p>&nbsp;</p></td>
    <td height="400" colspan="4" align="center" valign="top" bgcolor="#6699CC" class="para"><p style="color: #000">&nbsp;</p>
   
    
    <form id="form1" name="formlog" method="post" action="login.jsp">

      <label> </label>
      <table width="531" border="0" align="center">
        <tr>
          <td width="138" height="55" bgcolor="#FFFFFF">&nbsp;&nbsp;User Name :</td>
          <td width="303" bgcolor="#CCCCCC"><input type="text" name="tUn" id="tUn" style="margin-left:30px" /></td>
        </tr>
          <tr>
              <td width="138" height="55" bgcolor="#FFFFFF">User Type :</td>
              <td bgcolor="#CCCCCC"><label for="lUt" style="margin-left:30px; height:5px; width: 50px" ></label>
            <select name="lUt" style="width:150px" id="lUt" >
            <option value="Admin">Admin</option>
            <option value="Pharmacist" selected="selected">Pharmacist</option>
            <option value="Manager">Manager</option>
            
        </select></td></tr>
        <tr>
          <td height="57" bgcolor="#FFFFFF"><span style="text-align:left">Password  :</span></td>
          <td width="303" bgcolor="#CCCCCC"><input type="password" name="tPw" id="tPw" style="margin-left:30px" /></td>
        </tr>
        <tr>
          <td height="48" bgcolor="#474045">&nbsp;</td>
          <td align="left" bgcolor="#474045"><input type="submit" name="send" id="send" value="Login" style="height:30px; width:80px;" /> 
        <input type="reset" name="clear" id="clear" value="Clear" style="margin-left:30px; height:30px; width:80px"  /></td>
        </tr>
      </table>
      <label><span style="text-align: left; color: #000;"><br>
        </span></label>
      <span style="text-align:center">
      <label><br />
      </label>
      </span><span style="text-align: left">
      <label></label>
        </span>
    
        
        
        <span style="text-align: center"></span>
      </form>
      
      
      
    </p></td>
  </tr>
  <tr bgcolor="#000000">
    <td height="55" colspan="5" align="left" valign="top" style="color: #FFF; font-size: small;">Copy rights @ CarePharma (Pvt) Ltd 2014.</td>
  </tr>
</table>
</body>
</html>
