<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="admin/ArticleManagerAction!update" method="post" enctype="multipart/form-data">
		<input name="article.id" type="hidden"
			value="<s:property value="article.id"/>" /> 名称:
		<p>
			<input name="article.title"
				value="<s:property value="article.title"/>" />
		</p>
		介绍:
		<p>
			<textarea cols="100" rows="16" name="article.content">
				<s:property value="article.content" />
			</textarea>
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
</body>
</html>