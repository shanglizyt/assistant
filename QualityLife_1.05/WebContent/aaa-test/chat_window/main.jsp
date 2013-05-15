<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
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
<script language="javascript" type="text/javascript"> 
function sc() 
{ 
var e=document.getElementById("main") ;
e.scrollTop=e.scrollHeight; 
} 
var s=setInterval("sc()",13) ;
setTimeout("javascript:location.href='commen!loadmessages'", 500);
</script>
<style type="text/css"><!--
#main {
	height: 300px;
	width: 500px;
	border-top-width: 1px;
	border-right-width: 1px;
	border-bottom-width: 1px;
	border-left-width: 1px;
	border-top-style: dashed;
	border-right-style: dashed;
	border-bottom-style: dashed;
	border-left-style: dashed;
	overflow: scroll;
	overflow-x: hidden;
}
-->
</style> 
</head>
<body>
    <div id="main">
		<s:iterator value="messages">
			<font color="#0000FF"><s:property value="name"/>:<s:property value="date"/></font><br>
            <textarea rows="" cols="60" readonly="readonly" style="overflow-y:hidden;overflow-x:hidden; border:0">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="content"/></textarea><br>
  		</s:iterator>
	</div>
</body>
</html>