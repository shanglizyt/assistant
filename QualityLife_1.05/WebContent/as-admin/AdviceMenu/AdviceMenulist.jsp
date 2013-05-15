<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>adviceMenu_list</title>
<link href="style.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
#imglist {
	padding: 5px;
	float: left;
	height: 70px;
	width: 70px;
}
-->
</style>
</head>

<body>
	<table width="658" border="1" cellpadding="1" cellspacing="0">
		<tr>
			<td width="49" align="center">序号</td>
			<td width="146" align="center">菜品名</td>
			<td width="163" align="center">编辑</td>
			<td width="282" align="center">图片</td>
		</tr>
		<s:iterator value="adviceMenus" var="u">
			<tr height="80">
				<td><s:property value="#u.id" /></td>
				<td><s:property value="#u.name" /></td>
				<td>
				<a href=admin/AdviceMenuManagerAction!delete?id=<s:property value="#u.id"/>>删除</a>|
				<a href=admin/AdviceMenuManagerAction!updateInput?id=<s:property value="#u.id"/>>修改</a>|
				<a href=admin/AdviceMenuManagerAction!load?id=<s:property value="#u.id"/>>详情</a>	
				</td>
				<td>
				<table>
				<tr>
				<td><div id=""><img height="70" width="70" src="<s:property value="#u.imageurl"/>"/></div></td>
				<td><div id=""><img height="70" width="70" src="<s:property value="#u.imageurl2"/>"/></div></td>
				<td><div id=""><img height="70" width="70" src="<s:property value="#u.imageurl3"/>"/></div></td>
				</tr>
				</table>
                </td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>


</body>
</html>
