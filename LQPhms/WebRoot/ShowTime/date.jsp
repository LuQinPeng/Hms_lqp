<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'date.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap-theme.min.css">
	

	<script src="${pageContext.request.contextPath}/resource/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resource/bootstrap/js/bootstrap.min.js"></script>

  </head>
  
  <body>
<!--  <div>
    	<center><h4>药品入库查询</h4></center>
   	<form action="select.action" method="post">
  		<input type="date" name="min">元---
  		<input type="date" name="max">元
  		<input type="submit" value="查询">
  	</form>
  	</div> -->
 ------------------------------------------------- 	
  	<div>

  	 <center><h4>
  转让入库查询</h4></center>
  	<form action="findDrugrepertory.action" method="post">
  		<input type="date" name="min">元---
  		<input type="date" name="max">元
  		<input type="submit" value="查询">
  	</form>
  	</div>
 --------------------------------------------------------
<!--   	<a href="findDrugrepertory.action">查询</a> -->
  </body>
</html>
