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
<title>add_article</title>
</head>
<body>
	<form action="admin/ArticleManagerAction!addarticle" method="post"
		enctype="multipart/form-data">
		名称:
		<p>
			<input type="text" name="article.title" width="300" />
		</p>
		介绍:
		<p>
			<textarea cols="100" rows="16" name="article.content"></textarea>
		</p>
		图片:
		<p>
			<input type="file" name="myFile" id="myFile" />
		</p>
		文章类型：
		<select name="type">
			<option value="1">健康常识</option>
			<option value="2">食物治疗</option>
			<option value="3">饮食禁忌</option>
		</select>
		<input type="submit" value="确认" />
	</form>
	<s:debug></s:debug>
</body>
</html>
