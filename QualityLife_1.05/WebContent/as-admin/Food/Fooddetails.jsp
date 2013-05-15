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
<title>食物详情</title>
</head>
<body>
	<table>
		<tr>
			<td>名称：</td>
			<td><s:property value="food.name"/> </td>
		</tr>
		<tr>
			<td>简介：</td>
			<td><s:property value="food.miaoshu"/> </td>
		</tr>
		<tr>
			<td></td>
			<td><img alt="" src='<s:property value="food.imageurl"/>'></td>
		</tr>
		<tr>
			<td><strong>所含元素</strong></td>
			<td></td>
		</tr>
		<tr>
			<td>元素</td>
			<td>含量</td>
		</tr>
		<s:iterator value="food.elements.toArray()">
		<tr>
			<td><s:property value="name"/></td>
			<td><s:property value="amount"/><s:property value="unit"/>/<s:property value="standard"/></td>
		</tr>
		</s:iterator>
	</table>
</body>
</html>