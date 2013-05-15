<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>add_food</title>

  </head>
  
  <body>
    <form action="admin/FoodManagerAction!addfood" method="post" enctype="multipart/form-data">
  	名称:<p><input name="food.name"  /></p>
  	介绍:<p><textarea cols="100" rows="16" name="food.miaoshu"></textarea></p>
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
  <s:debug></s:debug>
  
  </body>
</html>
