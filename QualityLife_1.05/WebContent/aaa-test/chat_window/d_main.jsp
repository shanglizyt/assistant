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
<!-- <meta http-equiv="refresh" content="1,url=dietian!send?id=<s:property value="#dietian.id" />"> -->
<title>Insert title here</title>
</head>
<frameset rows="70%,30%">
<frame src="aaa_test/chat_window/main.jsp">
<frame src="aaa_test/chat_window/dietian.jsp">
</frameset>
<body>
</body>
</html>