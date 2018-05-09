<%@  page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tian.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
html,body {
    margin:0;
    height:100%;
}
#test {
    width:100%;
    height:100%;
    background-color:#000;
    position:absolute;
    top:0;
    left:0;
    z-index:2;
    opacity:0.3;
    filter: alpha(opacity=30);
    display:none;
}

#log_window {
    width:800px;
    height:800px;
    background-color:white;    
    margin: auto;
    position: absolute;
    z-index:3;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    display:none;
}
</style>
<script>
function shield(){
    var s = document.getElementById("test");
    s.style.display = "block";
    
    var l = document.getElementById("log_window");
    l.style.display = "block";
}

function cancel_shield(){
    var s = document.getElementById("test");
    s.style.display = "none";
    
    var l = document.getElementById("log_window");
    l.style.display = "none";
}
</script>
  </head>
  
  <body>
		   <a href="javascript:shield()">打开遮罩</a>
		<div id="test"></div>
		<div id="log_window">
		 <a href="javascript:cancel_shield()"> <input type="submit" value="关闭" /></a>
		</div>
  </body>
</html>
