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
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>
			<s:action id="ma" name="UserManagerAction!list" executeResult="false" />
			value=<s:property value="#ma.users.get(0).getName()"/>
			</td>
		</tr>
		<tr>
			<td>
			<!-- <img alt="" src="user!draw"
							style="margin: auto;"> -->
			</td>
		</tr>

	</table>
</body>
</html>