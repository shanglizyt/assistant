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
	<form action="admin/DietianManagerAction!updatedietian" method="post" enctype="multipart/form-data" >
		<input name="dietian.id" type="hidden" value='<s:property value="dietian.id"/>'/>
		姓名:
		<p>
			<input type="text" name="dietian.name" value='<s:property value="dietian.name"/>'/>
		</p>
		密码:
		<p>
			<input type="text" name="dietian.password" value='<s:property value="dietian.password"/>' />
		</p>
		a年龄:
		<p>
			<input type="text" name="dietian.age" value='<s:property value="dietian.age"/>' />
		</p>
		描述:
		<p>
			<textarea cols="100" rows="16" name="dietian.miaoshu"><s:property value="dietian.miaoshu"/></textarea>
		</p>
		职称:
		<p>
			<input type="text" name="dietian.zhicheng" value='<s:property value="dietian.zhicheng"/>' />
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
