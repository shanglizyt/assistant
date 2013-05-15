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
<title>特色推荐</title>
<script type="text/javascript" src="script.js"></script>
<link href="style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
@import "style.css";
<%@include file="style.css"%>
</style>
</head>

<body
	onload="MM_preloadImages('images/daohang10.png','images/daohang1-1.jpg','images/daohang2-1.jpg','images/daohang3-1.jpg')">

	<div align="center">
		<table width="1055" cellpadding="0" cellspacing="5" bgcolor="#FFFFFF">
			<!--DWLayoutTable-->
			<tr>
				<td width="1046" height="172" valign="top"><img
					src="images/sd1_jh_2.png" width="100%" height="170" /></td>
			</tr>
			<tr>
				<td height="112">

					<table width="1048" height="102" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td width="786" height="56">
								<!--导航条-->
								<table cellpadding="0" cellspacing="0">
									<!--DWLayoutTable-->
									<tr>
										<td height="46"><a href="Commen_main"><img
												src="images/daohang1-0.jpg" alt="" name="daohang10"
												width="252" height="46" border="0" id="daohang10" onload="" /></a></td>
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
										<td width="27"></td>
									</tr>
								</table> <!--导航条-->
							</td>
							<td width="262" rowspan="2"><div id="exit" align="center"
									class="out-shadow">
									<div id="touxiang">
										<img src="images/touxiang580.jpg" />
									</div>
									<div id="name">
										<span class="STYLE19">关注健康！关注未来</span>！
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
							<td height="46">
								<!--搜索框-->

								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<!--DWLayoutTable-->
									<tr>
										<td width="249" height="49" align="center" valign="middle"
											class="STYLE31">欢迎咨询！</td>
										<td width="536" align="right" valign="middle">
											<div id="ssk" align="center" class="out-shadow">
												<form action="Commen_sousuo" method="post" name="form1"
													id="form1">
													<input name="keyword" type="text" class="ssk_kuang1"
														value="" size="50" /> &nbsp; <input name="Submit"
														type="submit" class="ssk_kuang1" value="搜索" />
												</form>
											</div>
										</td>
									</tr>
								</table> <!--搜索框-->
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="17" valign="top" bordercolor="#FFFFFF"><hr
						color="#D3FCB8" /></td>
			</tr>
			<tr>
				<td height="464">
					<table>
						<!--DWLayoutTable-->
						<!-- neirong -->
						<tr>
							<td width="759" height="49" valign="top"><div class="title"
									align="left">
									<img src="images/title/ti15.png" width="165" height="43" />
								</div></td>
							<td width="12" rowspan="2" valign="top">
								<!--DWLayoutEmptyCell-->&nbsp;
							</td>
							<td width="248" valign="top"><div class="title"
									align="left">
									<img src="images/title/ti3.png" width="138" height="43" />
								</div></td>
						</tr>

						<tr>
							<td height="407" valign="top">
								<div id="tuijianlb">

								<s:iterator value="dishs">
									<div id="dish">
										<div id="dishpic" class="kuang1">
											<img src="<s:property value="imageurl"/>" width="100%"
												height="100%" />
										</div>
										<div id="dishname">
											<s:property value="name" />
										</div>
									</div>
								</s:iterator>

								</div>
							</td>
							<td align="right" valign="top">
								<div>
								<s:iterator value="dish_top5">
									<fieldset style="width: 240px;" class="kuang1">
										<div id="wrap">
											<div id="column1">
												<a href="Commen_dishdetail?id=<s:property value="id"/>"><img
													src=<s:property value="imageurl"/> width="100" height="80" /></a>
											</div>
											<div id="column2">
												<div>
													<span class="STYLE19"><s:property value="name" /></span>
												</div>
												<div id="kongge"></div>
												<div>
													<span class="STYLE38">得票数</span>(
													<s:property value="votecount" />
													)
												</div>
											</div>
										</div>
									</fieldset>
								</s:iterator>
								</div>
							</td>
						</tr>

						<!-- neirong -->
					</table>
				</td>
			</tr>
			<tr>
				<td height="100" valign="top">
					<p>&nbsp;</p>
					<hr size="1" color="#003300" />
					<p align="center">
						<span class="STYLE3">&nbsp;生命树工作室||联系我们||关于网站||意见反馈||*******</span>
					</p>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
