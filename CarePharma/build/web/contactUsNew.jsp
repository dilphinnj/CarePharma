
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
	background-color: #666;
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
<link href="SpryAssets/SpryAccordion.css" rel="stylesheet" type="text/css" />
<!-- TemplateBeginEditable name="head" -->
<!-- TemplateEndEditable -->
<script src="SpryAssets/SpryAccordion.js" type="text/javascript"></script>
</head>



<body bgcolor="#FFFFFF" text="#666666" alink="#666666">

<table width="800" align="center" cellpadding="0" cellspacing="0" class="backg">
  <tr>
    <td height="200" colspan="4" valign="top"><img src="logo_carePharma.png" width="900" height="200" /></td>
  </tr>
  <tr bgcolor="#000000" style="text-align: center; font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif;">
    <td width="183" height="39" valign="top"><a href="home.jsp" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">Home</a></td>
    <td width="284" valign="top"><a href="aboutUs.jsp" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">About Us</a></td>
    <td width="217" valign="top"><a href="contactUsNew.jsp" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">Contact Us</a></td>
    
    <td width="216" valign="top"><a href="userLogin.jsp" style="font-family: 'Palatino Linotype', 'Book Antiqua', Palatino, serif">Login </a></td>
  </tr>
  <tr bgcolor="#FFFF99">
    <td height="400" width="175" align="left" valign="top" bgcolor="#003366"><p style="text-align: left; color: #000;">&nbsp;</p>
      <div id="Accordion1" class="Accordion" tabindex="0">
        <div class="AccordionPanel">
          <div class="AccordionPanelTab">Why We are the Best!</div>
          <div class="AccordionPanelContent">We are one of the leading companies in the country in importing quality drugs...</div>
        </div>
        <div class="AccordionPanel">
          <div class="AccordionPanelTab">Why you want to buy from us?</div>
          <div class="AccordionPanelContent">We guarantee the quality of the products and we are reachable to customers easily through on line and via our contact numbers.</div>
        </div>
        <div class="AccordionPanel">
          <div class="AccordionPanelTab">Got Questions?</div>
          <div class="AccordionPanelContent"> It's easy... Go to Contact us and ask your question... We will reply back soon!</div>
        </div>
      </div>
    <p>&nbsp;</p></td>
   
   
   
   
   
   
   
   
   
   
   <td height="286" colspan="3"><form id="formAddCusQry" name="formAddCusQry" method="post" action="UpdateCustomerQueries">
      <table width="" border="0">
        <tr>
          <td height="80" colspan="3" align="center" bgcolor="#E3E3E3" style="font-weight: bold; font-size: 24px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif; color: #000;">Please Enter Details To Add A Query</td>
        </tr>
        <tr>
          <td width="291" height="80" bgcolor="#FFFFFF" style="color: #000">Enter Name :</td>
          <td width="506" height="20" align="center" bgcolor="#999999"><label for="txtCN2"></label>
            <input name="txtCN" type="text" required="required" id="txtCN2" size="50px" maxlength="30" checked="checked"  /></td>
        </tr>
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="color: #000">Enter Age :<span style="text-align: right"></span></td>
          <td height="80" align="center" bgcolor="#999999"><label for="txtAge"></label>
            <input name="txtAge" type="number" required="required" id="txtAge" min="0" checked="checked" style=" width:200px" /></td>
        </tr>
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="color: #000">Enter Email Address :</td>
          <td height="80" align="center" bgcolor="#999999"><input name="txtEml" type="email" required="required" id="txtEml" size="50px" maxlength="30"  /></td>
        </tr>
        
        <tr>
          <td height="80" bgcolor="#FFFFFF" style="color: #000">Enter Contact No (optional) :</td>
          <td height="80" align="center" bgcolor="#999999">
          <input name="txtTel" type="tel" id="txtTel" size="50px" maxlength="30" style=" width:200px" /></td>
        </tr>
        
        
         <tr>
          <td height="80" bgcolor="#FFFFFF" style="color: #000">How Can We Help You ?</td>
          <td height="80" align="center" bgcolor="#999999"><textarea name="txtQstn" cols="50px" rows="4" required="required" id="txtQstn"></textarea></td>
        </tr>
        
        
        
        
        <tr>
          <td height="60" bgcolor="#46413C" style="text-align: center; font-family: Tahoma, Geneva, sans-serif;">&nbsp;</td>
          <td height="60" align="left" bgcolor="#46413C"><input name="btnAddCust" type="submit" id="btnAddCust" 
          style="width:100px; height:40px; margin-left:50px " value="Ask!"  /></b>
          <input type="reset" name="btnCls" id="btnCls" value="Clear" 
          style="width:100px; height:40px; margin-left:30px " />
          </td>
        </tr>
      </table>
    </form></td>
   
   
   
   
   
   
   
   
   
   
  </tr>
  <tr bgcolor="#000000">
    <td height="55" colspan="5" align="left" valign="top" style="color: #FFF; font-size: small;">Copy rights @ CarePharma (Pvt) Ltd 2014.</td>
  </tr>
</table>
<script type="text/javascript">
var Accordion1 = new Spry.Widget.Accordion("Accordion1");
</script>
</body>
</html>
