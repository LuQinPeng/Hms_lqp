<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DrugrepertoryAdd.jsp' starting page</title>
    
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
  <div >
      <center><h2>药库到药房</h2></center>
     <form class="form-horizontal"  role="form" id="roleForm" action="saveTo.action" >
	<div class="form-group">
			<label for="roleName" class="col-sm-2 control-label">总共多少</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control" id="drugdate" name="drugst.dsrSumNumber"  placeholder="总共多少" >
	</div>
	</div>
	<div class="form-group">
			<label for="roleName" class="col-sm-2 control-label">请输入时间</label>			
	<div class="col-sm-4">
			<input type="date" class="form-control" id="drugdate" name="unld.unldate"  placeholder="请输入时间" >
	</div>
	</div>
	<div class="form-group">
			<label for="roleName" class="col-sm-2 control-label">请输入数量</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control" id="drugdate" name="unld.unlNumber"  placeholder="请输入数量" >
	</div>
	</div>
		<div class="form-group">
			<label for="roleName" class="col-sm-2 control-label">请输入状态</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control" id="drugdate" name="unld.state"  placeholder="请输入状态" >
	</div>
	</div>

		<div class="form-group">
			<label for="roleName" class="col-sm-2 control-label">请输入操作人</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control" id="drugdate" name="unld.unlname"  placeholder="请输入操作人" >
	</div>
	</div>
	
		<div class="form-group">
			<label for="roleName" class="col-sm-2 control-label">请输入转让数量</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="dateil.detnumb"  placeholder="请输入数量" >
	</div>
	</div>
	
			</div>
			<div class="modal-footer">
				<button type="submit" id="save" data-toggle='modal' data-target='#myModal' class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
			</div>
			</form>
			</div>
  </body>
</html>
