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
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>生命树首页</title>
<style type="text/css">
<!--
.STYLE2 {
	color: #666666
}

.STYLE7 {
	font-family: "Adobe 仿宋 Std R";
	font-weight: bold;
	font-size: 18px;
	color: #333333;
}

a:link {
	color: #333333;
	text-decoration: none;
}

a {
	font-weight: bold;
}

a:visited {
	color: #333333;
	text-decoration: none;
}

a:hover {
	color: #333333;
	text-decoration: none;
}

#all table {
	background-image: url(images/c3_fw554_3.jpg);
	background-repeat: no-repeat;
	background-position: center center;
}

body {
	background-color: #BCC89F;
}

a:active {
	text-decoration: none;
}

.STYLE8 {
	font-family: "楷体"
}

.STYLE9 {
	color: #666666;
	font-family: "楷体";
}

.STYLE9 {
	text-decoration: blink;
}
-->
</style>
</head>

<body>
	<div id="all" align="center">
		<table width="1000" border="0" cellpadding="0" cellspacing="0">
			<!--DWLayoutTable-->
			<tr>
				<td width="78" height="34">&nbsp;</td>
				<td width="97"></td>
				<td width="92"></td>
				<td width="100"></td>
				<td width="95"></td>
				<td width="100"></td>
				<td width="89">&nbsp;</td>
				<td width="65">&nbsp;</td>
				<td width="21">&nbsp;</td>
				<td width="220">&nbsp;</td>
				<td width="43">&nbsp;</td>
			</tr>

			<tr>
				<td height="84"></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td>&nbsp;</td>
				<td valign="top"><div align="center">
						<img src="images/luckhoosh.png" width="65" height="78" />
					</div></td>
				<td>&nbsp;</td>
				<td valign="middle"><div align="center">
						<img src="images/named.png" width="220" height="78" />
					</div></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td height="80"></td>
				<td></td>
				<td></td>
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
				<td colspan="5"><div>
						&nbsp;
						<div align="left" class="STYLE9">关于生命树（Tree of Life）：</div>
						<div>
							<p align="left" class="STYLE9">
								&nbsp; 是《圣经》中记载的一棵树，在创世纪中出现在伊甸园中，<br>
								其果实能使人得到永远不朽的生命。在创世纪中，记载狡猾<br> 的蛇引诱无知的夏娃吃分辨善恶树的果子，说她将会变得和<br>
								神一样聪明。在吃了善恶知识树的果子以后，圣经中记载亚<br> 当和夏娃被赶逐离开伊甸园，并安设基路伯把守伊甸园的入<br>
								口，以阻止人类吃到生命树。
							</p>
						</div>
					</div></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td height="24">&nbsp;</td>
				<td rowspan="3" valign="top"><div align="center">
						<a href="Commen_main" target="_blank"><img
							src="images/indexti1.png" width="95" height="102" border="0" /></a>
					</div></td>
				<td>&nbsp;</td>
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
				<td height="24">&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td rowspan="3" valign="top"><div align="center">
						<a href="dietitian.html" target="_blank"><img
							src="images/indexti3.png" width="98" height="98" border="0" /></a>
					</div></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td height="54">&nbsp;</td>
				<td>&nbsp;</td>
				<td rowspan="4" valign="top"><div align="center">
						<a href="personalpage.html" target="_blank"><img
							src="images/indexti2.png" width="98" height="97" border="0" /></a>
					</div></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>


			<tr>
				<td height="20"></td>
				<td rowspan="2" valign="top" class="STYLE7"><div align="center">
						<a href="Commen_main" target="_blank">公共主页</a>
					</div></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td height="4"></td>
				<td></td>
				<td></td>
				<td rowspan="2" valign="top" class="STYLE7"><div align="center">
						<a href="dietitian.html" target="_blank">营养师</a>
					</div></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td height="19"></td>
				<td>&nbsp;</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>

			<tr>
				<td height="24"></td>
				<td></td>
				<td></td>
				<td valign="top" class="STYLE7"><div align="center">
						<a href="personalpage.html" target="_blank">我的生命树</a>
					</div></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td height="89"></td>
				<td></td>
				<td></td>
				<td>&nbsp;</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>

			<tr>
				<td height="30" colspan="11" valign="top">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<div align="center">
						<span class="STYLE2">&nbsp;版权所有：生命树工作室||联系我们||关于网站||意见反馈||*******</span>
					</div>
				</td>
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
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</div>
</body>
</html>
