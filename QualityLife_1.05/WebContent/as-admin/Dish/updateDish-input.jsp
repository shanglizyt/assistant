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
<title>update-food</title>
</head>
<body>
<form action="admin/DishManagerAction!update" method="post" enctype="multipart/form-data">
	<input name="dish.id" type="hidden" value="<s:property value="dish.id"/>" />
	名称:<p><input name="dish.name" value="<s:property value="dish.name"/>" /></p>
  	介绍:<p><textarea cols="100" rows="16" name="dish.miaoshu"><s:property value="dish.miaoshu"/></textarea></p>
  	图片1:<p><input type="file" name="myFile" id="uploadFile"/></p>
  	图片2:<p><input type="file" name="myFile" id="uploadFile2"/></p>
  	图片3:<p><input type="file" name="myFile" id="uploadFile3"/></p>
  	<br>
  	口味：
  	酸<input type="radio" name="kouwei" value="1"/>
  	甜<input type="radio" name="kouwei" value="2"/>
  	苦<input type="radio" name="kouwei" value="3"/>
  	辣<input type="radio" name="kouwei" value="4"/><br>
  	<center>材料组成</center><br>
  	<br>
  	<p>食材1:<input type="text" name="foods"/></p>
  	<p>食材2:<input type="text" name="foods"/></p>
  	<p>食材3:<input type="text" name="foods"/></p>
  	<p>食材4:<input type="text" name="foods"/></p>
  	<p>食材5:<input type="text" name="foods"/></p>
  	<p>食材6:<input type="text" name="foods"/></p>
  <input type="submit" value="确认" /> 
  </form>
</body>
</html>