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
<title>login</title>
<style type="text/css">
<!--
.STYLE2 {color: #666666}
a:link {
	color: #666666;
	text-decoration: none;
}
a:visited {
	color: #666666;
	text-decoration: none;
}
a:hover {
	color: #666666;
	text-decoration: none;
}
body {
	background-color: #BCC89F;
}
a:active {
	text-decoration: none;
}
.STYLE9 {color: #666666; font-family: "楷体"; }
.STYLE9 {
	text-decoration: blink;
}
.STYLE10 {
	font-size: 18px;
	font-family: "微软雅黑";
	color: #333333;
}
.STYLE11 {text-decoration: blink; color: #666666; font-family: "楷体"; }
.STYLE12 {text-decoration: blink; color: #666666; font-family: "楷体"; font-size: 18px; }
-->
</style>
</head>

<body>
<div align="center">
  <table width="1000" border="0"  cellpadding="0" cellspacing="0" background="images/c3_fw554_3.jpg">
    <!--DWLayoutTable-->
    <tr>
      <td width="54" height="34">&nbsp;</td>
      <td width="24">&nbsp;</td>
      <td width="66"></td>
      <td width="418"></td>
      <td width="89">&nbsp;</td>
      <td width="65">&nbsp;</td>
      <td width="21">&nbsp;</td>
      <td width="220">&nbsp;</td>
      <td width="43">&nbsp;</td>
    </tr>
    
    <tr>
      <td height="17">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td rowspan="3" valign="top"><img src="images/luckhoosh.png" width="65" height="78" /></td>
      <td>&nbsp;</td>
      <td rowspan="3" valign="middle"><img src="images/named.png" width="220" height="78" /></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="28">&nbsp;</td>
      <td colspan="2" valign="top"><a href="Commen_main" class="STYLE12">返回首页</a></td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="39">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    
    <tr>
      <td height="80"></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td>&nbsp;</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    
    <tr>
      <td height="134">&nbsp;</td>
      <td>&nbsp;</td>
      <td colspan="2">&nbsp;
        <div align="left" class="STYLE9">关于生命树（Tree of Life）： </div>        <p align="left" class="STYLE9">&nbsp; 是《圣经》中记载的一棵树，在创世纪中出现在伊甸园中，<br>
          其果实能使人得到永远不朽的生命。在创世纪中，记载狡猾<br>
          的蛇引诱无知的夏娃吃分辨善恶树的果子，说她将会变得和<br>
          神一样聪明。在吃了善恶知识树的果子以后，圣经中记载亚<br>
          当和夏娃被赶逐离开伊甸园，并安设基路伯把守伊甸园的入<br>
          口，以阻止人类吃到生命树。</p></td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="226">&nbsp;</td>
      <td>&nbsp;</td>
      <td colspan="2" valign="top"><form id="form1" name="form1" method="post" action="Commen_login">
        <p class="STYLE10" >用户名： &nbsp;&nbsp; 
          <input name="userName" type="text" class="STYLE10" value="" />
            <span class="STYLE11"><a href="as_Commen/register.jsp" class="STYLE9">注册账号</a></span></p>
          <p class="STYLE10" >&nbsp;</p>
          <p class="STYLE10">密&nbsp;&nbsp;&nbsp;码：&nbsp; &nbsp; 
            <input name="password" type="password" class="STYLE10" />
            <span class="STYLE9"><a href="javascript:">找回密码</a></span></p>
          <p class="STYLE10">&nbsp;   </p>
          <p class="STYLE10">         
  <input name="Submit" type="submit" class="STYLE10" value="登录" />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            <input name="Submit2" type="reset" class="STYLE10" value="重置" />
         &nbsp;&nbsp;                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE9">营养师登录</span>
         <input type="checkbox" name="option" value="dietian" />
          </p>
      </form></td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="32">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    
    
    <tr>
      <td height="30" colspan="9" valign="top">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <div align="center"><span class="STYLE2">&nbsp;版权所有：生命树工作室||联系我们||关于网站||意见反馈||*******</span></div></td>
    </tr>
    <tr>
      <td height="46">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>
</body>
</html>