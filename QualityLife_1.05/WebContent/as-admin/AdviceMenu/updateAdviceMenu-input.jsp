<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update-dish</title>
</head>
<body>
<form action="admin/AdviceMenuManagerAction!update" method="post" enctype="multipart/form-data">
	<input name="adviceMenu.id" type="hidden" value="<s:property value="adviceMenu.id"/>" />
	名称:<p><input name="adviceMenu.name" value="<s:property value="adviceMenu.name"/>" /></p>
  	介绍:<p><textarea cols="100" rows="16" name="adviceMenu.miaoshu"><s:property value="adviceMenu.miaoshu"/></textarea></p>
  	图片1:<p><input type="file" name="myFile" id="uploadFile"/></p>
  	图片2:<p><input type="file" name="myFile" id="uploadFile2"/></p>
  	图片3:<p><input type="file" name="myFile" id="uploadFile3"/></p>
  	<br>
  	<center>材料组成</center><br>
  	<br>
  	<p>食材1:<input type="text" name="dishes"/></p>
  	<p>食材2:<input type="text" name="dishes"/></p>
  	<p>食材3:<input type="text" name="dishes"/></p>
  	<p>食材4:<input type="text" name="dishes"/></p>
  	<p>食材5:<input type="text" name="dishes"/></p>
  	<p>食材6:<input type="text" name="dishes"/></p>
  <input type="submit" value="确认" /> 
  </form>
</body>
</html>