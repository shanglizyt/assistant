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
<title>食物管理</title>
</head>

<body>
	<table border="1" cellpadding="10">
		<tr>
			<td>食物名</td>
			<td>钙含量</td>
			<td>铁含量</td>
			<td align="center">编辑</td>
			<td>图片</td>
		</tr>
		<s:iterator value="foods" var="u">
			<tr>
				<td><s:property value="#u.name" /></td>
				<td><s:property value="#u.ca" /></td>
				<td><s:property value="#u.fe" /></td>
				<td>
				<a href=admin/FoodManagerAction!delete?id=<s:property value="#u.id"/>>删除</a>|
				<a href=admin/FoodManagerAction!updateInput?id=<s:property value="#u.id"/>>修改</a>|
				<a href=admin/FoodManagerAction!loadfood?id=<s:property value="#u.id"/>>详情</a>	
				</td>
				<td><table>
				<tr>
				<td><div id=""><img height="70" width="70" src="<s:property value="#u.imageurl"/>"/></div></td>
				<td><div id=""><img height="70" width="70" src="<s:property value="#u.imageurl2"/>"/></div></td>
				<td><div id=""><img height="70" width="70" src="<s:property value="#u.imageurl3"/>"/></div></td>
				</tr>
				</table></td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>


</body>
</html>
