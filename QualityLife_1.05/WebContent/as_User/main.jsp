<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>个人主页</title>
<style type="text/css">
#center {
	text-align: center;
}

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

a {
	font-family: 楷体;
	font-size: 24px;
	color: #000000;
}

a:link {
	text-decoration: none;
}

a:visited {
	text-decoration: none;
}

a:hover {
	text-decoration: none;
}

a:active {
	text-decoration: none;
}

.STYLE12 {
	color: #6666666
}

.STYLE14 {
	color: #999900;
	font-size: 14px;
}

.STYLE17 {
	color: #666666;
	font-size: 12px;
}

.STYLE19 {
	color: #333333;
	font-size: 18px;
}

.STYLE28 {
	font-size: 16px;
	color: #333333;
	font-family: "Adobe 仿宋 Std R";
}

.STYLE30 {
	font-size: 20px
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
					src="images/sd1_jh_2.png" width="100%" height="170" /></td>
				<td width="1"></td>
			</tr>

			<tr>
				<td height="49" colspan="2" valign="top"><table cellpadding="0"
						cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td height="46"><a
								href="index!main?id=<s:property value="user.id"/>"><img
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
				<td width="216" align="center" valign="middle" class="STYLE6">
					<s:if test="#session.user==null">
					您还没有<a href="as-commen/login.jsp">登录</a>
					</s:if> 
					<s:else>
						<a href="logout.action?id=<s:property value="user.id"/>">退出登录</a>
						<br>
						<s:if test="user.info_complete==0">
					 	<a href="user!tocompleteinfo?id=<s:property value="user.id" />">完善信息</a>
						</s:if>
					</s:else>
				</td>
				<td></td>
			</tr>
			<tr>
				<td width="228" rowspan="3" valign="top"><div align="left">
						<img src="images/ti1.png" width="145" height="48" />
					</div> <!-- 微博栏 --> <s:include value="weibo.html"></s:include></td>
				<td width="548" height="45" valign="middle"><form action=""
						method="post" name="form1" class="STYLE6" id="form1">
						<div align="center">
							<input name="textfield" type="text" class="STYLE6" value="" />
							&nbsp;&nbsp;&nbsp; <input name="Submit" type="submit"
								class="STYLE6" value="搜索" />
						</div>
					</form></td>
				<td rowspan="2" valign="top"><div align="left">
						<p>
							<img src="images/ti10.png" width="167" height="46" />
						</p>
					</div>
					<p>&nbsp;</p>
					<p>&nbsp;</p></td>
				<td></td>
			</tr>
			<tr>
				<td height="543" valign="top"><table width="100%" border="0"
						cellpadding="0" cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td width="155" height="48" valign="top"><img
								src="images/ti6.png" width="142" height="48" /></td>
							<td width="384" valign="top">
								<!--DWLayoutEmptyCell-->&nbsp;
							</td>
						</tr>
						<tr>
							<td height="495" colspan="2" align="center" valign="middle"><img
								src="images/zhuds.png" width="555" height="490" border="0"
								usemap="#Map" /> <map name="Map" id="Map">
									<area shape="rect" coords="19,158,112,279"
										href="user!dietian?id=<s:property value="user.id" />"
										target="_blank" />
									<area shape="rect" coords="130,13,234,137"
										href="user!dingzhi?id=<s:property value="user.id" />"
										target="_blank" />
									<area shape="rect" coords="314,10,420,136"
										href="user!fenxi?id=<s:property value="user.id" />"
										target="_blank" />
									<area shape="rect" coords="434,154,536,277"
										href="user!kouwei?id=<s:property value="user.id" />"
										target="_blank" />
								</map></td>
						</tr>
					</table></td>
				<td></td>
			</tr>

			<tr>
				<td rowspan="2" valign="top"><div align="left">
						<img src="images/ti12.png" width="164" height="46" />
					</div> <!-- 为您推荐 -->

					<div id="c" style="float: left;">
						<s:iterator value="user.adviceMenu.toArray()">
							<!-- <div id="a" style="float:left; height:160px;width:140px">
							 <div style="float:top; height:160px;width:160px">
							 <img src=<s:property value="imageurl"/> height="140" width="140">
							 </div>
							 <div style="float:bottom; height:160px;width:160px">
								<s:property value="name"/>
							 </div>
							</div> -->
						</s:iterator>
						<div id="a"
							style="float: left; height: 160px; width: 140px; padding: 10px">
							<div style="float: top; height: 160px; width: 160px">
								<img alt="" src="images/food3.jpg" height="140" width="140">
							</div>
							<div style="float: bottom; height: 160px; width: 160px">
								推荐菜式1</div>
						</div>
						<div id="a"
							style="float: left; height: 160px; width: 140px; padding: 10px">
							<div style="float: top; height: 160px; width: 160px">
								<img alt="" src="images/food3.jpg" height="140" width="140">
							</div>
							<div style="float: bottom; height: 160px; width: 160px">
								推荐菜式2</div>
						</div>
						<div id="a"
							style="float: left; height: 160px; width: 140px; padding: 10px">
							<div style="float: top; height: 160px; width: 160px">
								<img alt="" src="images/food3.jpg" height="140" width="140">
							</div>
							<div style="float: bottom; height: 160px; width: 160px">
								推荐菜式3</div>
						</div>
						<div style="clear: both"></div>
						<!--这个层很有用，必须要，否则可能不兼容。-->
					</div></td>
				<td rowspan="3" valign="top">
					<div align="left">
						<img src="images/ti11.png" width="162" height="48" />
					</div> <!-- 饮食追踪 -->
					<p>
						<s:iterator value="user.records.toArray()" end="3">
							<p>
								<s:property value="dish_name" />
							</p>
						</s:iterator>
					</p>
				</td>
				<td height="65"></td>
			</tr>
			<tr>
				<td rowspan="2" valign="top"><div align="left">
						<img src="images/ti13.png" width="188" height="39" />
					</div> <!-- 营养师建议 -->
					<p>测试：最近应该多吃蔬菜</p> <!-- 显示至多三条建议，按日期最近显示 --> <s:if
						test="user.dietianAdvices.size()>3">
						<s:iterator value="user.dietianAdvices.toArray()" end="2">
							<p>
								<s:property value="title" />
							</p>
						</s:iterator>
					</s:if> <s:else>
						<s:iterator value="user.dietianAdvices.toArray()">
							<p>
								<s:property value="title" />
							</p>
						</s:iterator>
					</s:else></td>
				<td height="278"></td>
			</tr>

			<tr>
				<td height="279" valign="top">
					<!-- 食物搭配禁忌，用table显示了，后续需要改进(已改进)--> <!--<s:property value="pageBean_taboo.list.size()"/>-->
					<div align="left">
						<img src="images/ti5.png" width="168" height="51" />
					</div> <s:if test="pageBean_taboo.list.size()==10">
						<div id="jinji1">
							<s:iterator value="pageBean_taboo.list" end="4">
								<p align="left" class="STYLE28">
									<a href="commen!gettaboo?taboo_id=<s:property value="id" />"><s:property
											value="title" /></a>
								</p>
							</s:iterator>
						</div>
						<div id="jinji2">
							<s:iterator value="pageBean_taboo.list" begin="5" end="9">
								<p align="left" class="STYLE28">
									<a href="commen!gettaboo?taboo_id=<s:property value="id" />"><s:property
											value="title" /></a>
								</p>
							</s:iterator>
						</div>
					</s:if> <s:elseif test="pageBean_taboo.list.size()>5">
						<div id="jinji1">
							<s:iterator value="pageBean_taboo.list" end="4">
								<p align="left" class="STYLE28">
									<a href="commen!gettaboo?taboo_id=<s:property value="id" />"><s:property
											value="title" /></a>
								</p>
							</s:iterator>
						</div>
						<div id="jinji2">
							<s:iterator value="pageBean_taboo.list" begin="5">
								<p align="left" class="STYLE28">
									<a href="commen!gettaboo?taboo_id=<s:property value="id" />"><s:property
											value="title" /></a>
								</p>
							</s:iterator>
						</div>
					</s:elseif> <s:elseif test="pageBean_taboo.list.size()>0">
						<div id="jinji1">
							<s:iterator value="pageBean_taboo.list">
								<p align="left" class="STYLE28">
									<a href="commen!gettaboo?taboo_id=<s:property value="id" />"><s:property
											value="title" /></a>
								</p>
							</s:iterator>
						</div>
					</s:elseif> <s:else>
						<center>暂无相关文章</center>
					</s:else>
				</td>
				<td></td>
			</tr>

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
	<s:debug></s:debug>
</body>
</html>