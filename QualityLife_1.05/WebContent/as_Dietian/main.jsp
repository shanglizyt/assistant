<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%if(session.getAttribute("userName")==null){
	//response.sendRedirect(basePath+"as_commen/login.jsp");
} %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>营养师个人页面</title>
<style type="text/css">
<!--
body {
	background-color: #FFFFEE;
}
.STYLE7 {color: #FFFFFF}
.STYLE9 {color: #FFFFFF; font-family: "楷体"; }
.STYLE9 {	text-decoration: blink;
}
.STYLE10 {color: #666666; font-family: "楷体"; }
.STYLE10 {	text-decoration: blink;
}
#qsn {
	width: 95%;
	height: auto;
	border-bottom-style: dashed;
	border-top-width: 0px;
	border-right-width: 0px;
	border-bottom-width: 1px;
	border-left-width: 0px;
	float: none;
	clear: none;
}
#qsn #qsn-top {
	height: auto;
	width: auto;
}
-->
</style>
<script type="text/JavaScript">
<!--
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}
//-->
</script>
<SCRIPT type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></SCRIPT>

<script>
    $(function(){
        $(".reply").click(function(){
            if($("#replyBox").hide())
            {
                $("#replyBox").show();
                $("#replyBox").focus();
            }
        });
        $("#replyBox").blur(function(){
            if($(this).show())
            {
                $(this).hide();
            }
        });
    })
</script>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body onload="MM_preloadImages('images/daohang10.png')">

<div align="center">
  <table width="1030"  cellpadding="0" cellspacing="10"  bgcolor="#FFFFFF" background="images/yinyangs_3.jpg" >
    <!--DWLayoutTable-->
    <tr>
      <td width="19" height="99" >&nbsp;</td>
      <td width="266" >&nbsp;</td>
      <td colspan="3" valign="top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img src="images/luckhoosh.png" width="91" height="97" />&nbsp;&nbsp; <img src="images/named.png" width="228" height="86" /></td>
    </tr>
    <tr>
      <td height="103" >&nbsp;</td>
      <td >&nbsp;</td>
      <td colspan="3" valign="top" ><img src="images/dadj.png" width="665" height="103" /></td>
    </tr>
    
    <tr>
      <td height="9" ></td>
      <td ></td>
      <td width="96" ></td>
      <td width="139" ></td>
      <td width="437" ></td>
    </tr>
    <tr>
      <td height="49" >&nbsp;</td>
      <td align="left" valign="middle" ><img src="images/werk.png" width="158" height="43" /></td>
      <td >&nbsp;</td>
      <td valign="top" ><img src="images/liuy.png" width="136" height="46" /></td>
      <td >&nbsp;</td>
    </tr>
    <tr>
      <td height="374" >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
      <td colspan="2" valign="top">
        <!-- 内容显示 -->
      	<div id="qsn">
        	<div id="qsn-top">
        	<s:property value="question"/>第一个评论<a href="javascript:void(0);" class="reply">回复</a>
            </div>
          <form style="display:none;" id="replyBox" action="" method="post">
                <textarea style="width:500px;height:50px;border:1px solid;float:left;resize:none" ></textarea>
            	<input type="submit" value="OK" style="width:50px;height:50px;float:left"/>
           </form>
            <div style="clear:both" ></div>
        </div>
      </td>
    </tr>
    <tr>
      <td height="60" colspan="5" align="center" valign="bottom" ><span class="STYLE7">&nbsp;版权所有：生命树工作室||联系我们||关于网站||意见反馈||*******</span></td>
    </tr>
    <tr>
      <td height="14" >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
      <td >&nbsp;</td>
    </tr>
  </table>
</div>
</body>
</html>