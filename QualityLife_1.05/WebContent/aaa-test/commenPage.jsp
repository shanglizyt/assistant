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
<title>XXXX</title>
<style type="text/css">
<!--
.STYLE3 {
	color: #666666
}

body {
	background-color: #FFFFEE;
}

.STYLE6 {
	color: #666666;
	font-size: 18px;
}

.STYLE7 {
	color: #000000;
	font-size: 18px;
}

.STYLE11 {
	font-size: 24px;
	font-family: "楷体";
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

	function MM_findObj(n, d) { //v4.01
		var p, i, x;
		if (!d)
			d = document;
		if ((p = n.indexOf("?")) > 0 && parent.frames.length) {
			d = parent.frames[n.substring(p + 1)].document;
			n = n.substring(0, p);
		}
		if (!(x = d[n]) && d.all)
			x = d.all[n];
		for (i = 0; !x && i < d.forms.length; i++)
			x = d.forms[i][n];
		for (i = 0; !x && d.layers && i < d.layers.length; i++)
			x = MM_findObj(n, d.layers[i].document);
		if (!x && d.getElementById)
			x = d.getElementById(n);
		return x;
	}

	function MM_nbGroup(event, grpName) { //v6.0
		var i, img, nbArr, args = MM_nbGroup.arguments;
		if (event == "init" && args.length > 2) {
			if ((img = MM_findObj(args[2])) != null && !img.MM_init) {
				img.MM_init = true;
				img.MM_up = args[3];
				img.MM_dn = img.src;
				if ((nbArr = document[grpName]) == null)
					nbArr = document[grpName] = new Array();
				nbArr[nbArr.length] = img;
				for (i = 4; i < args.length - 1; i += 2)
					if ((img = MM_findObj(args[i])) != null) {
						if (!img.MM_up)
							img.MM_up = img.src;
						img.src = img.MM_dn = args[i + 1];
						nbArr[nbArr.length] = img;
					}
			}
		} else if (event == "over") {
			document.MM_nbOver = nbArr = new Array();
			for (i = 1; i < args.length - 1; i += 3)
				if ((img = MM_findObj(args[i])) != null) {
					if (!img.MM_up)
						img.MM_up = img.src;
					img.src = (img.MM_dn && args[i + 2]) ? args[i + 2]
							: ((args[i + 1]) ? args[i + 1] : img.MM_up);
					nbArr[nbArr.length] = img;
				}
		} else if (event == "out") {
			for (i = 0; i < document.MM_nbOver.length; i++) {
				img = document.MM_nbOver[i];
				img.src = (img.MM_dn) ? img.MM_dn : img.MM_up;
			}
		} else if (event == "down") {
			nbArr = document[grpName];
			if (nbArr)
				for (i = 0; i < nbArr.length; i++) {
					img = nbArr[i];
					img.src = img.MM_up;
					img.MM_dn = 0;
				}
			document[grpName] = nbArr = new Array();
			for (i = 2; i < args.length - 1; i += 2)
				if ((img = MM_findObj(args[i])) != null) {
					if (!img.MM_up)
						img.MM_up = img.src;
					img.src = img.MM_dn = (args[i + 1]) ? args[i + 1]
							: img.MM_up;
					nbArr[nbArr.length] = img;
				}
		}
	}
//-->
</script>
</head>

<body
	onload="MM_preloadImages('images/daohang10.png','images/daohang2-1.jpg','images/daohang3-1.jpg')">

	<div align="center">
		<table width="1057" cellpadding="0" cellspacing="10" bgcolor="#FFFFFF">
			<!--DWLayoutTable-->
			<tr>
				<td height="172" colspan="3" valign="top"><img
					src="images/sd1_jh_2.png" width="1023" height="170" /></td>
				<td width="1"></td>
			</tr>

			<tr>
				<td height="49" colspan="2" valign="top"><table
						cellpadding="0" cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td height="46"><a href="homepage.html"><img
									src="images/daohang1-0.jpg" alt="" name="daohang10" width="252"
									height="46" border="0" id="daohang10" /></a></td>
							<td width="252" valign="top"><a href="javascript:;"
								target="_top"
								onclick="MM_nbGroup('down','group1','daohang20','',1)"
								onmouseover="MM_nbGroup('over','daohang20','images/daohang2-1.jpg','',1)"
								onmouseout="MM_nbGroup('out')"><img name="daohang20"
									src="images/daohang2-0.jpg" border="0" alt="" /></a></td>
							<td width="250" rowspan="2" valign="top"><a
								href="javascript:;" target="_top"
								onClick="MM_nbGroup('down','group1','daohang30','',1)"
								onMouseOver="MM_nbGroup('over','daohang30','images/daohang3-1.jpg','',1)"
								onMouseOut="MM_nbGroup('out')"><img name="daohang30"
									src="images/daohang3-0.jpg" border="0" alt="" /></a></td>
							<td width="5">&nbsp;</td>
						</tr>
						<tr>
							<td height="1"></td>
							<td></td>
							<td></td>
						</tr>

					</table></td>
				<td width="236" rowspan="3" valign="top"><img
					src="images/shusdf_1.jpg" width="240" height="214" />&nbsp; <span
					class="STYLE6"><a href="denglu.html" class="STYLE6">登录</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span
					class="STYLE6"><a href="zhuce.html" class="STYLE6">注册</a></span></td>
				<td></td>
			</tr>
			<tr>
				<td width="221" height="45"><span class="STYLE11"><img
						src="images/yangt.png" width="50" height="35" />XXXX</span></td>
				<td width="539" valign="middle"><form id="form1" name="form1"
						method="post" action="">
						<div align="center" class="STYLE6">
							<input name="textfield" type="text" class="STYLE6" value="" />
							&nbsp;&nbsp;&nbsp; <input name="Submit" type="submit"
								class="STYLE6" value="搜索" />
						</div>
					</form></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="2" rowspan="2" valign="top"><table width="100%"
						border="0" cellpadding="0" cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td width="774" height="557">
								<!-- 内容 -->
								
							</td>
						</tr>
					</table></td>
				<td height="87"></td>
			</tr>
			<tr>
				<td rowspan="2" valign="top"><div align="left">
						<p>
							<img src="images/ti3.png" width="142" height="45" />
						</p>
					</div>
					<p>
						<img src="images/paihangbang.png" width="238" height="546" />
					</p>
					<p>
						<img src="images/paihangbang_1.png" width="238" height="304" />
					</p></td>
				<td height="460"></td>
			</tr>
			<tr>
				<td height="642">&nbsp;</td>
				<td>&nbsp;</td>
				<td></td>
			<tr>
				<td height="111" colspan="3" valign="top"><p>&nbsp;</p>
					<hr size="1" color="#003300" />
					<p align="center">
						<span class="STYLE3">&nbsp;生命树工作室||联系我们||关于网站||意见反馈||*******</span>
					</p></td>
				<td></td>
			</tr>
		</table>
	</div>
</body>
</html>
