<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>公共主页</title>
<style type="text/css">
<!--
.STYLE1 {
	color: #FFFFFF;
	font-size: 36px;
}
.STYLE2 {font-size: 36px}
.STYLE3 {color: #666666}
body {
	background-color: #FFFFEE;
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

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_nbGroup(event, grpName) { //v6.0
  var i,img,nbArr,args=MM_nbGroup.arguments;
  if (event == "init" && args.length > 2) {
    if ((img = MM_findObj(args[2])) != null && !img.MM_init) {
      img.MM_init = true; img.MM_up = args[3]; img.MM_dn = img.src;
      if ((nbArr = document[grpName]) == null) nbArr = document[grpName] = new Array();
      nbArr[nbArr.length] = img;
      for (i=4; i < args.length-1; i+=2) if ((img = MM_findObj(args[i])) != null) {
        if (!img.MM_up) img.MM_up = img.src;
        img.src = img.MM_dn = args[i+1];
        nbArr[nbArr.length] = img;
    } }
  } else if (event == "over") {
    document.MM_nbOver = nbArr = new Array();
    for (i=1; i < args.length-1; i+=3) if ((img = MM_findObj(args[i])) != null) {
      if (!img.MM_up) img.MM_up = img.src;
      img.src = (img.MM_dn && args[i+2]) ? args[i+2] : ((args[i+1])? args[i+1] : img.MM_up);
      nbArr[nbArr.length] = img;
    }
  } else if (event == "out" ) {
    for (i=0; i < document.MM_nbOver.length; i++) {
      img = document.MM_nbOver[i]; img.src = (img.MM_dn) ? img.MM_dn : img.MM_up; }
  } else if (event == "down") {
    nbArr = document[grpName];
    if (nbArr)
      for (i=0; i < nbArr.length; i++) { img=nbArr[i]; img.src = img.MM_up; img.MM_dn = 0; }
    document[grpName] = nbArr = new Array();
    for (i=2; i < args.length-1; i+=2) if ((img = MM_findObj(args[i])) != null) {
      if (!img.MM_up) img.MM_up = img.src;
      img.src = img.MM_dn = (args[i+1])? args[i+1] : img.MM_up;
      nbArr[nbArr.length] = img;
  } }
}
//-->
</script>
</head>

<body onload="MM_preloadImages('images/daohang10.png','images/daohang1-1.jpg','images/daohang2-1.jpg','images/daohang3-1.jpg')">

<div align="center">
  <table width="1009" border="1" cellpadding="0" cellspacing="1" bordercolor="#C4DF71" bgcolor="#FFFFFF" >
    <!--DWLayoutTable-->
    <tr>
      <td height="172" colspan="3" valign="top"><img src="images/sd1_copy.png" width="1000" height="170" /></td>
      <td width="1"></td>
    </tr>
    
    <tr >
      <td height="46" colspan="2" valign="top" ><table border="0" cellpadding="0" cellspacing="0">
        <!--DWLayoutTable-->
        <tr>
          <td height="46"><a href="index.jsp" target="_top" onclick="MM_nbGroup('down','group1','daohang10','',1)" onmouseover="MM_nbGroup('over','daohang10','images/daohang1-1.jpg','',1)" onmouseout="MM_nbGroup('out')"><img src="images/daohang1-0.jpg" alt="" name="daohang10" width="252" height="46" border="0" id="daohang10" onload="" /></a></td>
          <td width="252" valign="top"><a href="javascript:;" target="_top" onclick="MM_nbGroup('down','group1','daohang20','',1)" onmouseover="MM_nbGroup('over','daohang20','images/daohang2-1.jpg','',1)" onmouseout="MM_nbGroup('out')"><img name="daohang20" src="images/daohang2-0.jpg" border="0" alt="" onload="" /></a></td>
          <td width="259" rowspan="2" valign="top"><a href="javascript:;" target="_top" onClick="MM_nbGroup('down','group1','daohang30','',1)" onMouseOver="MM_nbGroup('over','daohang30','images/daohang3-1.jpg','',1)" onMouseOut="MM_nbGroup('out')"><img name="daohang30" src="images/daohang3-0.jpg" border="0" alt="" onLoad="" /></a></td>
          </tr>
        <tr>
          <td height="1"></td>
          <td></td>
          </tr>
        
      </table>      </td>
      <td width="240" rowspan="3" valign="top"  ><img src="images/shusdf_1.jpg" width="240" height="214" /></td>
      <td></td>
    </tr>
    <tr>
      <td width="219" rowspan="4" valign="top" ><div align="left"><img src="images/ti1.png" width="145" height="48" /></div>
      <p align="center"><img src="images/weibo.png" width="171" height="472" /></p></td>
      <td width="536" height="45" valign="middle"><form id="form1" name="form1" method="post" action="">
        <div align="center">
          <input name="textfield" type="text" value="" />
          &nbsp;&nbsp;&nbsp; 
          <input type="submit" name="Submit" value="搜索" />
          </div>
      </form></td>
      <td></td>
    </tr>
    <tr>
      <td rowspan="2" valign="top"><div align="left"><img src="images/ti6.png" width="142" height="48" /></div>
      <p><img src="images/shengmingshu.jpg" width="536" height="380" /></p></td>
      <td height="121"></td>
    </tr>
    
    <tr>
      <td rowspan="4" valign="top" ><div align="left">
        <p><img src="images/ti3.png" width="142" height="45" /></p>
        </div>
      <p><img src="images/paihangbang.png" width="238" height="546" /></p>        <p><img src="images/paihangbang_1.png" width="238" height="304" /></p></td>
      <td height="310"></td>
    </tr>
    <tr>
      <td rowspan="2" valign="top" ><div align="left"><img src="images/ti4.png" width="165" height="46" /></div>
      <p align="center"><img src="images/meirituijian.jpg" width="536" height="277" /></p></td>
      <td height="65"></td>
    </tr>
    
    
    
    <tr> 
      <td rowspan="2" valign="top"  ><div align="left"><img src="images/ti2.png" width="145" height="45" /></div>
      <p><img src="images/liuyan.png" width="218" height="299" /></p></td>
      <td height="278"></td>
    </tr>
    
    <tr>
      <td height="279" valign="top"><div align="left"><img src="images/ti5.png" width="168" height="51" /></div>
      <p><img src="images/yinshijinji.jpg" width="229" height="205" />&nbsp;&nbsp;&nbsp;&nbsp; <img src="images/yinshijinji.jpg" width="229" height="205" /></p></td>
      <td></td>
    </tr>
    
    <tr>
      <td height="111" colspan="3" valign="top"><p>&nbsp;</p>
      <hr size="1"  color="#003300"/>
      <p align="center"><span class="STYLE3">&nbsp;生命树工作室||联系我们||关于网站||意见反馈||*******</span></p></td>
      <td></td>
    </tr>
  </table>
</div>
</body>
</html>