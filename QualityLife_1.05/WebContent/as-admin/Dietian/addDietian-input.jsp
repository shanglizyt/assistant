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

<title>add_dietian</title>

</head>

<body>
	<form action="admin/DietianManagerAction!adddietian" method="post" enctype="multipart/form-data">
		姓名:
		<p>
			<input name="dietian.name" />
		</p>
		密码:
		<p>
			<input name="dietian.password" />
		</p>
		a年龄:
		<p>
			<input name="dietian.age" />
		</p>
		描述:
		<p>
			<textarea cols="100" rows="16" name="dietian.miaoshu"></textarea>
		</p>
		职称:
		<p>
			<input name="dietian.zhicheng" />
		</p>
		头像:
		<p>
			<input type="file" name="myFile" />
		</p>
		<input type="submit" value="确认" />
	</form>
	<s:debug></s:debug>

</body>
</html>
