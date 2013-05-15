<%@ page language="java" contentType="text/html; charset=gb2312"
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
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>营养师</title>
<style type="text/css">
<!--
body {
	background-color: #FFFFEE;
}

.STYLE7 {
	color: #FFFFFF
}

.STYLE9 {
	color: #FFFFFF;
	font-family: "楷体";
}

.STYLE9 {
	text-decoration: blink;
}

.STYLE10 {
	color: #666666;
	font-family: "楷体";
}

.STYLE10 {
	text-decoration: blink;
}

.STYLE12 {
	color: #333333;
	font-family: "楷体";
	font-size: 18px;
	text-decoration: blink;
}
-->
</style>
<script type="text/JavaScript">
<!--
	function MM_preloadImages() { //v3.0
		var d = document;
		if (d.images) {
			if (!d.MM_p)
				d.MM_p = new Array();
			var i, j = d.MM_p.length, a = MM_preloadImages.arguments;
			for (i = 0; i < a.length; i++)
				if (a[i].indexOf("#") != 0) {
					d.MM_p[j] = new Image;
					d.MM_p[j++].src = a[i];
				}
		}
	}
//-->
</script>
</head>

<body onLoad="MM_preloadImages('images/daohang10.png')">

	<div align="center">
		<table width="1030" cellpadding="0" cellspacing="10" bgcolor="#FFFFFF"
			background="images/yinyangs_3.jpg">
			<!--DWLayoutTable-->
			<tr>
				<td width="4" height="99">&nbsp;</td>
				<td width="243">&nbsp;</td>
				<td colspan="4" valign="top">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<img src="images/luckhoosh.png" width="91" height="97" />&nbsp;&nbsp;
					<img src="images/named.png" width="228" height="86" />
				</td>
			</tr>
			<tr>
				<td height="45">&nbsp;</td>
				<td>&nbsp;</td>
				<td colspan="4" rowspan="2" valign="top"><img
					src="images/dadj.png" width="665" height="103" /></td>
			</tr>
			<tr>
				<td height="48">&nbsp;</td>
				<td align="center" valign="top"><a href="personalpage.html"
					class="STYLE12"><u>返回</u></a></td>
			</tr>

			<tr>
				<td height="9"></td>
				<td></td>
				<td width="161"></td>
				<td width="159"></td>
				<td width="361"></td>
				<td width="30"></td>
			</tr>
			<tr>
				<td height="49">&nbsp;</td>
				<td align="left" valign="middle"><img src="images/tii4.png"
					width="121" height="45" /></td>
				<td>&nbsp;</td>
				<td align="left" valign="top"><img src="images/tii5.png"
					width="159" height="42" /></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr align="left">
			
				<td height="326">&nbsp;</td>
				<td valign="top" align="right">
				<!-- <img src="images/yys35.jpg" width="225" height="320" /> -->
				<img alt="" src="images/yys36.png" width="250" height="120">
				<img alt="" src="images/yys36.png" width="250" height="120">
					</td>
				<td>&nbsp;</td>
				<td colspan="3" valign="top">
                营养师建议：<br>
					<s:iterator value="dietianAdvices">
						<li><s:property value="title" /></li>
					</s:iterator>
					<br>
                    在线提问：<br>
					<form id="form1" name="form1" method="post" action="user!question?id=<s:property value="user.id" />">
						<textarea name="wenti" cols="60" rows="4"></textarea>
						<input type="submit" value="提交" >
					</form></td>
			</tr>
			<tr>
				<td height="38">&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td height="60" colspan="6" align="center" valign="bottom"><span
					class="STYLE7">&nbsp;版权所有：生命树工作室||联系我们||关于网站||意见反馈||*******</span></td>
			</tr>
			<tr>
				<td height="14">&nbsp;</td>
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
