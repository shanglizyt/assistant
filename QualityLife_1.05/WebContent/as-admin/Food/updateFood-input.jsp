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
<form action="admin/FoodManagerAction!update" method="post" enctype="multipart/form-data">
	<input name="food.id" type="hidden" value="<s:property value="food.id"/>" />
  	名称:<p><input name="food.name"  value="<s:property value="food.name"/>"/></p>
  	介绍:<p><textarea cols="100" rows="16" name="food.miaoshu"><s:property value="food.miaoshu"/></textarea></p>
  	图片1:<p><input type="file" name="myFile" id="uploadFile"/></p>
  	图片2:<p><input type="file" name="myFile" id="uploadFile2"/></p>
  	图片3:<p><input type="file" name="myFile" id="uploadFile3"/></p>
  	<br>
  	<center>元素组成</center><br>
  	基本元素：
  	<p>名称:<input type="text" name="element" value="水"/>含量:<input type="text" name="hanliang" value="0"/>g/100g</p>
  	<p>名称:<input type="text" name="element" value="碳水化合物"/>含量:<input type="text" name="hanliang" value="0"/>g/100g</p>
  	其他元素：
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  	<p>名称:<input type="text" name="element" value=""/>含量:<input type="text" name="hanliang" value="0"/>mg/100g</p>
  <input type="submit" value="确认" /> 
  </form>
</body>
</html>