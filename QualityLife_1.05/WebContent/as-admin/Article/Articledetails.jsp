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
<title>article_detail</title>
</head>
<body>
	<table>
		<tr>
			<td>
			<s:property value="article.title"/><br><br>
			</td>
		</tr>
		<tr>
			<td>
			<s:property value="article.content"/>
			</td>
		</tr>
	</table>
</body>
</html>