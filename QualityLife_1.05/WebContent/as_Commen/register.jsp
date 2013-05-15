 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<base href="<%=basePath %>"/>
<title>Insert title here</title>
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
.STYLE13 {color: #666666; font-size: 18px; }
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
      <td colspan="2" valign="top"><a href="homepage.html" class="STYLE12">返回首页</a></td>
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
      <td height="258">&nbsp;</td>
      <td>&nbsp;</td>
      <td colspan="2" valign="top">
      <form id="form1" name="form1" method="post" action="register">
        <p align="left" class="STYLE13">用户名：
          <input type="text" name="registerInfo.name" />
  </p>
          <p align="left" class="STYLE13">密&nbsp; 码：
            <input type="password" name="registerInfo.password" />
          </p>
          <p align="left" class="STYLE13">确认密码：
            <input type="text" name="password2" />
          </p>
          <p align="left" class="STYLE13">性别：
            &nbsp; 男
            <input name="registerInfo.sex" type="radio" value="male" checked="checked" />
            女
            <input type="radio" name="rInfo.sex" value="female" />
          </p>
          <p align="left" class="STYLE13">年龄：
            <input name="registerInfo.age" type="text">
          </p>
         
          <p align="left" class="STYLE13">
             &nbsp;
             &nbsp; 
             <input type="submit" name="Submit" value="提交" />
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
           <input type="reset" name="Submit2" value="重置" />
          </p>
      </form></td>
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