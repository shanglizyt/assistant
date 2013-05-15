<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>公共主页</title>
<style type="text/css">
<!--
.STYLE3 {color: #666666}
#demo {
}
body {
	background-color: #FFFFEE;
	background-image: url();
}
#liuyan #liuyanfb {
	text-align: center;
	height: 120px;
}
#liuyan #liuyannr {
	height: 230px;
}
#liuyan {
	height: 384px;
}
#wrap #column2 #kongge {
	height: 40px;
}
.kuang {
 border:1px solid #cacaff;
	background-color: #f7f7ff;
}
.title{
	border-bottom-width: medium;
	border-bottom-style: dashed;
	border-bottom-color: #333333;
}
#jingji2 {
	height: 384px;
}
.STYLE6 {color: #666666; font-size: 18px; }
a {
	font-family: 楷体;
	font-size: 24px;
	color: #000000;
}
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
.STYLE14 {
	color: #999900;
	font-size: 14px;
}
.STYLE17 {color: #666666; font-size: 12px; }
.STYLE19 {
	color: #333333;
	font-size: 18px;
	font-family: "楷体";
}
.STYLE28 {font-size: 16px; color: #333333; font-family: "Adobe 仿宋 Std R"; }
#bangdan {
}
#a {
	padding: 5px;
	height: 400px;
	width: auto;
	border: thin none #333333;
}
#ssk {
	border: thin solid #CCCCCC;
	height: 35px;
	width: 500px;
	background-color: #CACA00;
	text-align: center;
	vertical-align: middle;
}
#jingji1 {
	height: 384px;
}

.out-shadow {
					margin-right:10px;
					padding:5px;
					border:1px solid #ccc;
					
					-moz-border-radius:5px;
					-webkit-border-radius:5px;
					border-radius:5px;
					
					-webkit-box-shadow:0 0 5px rgba(0,0,0,0.2);
					-moz-box-shadow: 0 0 5px rgba(0,0,0,0.2);
					box-shadow: 0 0 5px rgba(0,0,0,0.2);
					
					-webkit-transition:all 0.3s ease;
					-moz-transition:all 0.3s ease;
					-ms-transition:all 0.3s ease;
					-o-transition:all 0.3s ease;
					transition:all 0.3s ease;
				}
#line {
	height: 384px;
	border-left-width: thin;
	border-left-style: solid;
	border-left-color: #D9D9D9;
}
				
				.out-shadow:hover {
					border:1px solid rgba(82, 168, 236, 0.6);
					-webkit-box-shadow:0 0 11px rgba(82, 168, 236, 0.6);
					-moz-box-shadow: 0 0 11px rgba(82, 168, 236, 0.6);
					box-shadow: 0 0 11px rgba(82, 168, 236, 0.6);
				}
#head {
	height: 170px;
}
.STYLE31 {color: #999900; font-size: 18px; font-weight: bold; }
.STYLE38 {color: #999900; font-size: 20px; font-weight: bold; font-family: "楷体"; }
	
#wrap{width:240px;height:auto;}
#column1{
	float:left;
	width:80;
	border: thin solid #CCCCCC;
}
#column2{
    float:right;
    width:150;
}				
.STYLE40 {color: #999900; font-size: 18px; }
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
  <table width="1062" height="1600" cellpadding="0" cellspacing="5"  bgcolor="#FFFFFF" >
    <!--DWLayoutTable-->
    <tr>
      <td height="172" colspan="8" valign="top"><div  id="head" align="center"><img src="images/sd1_jh_2.png" width="100%" height="170" /></div></td>
      <td width="1"></td>
    </tr>
    
    <tr >
      <td height="49" colspan="6" valign="top" ><table   cellpadding="0" cellspacing="0" align="left">
        <!--DWLayoutTable-->
        <tr>
          <td height="46"><a href="Index (2).html" target="_top" onclick="MM_nbGroup('down','group1','daohang10','',1)" onmouseover="MM_nbGroup('over','daohang10','images/daohang1-1.jpg','',1)" onmouseout="MM_nbGroup('out')"><img src="images/daohang1-0.jpg" alt="" name="daohang10" width="252" height="46" border="0" id="daohang10" onload="" /></a></td>
            <td width="252" valign="top"><a href="javascript:;" target="_top" onclick="MM_nbGroup('down','group1','daohang20','',1)" onmouseover="MM_nbGroup('over','daohang20','images/daohang2-1.jpg','',1)" onmouseout="MM_nbGroup('out')"><img name="daohang20" src="images/daohang2-0.jpg" border="0" alt="" onload="" /></a></td>
            <td width="250" rowspan="2" valign="top"><a href="javascript:;" target="_top" onClick="MM_nbGroup('down','group1','daohang30','',1)" onMouseOver="MM_nbGroup('over','daohang30','images/daohang3-1.jpg','',1)" onMouseOut="MM_nbGroup('out')"><img name="daohang30" src="images/daohang3-0.jpg" border="0" alt="" onLoad="" /></a></td>
            <td width="16">&nbsp;</td>
          </tr>
        <tr>
          <td height="1"></td>
            <td></td>
            <td></td>
          </tr>
        
      </table></td>
      <td width="2" >&nbsp;</td>
      <td width="243" rowspan="3" align="center" valign="top"  ><p align="left"><img src="images/shusdf_1.jpg" width="100%" />&nbsp;</p>
        <p align="center" class="STYLE31">
        <s:if test="#userName==null">
        <a href="denglu.html" class="STYLE31">登录</a>&nbsp;&nbsp;&nbsp;&nbsp; 
        <a href="zhuce.html" class="STYLE31">注册</a>
        </s:if>
        <s:else>
        <a href="touser.action?id=<s:property value="user.id" />">个人中心</a>
        </s:else>
        </p>
        </td>
    <td></td>
    </tr>
    <tr>
      <td width="218" rowspan="3" valign="top" ><div id="weibom" class="title" align="left"><img src="images/title/ti1.png" width="138" height="42" /></div>
	  <fieldset id="perblog" style="width: 210px" class="kuang"> <legend align="left"><img src="images/HeadPortrait/touxiang1.jpg" width="23" height="23" /><span class="STYLE38">用户名</span></legend>
 
      <span class="STYLE28" style="font size:12px">此处为用户微博内容，此处为用户微博内容此处为用户微博内容此处为用户微博内容</span>
      </fieldset></td>
      <td height="54" colspan="6" align="left" valign="middle"><div id="ssk" align="center" class="out-shadow"><form action="" method="post" name="form1" class="STYLE6" id="form1">
        <input name="textfield" type="text" class="STYLE6" value="" size="40"/>
        &nbsp; 
        <input name="Submit" type="submit" class="STYLE6" value="搜索" />
        </form>
      </div></td>
      <td></td>
    </tr>
    <tr>
      <td colspan="6" rowspan="2" valign="top" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
        <!--DWLayoutTable-->
        <tr>
          <td width="557" height="48" valign="top"><div align="left" class="title"><img src="images/title/ti6.png" width="136" height="42" /></div></td>
          </tr>
        <tr>
          <td width="557" height="490" align="center" valign="bottom"><div ><img src="images/treeball_2.png" width="100%" height="100%" border="0" usemap="#Map" />
              <map name="Map" id="Map">
                <s:if test="#userName==null">
                <area shape="rect" coords="27,156,112,281" href="as_commen/login.jsp" />
                </s:if>
                <s:else>
                <area shape="rect" coords="27,156,112,281" href="user!dietian?id=<s:property value="user.id" />"/>
                </s:else>
                <area shape="rect" coords="130,18,235,142" href="commen!changshiList" />
                <area shape="rect" coords="322,15,423,139" href="commen!tuijian" />
                <area shape="rect" coords="449,156,548,272" href="commen!zhiliaoList" />
              </map>
          </div></td>
          </tr>
        <tr>
          <td height="3"></td>
          </tr>  
      </table></td>
      <td height="143"></td>
    </tr>
    <tr>
      <td rowspan="3" valign="top" ><div align="left" class="title">
        <img src="images/title/ti3.png" width="138" height="38" /></div>        
   <!--美食榜开始-->
		<fieldset style="width:240px;" class="kuang">
        <div id="wrap">
        <div id="column1"><img src="images/food/foodgd1.jpg" width="100" height="80" /></div>
        <div id="column2"><div><span class="STYLE19">菜品名称</span></div><div id="kongge"></div>
          <div><span class="STYLE38">top1</span>(59000)</div>
        </div>
        </div>
        </fieldset>
        <!--美食榜结束-->
        </td>
      <td height="393"></td>
    </tr>
    <tr>
      <td height="54" colspan="7" valign="top" ><div align="left" class="title"><img src="images/title/ti4.png" width="162" height="40" /></div></td>
      <td></td>
    </tr>
    <tr>
      <td height="147" colspan="7" valign="top" ><div id=demo style="OVERFLOW: hidden; WIDTH:790px; HEIGHT: 147px">
        <table cellspacing=0 cellpadding=0 border=0>
          <tbody>
            <tr>
              <td id=demo1><table cellspacing=0 cellpadding=5>
                  <tbody>
                    <tr>
                    <!--今日推荐开始-->
                      <td valign=center align=middle><img src="images/food/foodgd1.jpg" width="190" height="140" /></td>
                      <!--今日推荐结束-->
                    </tr>
                  </tbody>
              </table></td>
              <td id=demo2></td>
            </tr>
          </tbody>
        </table>
      </div></td>
      <td></td>
    </tr>
    <tr>
      <td height="0" ></td>
      <td width="233" ></td>
      <td width="5" ></td>
      <td width="280" ></td>
      <td width="1" ></td>
      <td width="4" ></td>
      <td ></td>
      <td ></td>
      <td></td>
    </tr>
    <tr>
      <td height="54" colspan="2" valign="bottom" ><div align="left" class="title"><img src="images/title/ti2.png" width="143" height="46" /></div></td>
      <td >&nbsp;</td>
      <td colspan="5" valign="bottom" ><div align="left" class="title"><img src="images/title/ti5.png" width="164" height="45" /> </div></td>
      <td></td>
    </tr>
    
    
    <tr>
      <td height="386" colspan="2" valign="bottom" ><div id="liuyan" class="kuang">
	  <div id="liuyannr">
      <!--留言板开始-->
	    <p class="STYLE14">&nbsp;用户名：<span class="STYLE28">留言内容留言内容留言内容留言内容留言内容…</span><span class="STYLE17">&lt;10:00&gt;</span></span></p>
	    <!--留言板结束-->
	  </div>
	  <div id="liuyanfb"><form id="form3" name="form3" method="post" action="commen!liuyan">
 <textarea name="liuyan_content" cols="50" rows="4" class="STYLE14">留个言吧</textarea>
            <input type="submit" name="Submit2" value="发表" />       
      </form></div></div></td>
      <td >&nbsp;</td>
      <td valign="top" ><div id="jingji1">
        <span class="STYLE40">常见食物搭配的禁忌	  </span>
        <ul type="disc">
        <!--第一栏禁忌-->
          <li><p align="left" class="STYLE28">黄瓜、西红柿忌同吃</p></li>
          <!---->
          </ul>
      </div></td>
      <td valign="top" ><div id="line"></div></td>
      <td colspan="3" valign="top" ><div id="jingji2"><span class="STYLE40">常见食物搭配的禁忌 </span>
	    <ul type="disc">
        <!--第二栏禁忌-->
	      <li><p align="left" class="STYLE28">黄瓜、西红柿忌同吃</p></li>
          <!---->
        </ul></div></td>
      <td></td>
    </tr>
    
  <SCRIPT>

var speed=20

demo2.innerHTML=demo1.innerHTML

function Marquee(){

if(demo2.offsetWidth-demo.scrollLeft<=0)

 demo.scrollLeft-=demo1.offsetWidth

else{

 demo.scrollLeft++ 
} 

}

var MyMar=setInterval(Marquee,speed)

demo.onmouseover=function(){clearInterval(MyMar)}

demo.onmouseout=function(){MyMar=setInterval(Marquee,speed)}

</SCRIPT>  
    
    
    
    
    
    <tr>
      <td height="117" colspan="8" valign="top"><p>&nbsp;</p>
        <hr size="1"  color="#003300"/>
        <p align="center"><span class="STYLE3">&nbsp;生命树工作室||联系我们||关于网站||意见反馈||*******</span></p></td>
      <td></td>
    </tr>
  </table>
</div></body>
</html>
