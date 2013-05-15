<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>details</title>

  </head>
  
  <body>
   	<table border="1" cellpadding="10">
		<tr>
			<td>用户名</td>
			<td>密码</td>
			<td>年龄</td>
			<td>编辑</td>
		</tr>
		<s:iterator value="user">
			<tr>
				<td><s:property value="name" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="age" /></td>
				<td>
				<a href=admin/UserManagerAction!delete?id=<s:property value="id"/>>删除</a>|
				<a href=admin/UserManagerAction!updateInput?id=<s:property value="id"/>>修改</a>|
				</td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>
	
  </body>
</html>
