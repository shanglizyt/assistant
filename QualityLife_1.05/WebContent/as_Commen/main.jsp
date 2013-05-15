<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<base href="<%=basePath%>" />
<title>公共主页</title>
<style type="text/css" ><!--<%@ include file="style.css"%>--></style>
<script type="text/javascript" src="as_Commen/script.js"></script>
</head>

<body
	onload="MM_preloadImages('images/daohang10.png','images/daohang1-1.jpg','images/daohang2-1.jpg','images/daohang3-1.jpg')">

	<div align="center">
		<table width="1055" height="1600" cellpadding="0" cellspacing="5"
			bgcolor="#FFFFFF">
			<!--DWLayoutTable-->
			<tr>
				<td height="172" colspan="8" valign="top"><div id="head"
						align="center">
						<img src="images/sd1_jh_2.png" width="100%" height="170" />
					</div></td>
			</tr>

			<tr>
				<td height="49" colspan="6" valign="top"><table
						cellpadding="0" cellspacing="0" align="left">
						<!--DWLayoutTable-->
						<tr>
							<td height="46"><a href="Commen_main" target="_top"
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
							<td width="16">&nbsp;</td>
						</tr>
						<tr>
							<td height="1"></td>
							<td></td>
							<td></td>
						</tr>

					</table></td>
				<td colspan="2" rowspan="2" align="right" valign="middle"><div
						id="exit" align="center" class="out-shadow">
						<div id="touxiang">
						<s:if test="#session.user==null">
							<img src="images/touxiang580.jpg" width="80" height="80" />
					  	</s:if>
						<s:else>
							<img  src="<s:property value="user.imageurl"/>" width="80" height="80" />
						</s:else>
						</div>
						<div id="name">
							<span class="STYLE19">
						关注健康！关注未来</span>！
						</div>
						<s:if test="#session.user==null">
							<div id="denglu">
								<a href="as_Commen/login.jsp" class="STYLE31">登录</a>
							</div>
							<div id="denglu">
								<a href="as_Commen/register.jsp" class="STYLE31">注册</a>
							</div>
						</s:if>
						<s:else>
							<div id="denglu">
								<a href="User_main?id=<s:property value="user.id" />">个人中心</a>
							</div>
						</s:else>
					</div></td>
			</tr>
			<tr>
				<td width="216" rowspan="3" valign="top"><div id="weibom"
						class="title" align="left">
						<img src="images/title/ti1.png" width="138" height="42" />
					</div>
					<div>
						<iframe id="sina_widget_1852491143"
							style="width: 100%; height: 500px;" frameborder="0"
							scrolling="no"
							src="http://v.t.sina.com.cn/widget/widget_blog.php?uid=1852491143&height=500&skin=wd_01&showpic=1"></iframe>
					</div></td>
				<td height="54" colspan="5" align="center" valign="middle"><div
						id="ssk" align="center" class="out-shadow">
						<form action="Commen_sousuo" method="post" name="form1" class="STYLE6"
							id="form1">
							<input name="textfield" type="text" class="STYLE6" value=""
								size="40" /> &nbsp; <input name="Submit" type="submit"
								class="STYLE6" value="搜索" />
						</form>
					</div></td>
			</tr>
			<tr>
				<td height="546" colspan="5" valign="bottom"><div id="tree"
						class="title">
						<img src="images/title/ti6.png" width="136" height="42" />
					</div>
					<div id="treeball">
						<img src="images/treeball_2.png" width="555" height="490"
							border="0" usemap="#Map" />
					</div></td>
				<td width="5">&nbsp;</td>
				<td width="249" rowspan="4" valign="top"><div id="paihang"
						align="left" class="title">
						<img src="images/title/ti3.png" width="138" height="38" />
					</div>
					<s:iterator value="dish_top5">
					<fieldset style="width: 240px;" class="kuang">
						<div id="wrap">
							<div id="column1">
								<a href="Commen_dishdetail?id=<s:property value="id"/>"><img src=<s:property value="imageurl"/> width="100" height="80" /></a>
							</div>
							<div id="column2">
								<div>
									<span class="STYLE19"><s:property value="name"/></span>
								</div>
								<div id="kongge"></div>
								<div>
									<span class="STYLE38">得票数</span>(<s:property value="votecount"/>)
								</div>
							</div>
						</div>
					</fieldset>
					</s:iterator>
					</td>
			</tr>

			<tr>
				<td width="234" height="1"></td>
				<td width="5"></td>
				<td width="283"></td>
				<td width="6"></td>
				<td width="3"></td>
				<td></td>
			</tr>

			<tr>
				<td height="54" colspan="7" valign="top"><div align="left"
						class="title">
						<img src="images/title/ti4.png" width="162" height="40" />
					</div></td>
			</tr>
			<tr>
				<td height="147" colspan="7" valign="top"><div id=demo
						style="OVERFLOW: hidden; WIDTH: 790px; HEIGHT: 147px">
						<table cellspacing=0 cellpadding=0 border=0>
							<tbody>
								<tr>
									<td id=demo1><table cellspacing=0 cellpadding=5>
											<tbody>
												<tr>
												<s:iterator value="dish_to_display">
													<td valign=center align=middle><a href="Commen_dishdetail?id=<s:property value="id"/>"><img src="<s:property value="imageurl"/>" width="190" height="140" /></a></td>
												</s:iterator>
												</tr>
											</tbody>
										</table></td>
									<td id=demo2></td>
								</tr>
							</tbody>
						</table>
					</div></td>
			</tr>
			<tr>
				<td height="0"></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td height="54" colspan="2" valign="bottom"><div align="left"
						class="title">
						<img src="images/title/ti2.png" width="143" height="46" />
					</div></td>
				<td>&nbsp;</td>
				<td colspan="5" valign="bottom"><div align="left"
						class="title">
						<img src="images/title/ti5.png" width="164" height="45" />
					</div></td>
			</tr>


			<tr>
				<td height="386" colspan="2" valign="top">
					<div id="jianyi">
						<!--留言板开始-->
						<s:iterator value="pageBean_liuyan.list" var="ly">
							<fieldset id="perblog" style="width: 450px" class="kuang">
								<legend align="left">
									<img src="images/HeadPortrait/touxiang1.jpg" width="23"
										height="23" /><span class="STYLE38"><s:property
											value="#ly.userName" /></span>
								</legend>
								<span class="STYLE28" style="font size: 12px"><s:property
										value="#ly.content" /></span>
							</fieldset>
						</s:iterator>
						<!--留言板结束-->
					</div>
					<div id="liuyannr" align="center">
						<form id="form3" name="form3" method="post" action="Commen_liuyan">
							<input name="id" type="hidden" value="0" />
							<p>
								<textarea name="liuyan_content" cols="57" rows="5"></textarea>
							</p>
							<input type="submit" name="Submit2" value="发表" />
							<s:fielderror key="liuyan" />
						</form>
					</div>
				</td>
				<td>&nbsp;</td>
				<td colspan="5" valign="top"><div id="jingji1">
						<span class="STYLE40">常见食物搭配的禁忌 </span>
						<ul type="disc">
							<s:iterator value="pageBean_taboo.list">
								<li><p align="left" class="STYLE28">
										<s:property value="title" />
									</p></li>
							</s:iterator>
						</ul>
					</div></td>
			</tr>

			<SCRIPT>
				var speed = 20

				demo2.innerHTML = demo1.innerHTML

				function Marquee() {

					if (demo2.offsetWidth - demo.scrollLeft <= 0)

						demo.scrollLeft -= demo1.offsetWidth

					else {

						demo.scrollLeft++;
					}

				}

				var MyMar = setInterval(Marquee, speed);

				demo.onmouseover = function() {
					clearInterval(MyMar);
				};

				demo.onmouseout = function() {
					MyMar = setInterval(Marquee, speed);
				};
			</SCRIPT>
			<tr>
				<td height="117" colspan="8" valign="top"><p>&nbsp;</p>
					<hr size="1" color="#003300" />
					<p align="center">
						<span class="STYLE3">&nbsp;生命树工作室||联系我们||关于网站||意见反馈||*******</span>
					</p></td>
			</tr>
		</table>
	</div>
	<map name="Map" id="Map">
		<s:if test="#userName==null">
			<area shape="rect" coords="26,152,110,278" href="as_Commen/login.jsp" />
		</s:if>
		<s:else>
			<area shape="rect" coords="26,152,110,278"
				href="user!dietian?id=<s:property value="user.id" />" />
		</s:else>
		<area shape="rect" coords="131,10,238,142" href="Commen_changshilist" />
		<area shape="rect" coords="315,9,425,142" href="Commen_tuijianlist" />
		<area shape="rect" coords="438,156,544,276" href="Commen_zhiliaolist" />
	</map>
<s:debug></s:debug>
</body>
</html>
