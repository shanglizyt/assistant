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
    
    <title>add_adviceMenu</title>

  </head>
  
  <body>
    <form action="admin/AdviceMenuManagerAction!addadviceMenu" method="post" enctype="multipart/form-data">
  	名称:<p><input name="adviceMenu.name"  /></p>
  	介绍:<p><textarea cols="100" rows="16" name="adviceMenu.miaoshu"></textarea></p>
  	图片1:<p><input type="file" name="myFile" id="uploadFile"/></p>
  	图片2:<p><input type="file" name="myFile" id="uploadFile2"/></p>
  	图片3:<p><input type="file" name="myFile" id="uploadFile3"/></p>
  	<br>
  	<center>菜品组成</center><br>
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
