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

<title>修改用户信息</title>

</head>

<body>
	<form action="admin/UserManagerAction!update" method="post"
		enctype="multipart/form-data">
		<input name="user.id" type="hidden" value="<s:property value="user.id"/>" /> 
		姓名:
		<p>
			<input name="user.name" value="<s:property value="user.name"/>" />
		</p>
		密码:
		<p>
			<input name="user.password" value="<s:property value="user.password" />" />
		</p>
		年龄:
		<p>
			<input name="user.age" value="<s:property value="user.age" />" />
		</p>
		身高:
		<p>
			<input name="user.height" value="<s:property value="user.height" />" />
		</p>
		工作:
		<p>
			<input name="user.job" value="<s:property value="user.job" />" />
		</p>
		性别:
		<p>
			<input name="user.sex" value="<s:property value="user.sex" />" />
		</p>
		体重:
		<p>
			<input name="user.weight" value="<s:property value="user.weight" />" />
		</p>
		头像：
		<p>
			<input type="file" name="myFile" />
		</p>
		<input type="submit" value="确认" /> <input type="submit" value="确认" />
	</form>
	<s:debug></s:debug>

</body>
</html>
