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

<title>dietian_list</title>
</head>

<body>

	<table border="1" cellpadding="10">
		<tr>
			<td>用户名</td>
			<td>密码</td>
			<td align="center">编辑</td>
			<td>头像</td>
		</tr>
		<s:iterator value="dietians" var="u">
			<tr>
				<td><s:property value="#u.name" /></td>
				<td><s:property value="#u.password" /></td>
				<td>
				<a href=admin/DietianManagerAction!delete?id=<s:property value="#u.id"/>>删除</a>|
				<a href=admin/DietianManagerAction!updateInput?id=<s:property value="#u.id"/>>修改</a>|
				<a href=admin/DietianManagerAction!loaddietian?id=<s:property value="#u.id"/>>详情</a>	
				</td>
				<td><img height="70" width="70" src="<s:property value="#u.imageurl"/>"/></td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>


</body>
</html>
