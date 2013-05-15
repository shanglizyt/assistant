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
<title>dish_list</title>
</head>

<body>
	<table border="1" cellpadding="10">
		<tr>
			<td>序号</td>
			<td>菜品名</td>
			<td align="center">编辑</td>
			<td>图片</td>
		</tr>
		<s:iterator value="dishs" var="u">
			<tr>
				<td><s:property value="#u.id" /></td>
				<td><s:property value="#u.name" /></td>
				<td>
				<a href=admin/DishManagerAction!delete?id=<s:property value="#u.id"/>>删除</a>|
				<a href=admin/DishManagerAction!updateInput?id=<s:property value="#u.id"/>>修改</a>|
				<a href=admin/DishManagerAction!load?id=<s:property value="#u.id"/>>详情</a>	
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
