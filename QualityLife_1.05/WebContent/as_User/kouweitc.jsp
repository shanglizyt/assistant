<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>口味套餐</title>
<style type="text/css">
<!--
body {
	background-color: #FFFFEE;
}
.STYLE7 {color: #FFFFFF}
.STYLE10 {
	color: #333333;
	font-family: "楷体";
	font-size: 18px;
}
.STYLE10 {	text-decoration: blink;
}
.STYLE12 {color: #333333; font-family: "楷体"; font-size: 18px; text-decoration: blink;}
-->
</style>
<script type="text/JavaScript">
<!--


function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}
//-->
</script>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body onLoad="MM_preloadImages('images/daohang10.png')">

<div align="center">
  <table width="1030"  cellpadding="0" cellspacing="10"  bgcolor="#FFFFFF" background="images/tesedz.jpg" >
    <!--DWLayoutTable-->
    <tr>
      <td width="77" height="99" >&nbsp;</td>
      <td width="161" >&nbsp;</td>
      <td width="14" >&nbsp;</td>
      <td width="713" valign="top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img src="images/luckhoosh.png" width="91" height="97" />&nbsp;&nbsp; <img src="images/named.png" width="228" height="86" /></td>
    </tr>
    <tr>
      <td height="53" >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
      <td rowspan="2" valign="top" ><img src="images/dadj.png" width="665" height="103" /></td>
    </tr>
    <tr>
      <td height="40" >&nbsp;</td>
      <td valign="top" class="STYLE10" ><a href="personalpage.html" class="STYLE12"><u>返回</u></a></td>
      <td >&nbsp;</td>
    </tr>
    
    <tr>
      <td height="36" >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
    </tr>
    <tr>
      <td height="49" >&nbsp;</td>
      <td align="left" ><img src="images/tii3.png" width="154" height="42" /></td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
    </tr>
    <tr>
      <td height="347" >&nbsp;</td>
      <td colspan="3" valign="top">
      <s:iterator value="dishs"/>
      <div id="taocan1"> 
      <div id="taocan-img">
      <a href="commen!dishdetail?dish_id=<s:property value="id"/>">
      <img src="<s:property value="imageurl"/>" />
      </a>
      </div>
      <s:property value="name"/>
      </div>
      </td>
    </tr>
    
    <tr>
      <td height="60" colspan="4" align="center" valign="bottom" ><span class="STYLE7">&nbsp;版权所有：生命树工作室||联系我们||关于网站||意见反馈||*******</span></td>
    </tr>
    <tr>
      <td height="14" >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
    </tr>
  </table>
</div>
</body>
</html>