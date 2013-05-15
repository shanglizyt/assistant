<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>聊天</title>
</head>
<body>
	<table>
		<tr>
			<td>
			<form action="commen!send" method="post">
				<!-- <input type="hidden" name="id" value="dietian.id"/> -->
				<input type="hidden" name="type" value="d"/>
				<textarea rows="4" cols="50" name="msg"></textarea><br>
				<div style="text-align:right;"><input type="submit" value="OK"/></div>
			</form>
			</td>
		</tr>
	</table>
</body>
</html>