var imgwidth=260
var imgheight=358
var imgname=new Array()
imgname[0]="images/food/food3.jpg"
imgname[1]="images/food/food4.jpg"
var imgurl=new Array()

imgurl[0]="#"
imgurl[1]="#"

var imgpreload=new Array()
for (i=0;i<=imgname.length-1;i++) {
	imgpreload[i]=new Image()
	imgpreload[i].src=imgname[i]
}


var pause=2000

var speed=10

//下面的参数也会影响图片显示的速度，数值小速度快；代表2个图片的显示间隔。
var step=10

var i_loop=0
var i_image=0

function stretchimage() {
	if (i_loop<=imgwidth) {
		if (document.all) {
			imgcontainer.innerHTML="<a href='"+imgurl[i_image]+"' target='_blank'><img width='"+i_loop+"' height='"+imgheight+"' src='"+imgname[i_image]+"' border='0'></a>"
		}
		i_loop=i_loop+step
		var timer=setTimeout("stretchimage()",speed)
  	}
	else {
		i_loop=imgwidth
		clearTimeout(timer)
		imgcontainer.innerHTML="<a href='"+imgurl[i_image]+"' target='_blank'><img src='"+imgname[i_image]+"' border='0'></a>"
		var timer=setTimeout("shrinkimage()",pause)
	}
}

function shrinkimage() {
	if (i_loop>=0) {
		if (document.all) {
			imgcontainer.innerHTML="<a href='"+imgurl[i_image]+"' target='_blank'><img width='"+i_loop+"' height='"+imgheight+"' src='"+imgname[i_image]+"' border='0'></a>"
		}
		i_loop=i_loop-step
		var timer=setTimeout("shrinkimage()",speed)
  	}
	else {
		i_loop=0
		clearTimeout(timer)
		changeimage()
	}
}

function changeimage() {
	i_image++
	if (i_image>=imgname.length) {i_image=0}
	if (document.layers) {
		document.imgcontainer.document.write("<a href='"+imgurl[i_image]+"' target='_blank'><img src='"+imgname[i_image]+"' border='0'></a>")	
		document.imgcontainer.document.close()
	}		
   	stretchimage()
}
//不删
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