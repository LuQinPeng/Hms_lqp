<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/Show/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/Show/js/jquery-3.1.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/Show/js/bootstrap.min.js"></script>
<style>
#left {
	width: 100%;
	height: 100%;
	float: left;
	background-color: #09192a;
	float: left;
	padding-right: 1.5%;
	padding-left: 1.5%;
	display: inline;
}
</style>
  </head>
  
  <body>
  <div id="left">
  <div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion" href="#1">
							yaofang管理 </a>
					</h4>
				</div>
				<div id="1" class="panel-collapse collapse">
					<div class="panel-body">
						<a target="right"
							href="${pageContext.request.contextPath}/ShowTime/index.jsp">药品查询</a>
							
					</div>
					<div class="panel-body">
						<a target="right"
							href="${pageContext.request.contextPath}/ShowTime/PharmaryAdd.jsp">药品转药库</a>
					</div>
				</div>
			</div>
    	<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion" href="#2">
							药房转让明细</a>
					</h4>
				</div>
				<div id="2" class="panel-collapse collapse">
					<div class="panel-body">
						<a target="right"
							href="${pageContext.request.contextPath}/ShowTime/date.jsp">药品入库查询</a>
					</div>
					<div class="panel-body">
						<a target="right"
							href="${pageContext.request.contextPath}/ShowTime/pharmacyFind.jsp">转存及药库明细
						</a>
					</div>
					<div class="panel-body">
						<%-- <a target="right"
							href="${pageContext.request.contextPath}/Drugrepertory.jsp">药品转让明细
						</a> --%>
					</div>
				</div>
			</div>
			</div>
  </body>
</html>
