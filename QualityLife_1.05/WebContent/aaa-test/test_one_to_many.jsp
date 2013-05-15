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
			<td colspan="2">
				<img src="<s:property value="dish.imageurl"/>"></img>
			</td>
		</tr>
		<tr>
			<td>菜名：</td>
			<td>
				<s:property value="dish.name"/>
			</td>
		</tr>
		<tr>
			<td>口味：</td>
			<td>
				<s:property value="dish.kouwei"/>
			</td>
		</tr>
		<tr>
			<td>简介：</td>
			<td>
				<s:property value="dish.miaoshu"/>
			</td>
		</tr>
		<tr>
			<td>包含食材：</td>
			<td>
				<s:iterator value="dish.foods.toArray()">
					<s:property value="name"/><br/>
				</s:iterator>
			</td>
		</tr>
	</table>
</body>
</html>