<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <meta name="viewport" content="width=device-width, initial-scale=1">
	  <script src="text/bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/jquery-2.0.0.min.js"></script>
	   <link rel="stylesheet" href="text/foundation-6.4.2-complete/css/foundation.min.css">
  <script src="text/foundation-6.4.2-complete/js/vendor/foundation.min.js"></script>
  <script src="text/foundation-6.4.2-complete/js/vendor/modernizr.js"></script>
	
  </head>
  
  <body>
  <div style="padding:20px;">
  <h2>内嵌模态框</h2>
  <!-- 触发模态框 -->
  <button type="button" class="button" data-reveal-id="myModal">点击打开模态框</button>

  <!-- 第一个模态框 -->
  <div id="myModal" class="reveal-modal" data-reveal>
    <h2>第一个模态框</h2>
    <p>点击以下按钮会打开一个新的模态框。如果打开新的模态框，那么第一个模态框就会被关闭。</p>
    <p><a href="#" data-reveal-id="secondModal" class="button success" style="text-decoration:none;">打开第二个模态框</a></p>
    <a class="close-reveal-modal">&times;</a>
  </div>

  <!-- 第二个模态框 -->
  <div id="secondModal" class="reveal-modal" data-reveal data-options="multiple_opened:true;">
    <h2>第二个模态框</h2>
    <p>第二个模态框，第一个模态在第二个模态框下面，并没有关闭。</p>
   
    <a class="close-reveal-modal">&times;</a>
  </div>
</div>

<script>
$(document).ready(function() {
    $(document).foundation();
})
</script>
  </body>
</html>
