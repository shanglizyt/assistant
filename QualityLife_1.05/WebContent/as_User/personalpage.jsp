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
<title>公共主页</title>
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
	onload="MM_preloadImages('images/daohang10.png','images/daohang1-1.jpg','images/daohang2-1.jpg','images/daohang3-1.jpg')">

	<div align="center">
		<table width="1057" cellpadding="0" cellspacing="10" bgcolor="#FFFFFF">
			<!--DWLayoutTable-->
			<tr>
				<td height="172" colspan="7" valign="top"><img
					src="images/sd1_jh_2.png" width="1023" height="170" /></td>
				<td width="1"></td>
			</tr>

			<tr>
				<td height="49" colspan="6" valign="top"><table
						cellpadding="0" cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td height="46"><a href="Index (2).html" target="_top"
								onclick="MM_nbGroup('down','group1','daohang10','',1)"
								onmouseover="MM_nbGroup('over','daohang10','images/daohang1-1.jpg','',1)"
								onmouseout="MM_nbGroup('out')"><img
									src="images/daohang1-0.jpg" alt="" name="daohang10" width="252"
									height="46" border="0" id="daohang10" onload="" /></a></td>
							<td width="252" valign="top"><a href="javascript:;"
								target="_top"
								onclick="MM_nbGroup('down','group1','daohang20','',1)"
								onmouseover="MM_nbGroup('over','daohang20','images/daohang2-1.jpg','',1)"
								onmouseout="MM_nbGroup('out')"><img name="daohang20"
									src="images/daohang2-0.jpg" border="0" alt="" onload="" /></a></td>
							<td width="250" rowspan="2" valign="top"><a
								href="javascript:;" target="_top"
								onClick="MM_nbGroup('down','group1','daohang30','',1)"
								onMouseOver="MM_nbGroup('over','daohang30','images/daohang3-1.jpg','',1)"
								onMouseOut="MM_nbGroup('out')"><img name="daohang30"
									src="images/daohang3-0.jpg" border="0" alt="" onLoad="" /></a></td>
							<td width="5">&nbsp;</td>
						</tr>
						<tr>
							<td height="1"></td>
							<td></td>
							<td></td>
						</tr>

					</table></td>
				<td width="238" rowspan="3" valign="top"><p>
						<img src="images/shusdf_1.jpg" width="240" height="214" />&nbsp;&nbsp;<span
							class="STYLE6"><a href="denglu.html" class="STYLE3">登录</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span
							class="STYLE12"><a href="zhuce.html" class="STYLE3">注册</a></span>
					</p></td>
				<td></td>
			</tr>
			<tr>
				<td width="191" rowspan="4" valign="top"><div align="left">
						<img src="images/ti1.png" width="145" height="48" />
					</div>
					<p align="center">&nbsp;</p></td>
				<td width="15" rowspan="4" valign="top"><p>&nbsp;</p>
					<p>&nbsp;</p>
					<p>
						<img src="images/sline.png" width="4" height="670" />
					</p>
					<p>&nbsp;</p></td>
				<td height="45" colspan="4" valign="middle"><form action="commen!sousuo"
						method="post" name="form1" class="STYLE6" id="form1">
						<div align="center" class="STYLE6">
							<input name="textfield" type="text" class="STYLE6" value=""
								size="40" /> &nbsp;&nbsp;&nbsp; <input name="Submit"
								type="submit" class="STYLE6" value="搜索" />
						</div>
					</form></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="4" rowspan="2" valign="top"><table width="100%"
						border="0" cellpadding="0" cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td height="48" colspan="6" valign="top"><img
								src="images/ti6.png" width="142" height="48" /><img
								src="images/line.png" width="380" height="11" /></td>
						</tr>
						<tr>
							<td width="64" height="26">&nbsp;</td>
							<td width="152">&nbsp;</td>
							<td width="133">&nbsp;</td>
							<td width="132">&nbsp;</td>
							<td width="45">&nbsp;</td>
							<td width="19" rowspan="7" align="right" valign="top"><img
								src="images/sline.png" width="4" height="499" /></td>
						</tr>


						<tr>
							<td height="126">&nbsp;</td>
							<td valign="top"><a href="changshi.html"><img
									src="images/appl_0.png" width="129" height="126" border="0" /></a></td>
							<td>&nbsp;</td>
							<td valign="bottom"><a href="dietitian.html"><img
									src="images/li.png" width="132" height="115" border="0" /></a></td>
							<td>&nbsp;</td>
						</tr>

						<tr>
							<td height="41"></td>
							<td valign="middle" class="STYLE7"><div align="center"
									class="STYLE30">
									<a href="changshi.html" class="STYLE30">健康常识</a>
								</div></td>
							<td></td>
							<td align="center" valign="middle" class="STYLE30"><div
									align="center">
									<a href="dietitian.html" class="STYLE30">营养师</a>
								</div></td>
							<td></td>
						</tr>
						<tr>
							<td height="60"></td>
							<td>&nbsp;</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td height="145"></td>
							<td align="center" valign="middle"><a href="tuijian.html"><img
									src="images/yangt.png" width="146" height="115" border="0" /></a></td>
							<td></td>
							<td align="center" valign="middle"><a href="zhiliao.html"><img
									src="images/caomei.png" width="115" height="145" border="0" /></a></td>
							<td></td>
						</tr>

						<tr>
							<td height="48"></td>
							<td align="center" valign="middle" class="STYLE30"><div
									align="center">
									<a href="tuijian.html" class="STYLE30">特色推荐</a>
								</div></td>
							<td></td>
							<td valign="middle"><div align="center" class="STYLE30">
									<a href="zhiliao.html" class="STYLE30">食物治疗</a>
								</div></td>
							<td></td>
						</tr>
						<tr>
							<td height="63"></td>
							<td>&nbsp;</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>







					</table></td>
				<td height="124"></td>
			</tr>
			<tr>
				<td rowspan="8" valign="top"><div align="left">
						<p>
							<img src="images/ti3.png" width="142" height="45" />
						</p>
					</div>
					<p>
						<img src="images/paihangbang.png" width="238" height="546" />
					</p>
					<p>&nbsp;</p></td>
				<td height="423"></td>
			</tr>


			<tr>
				<td colspan="3" rowspan="4" valign="top"><div align="left">
						<img src="images/ti4.png" width="165" height="46" /><img
							src="images/line.png" width="358" height="11" />
					</div>
					<p align="center">
						<img src="images/meirituijian.jpg" width="526" height="277" />
					</p></td>
				<td width="12" rowspan="7" valign="bottom"><img
					src="images/sline.png" width="4" height="773" /></td>
				<td height="144"></td>
			</tr>



			<tr>
				<td height="54" colspan="2" valign="top"><img
					src="images/ti2.png" width="140" height="45" /></td>
				<td></td>
			</tr>
			<tr>
				<td height="22" colspan="2" valign="middle" bgcolor="#CCCCCC"
					class="STYLE3">最新留言</td>
				<td></td>
			</tr>
			<tr>
				<td colspan="2" rowspan="3" align="center" valign="middle"
					background="images/kuangk.png" class="STYLE14" id="form2"><form
						action="" method="post" name="form2">
						<p align="left" class="STYLE14">
							&nbsp;用户名：<span class="STYLE28">留言内容…</span><span class="STYLE17">&lt;10:00&gt;</span></span>
						</p>
						<p align="left" class="STYLE14">
							&nbsp;@@@：<span class="STYLE28">留言内容…&lt;</span><span
								class="STYLE17">10:00&gt;</span></span>
						</p>
						<p align="left" class="STYLE14">
							&nbsp;###：<span class="STYLE28">留言内容… &lt;<span
								class="STYLE17">10:00&gt;</span></span>
						</p>
						<p align="left" class="STYLE14">
							&nbsp;***：<span class="STYLE28">留言内容… <span
								class="STYLE17">&lt;10:00&gt;</span></span>
						</p>
						<p align="left" class="STYLE14">&nbsp;&amp;&amp;&amp;：</p>
						<p align="left" class="STYLE14">&nbsp;%%%%%：</p>
						<p align="left" class="STYLE14">&nbsp;………：</p>
						<p align="left" class="STYLE14">&nbsp;！！！:</p>
					</form></td>
				<td height="182"></td>
			</tr>

			<tr>
				<td height="54" colspan="3" valign="top"><p>
						<img src="images/ti5.png" width="164" height="51" /><img
							src="images/line.png" width="342" height="12" />
					</p></td>
				<td></td>
			</tr>
			<tr>
				<td width="246" rowspan="2" valign="top"><span class="STYLE19">常见食物搭配的禁忌
				</span>
					<p align="left" class="STYLE28">&nbsp; &nbsp;黄瓜、西红柿忌同吃</p>
					<p align="left" class="STYLE28">&nbsp; &nbsp;海鲜与啤酒易诱发痛风</p>
					<p align="left" class="STYLE28">&nbsp; &nbsp;菠菜与豆腐易诱发结石症</p>
					<p align="left" class="STYLE28">&nbsp; &nbsp;萝卜与橘子易诱发甲状腺肿大</p>
					<p align="left" class="STYLE28">&nbsp;&nbsp;鸡蛋与豆浆降低蛋白质吸收</p>
					<p align="left" class="STYLE28">&nbsp;&nbsp;牛奶与巧克力易发生腹泻</p></td>
				<td width="13" rowspan="2" valign="top"><img
					src="images/sline.png" width="4" height="268" /></td>
				<td width="245" rowspan="2" valign="top"><span class="STYLE19">常见食物搭配的禁忌
				</span>
					<p align="left" class="STYLE28">&nbsp; &nbsp;黄瓜、西红柿忌同吃</p>
					<p align="left" class="STYLE28">&nbsp; &nbsp;海鲜与啤酒易诱发痛风</p>
					<p align="left" class="STYLE28">&nbsp; &nbsp;菠菜与豆腐易诱发结石症</p>
					<p align="left" class="STYLE28">&nbsp; &nbsp;萝卜与橘子易诱发甲状腺肿大</p>
					<p align="left" class="STYLE28">&nbsp;&nbsp;鸡蛋与豆浆降低蛋白质吸收</p>
					<p align="left" class="STYLE28">&nbsp;&nbsp;牛奶与巧克力易发生腹泻</p></td>
				<td height="16"></td>
			</tr>
			<tr>
				<td height="242" colspan="2" valign="top"><form id="form3"
						name="form3" method="post" action="">
						<p>
							<textarea name="textarea" cols="27" rows="10" class="STYLE14">留个言吧</textarea>
						</p>
						<p>
							&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
								type="submit" name="Submit2" value="发表" />
						</p>
					</form></td>
				<td></td>
			</tr>







			<tr>
				<td height="111" colspan="7" valign="top"><p>&nbsp;</p>
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