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
<title>article_list</title>
</head>

<body>
	<table border="1" cellspacing="0" cellpadding="1">
		<tr>
			<td>序号</td>
			<td>标题</td>
			<td align="center">编辑</td>
		</tr>
		<s:iterator value="articles" var="u">
			<tr>
				<td><s:property value="#u.id" /></td>
				<td><s:property value="#u.title" /></td>
				<td>
				<a href=admin/ArticleManagerAction!delete?id=<s:property value="#u.id"/>>删除</a>|
				<a href=admin/ArticleManagerAction!updateInput?id=<s:property value="#u.id"/>>修改</a>|
				<a href=admin/ArticleManagerAction!load?id=<s:property value="#u.id"/>>详情</a>	
				</td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>


</body>
</html>
