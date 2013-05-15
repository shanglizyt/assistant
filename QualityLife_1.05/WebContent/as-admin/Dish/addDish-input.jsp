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
    
    <title>add_dish</title>

  </head>
  
  <body>
    <form action="admin/DishManagerAction!adddish" method="post" enctype="multipart/form-data">
  	名称:<p><input name="dish.name"  /></p>
  	介绍:<p><textarea cols="100" rows="16" name="dish.miaoshu"></textarea></p>
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
  <s:debug></s:debug>
  
  </body>
</html>
