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

<title>用户管理</title>
</head>

<body>
	需要动态方法调用
	<a></a>

	<table border="1" cellpadding="1" cellspacing="0">
		<tr>
			<td>用户名</td>
			<td>密码</td>
			<td align="center">编辑</td>
			<td>头像</td>
		</tr>
		<s:iterator value="users" var="u">
			<tr>
				<td><s:property value="#u.name" /></td>
				<td><s:property value="#u.password" /></td>
				<td>
				<a href=admin/UserManagerAction!delete?id=<s:property value="#u.id"/>>删除</a>|
				<a href=admin/UserManagerAction!updateInput?id=<s:property value="#u.id"/>>修改</a>|
				<a href=admin/UserManagerAction!loaduser?id=<s:property value="#u.id"/>>详情</a>	
				</td>
				<td>
				<table border="0">
				<tr>
				<td><div id=""><img height="70" width="70" src="<s:property value="#u.imageurl"/>"/></div></td>
				</tr>
				</table>
				</td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>


</body>
</html>
