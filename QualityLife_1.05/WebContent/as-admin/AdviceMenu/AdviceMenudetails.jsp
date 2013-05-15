<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>adviceMenu_detail</title>
</head>
<body>
	<table>
		<tr>
			<td>名称：</td>
			<td><s:property value="adviceMenu.name"/> </td>
		</tr>
		<tr>
			<td>简介：</td>
			<td><s:property value="adviceMenu.miaoshu"/> </td>
		</tr>
		<tr>
			<td></td>
			<td><img alt="" src='<s:property value="adviceMenu.imageurl"/>'></td>
		</tr>
		<tr>
			<td><strong>所含食材</strong></td>
			<td></td>
		</tr>
		<s:iterator value="adviceMenu.dishes.toArray()">
		<tr>
			<td><s:property value="name"/></td>
			<td></td>
		</tr>
		</s:iterator>
	</table>
</body>
</html>