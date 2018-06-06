<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DrugAdd.jsp' starting page</title>
    
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
     <form class="form-horizontal"  action="saveDrug.action" >
	<div class="form-group">
			<label  class="col-sm-2 control-label">药品的名称</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="drug.drugName"  placeholder="药品的名称" >
	</div>
	</div>	
	<div class="form-group">
			<label  class="col-sm-2 control-label">药品的拼音码</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="drug.drugSpell"  placeholder="药品的拼音码" >
	</div>
	</div>	
	<div class="form-group">
			<label  class="col-sm-2 control-label">药品单位</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="drug.drugUnit"  placeholder="药品单位" >
	</div>
	</div>	
	<div class="form-group">
			<label  class="col-sm-2 control-label">药品规格</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="drug.drugSpec"  placeholder="药品规格" >
	</div>
	</div>	
	<div class="form-group">
			<label  class="col-sm-2 control-label">药品的剂量</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="drug.drugDosage"  placeholder="药品的剂量" >
	</div>
	</div>
	<div class="form-group">
			<label  class="col-sm-2 control-label">药品出售单价</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="drug.drugPrice"  placeholder="药品出售单价" >
	</div>
	</div>
	
	</form>
	<form class="form-horizontal"  action="saveTo.action" >
	<div class="form-group">
			<label  class="col-sm-2 control-label">入库时间</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="unld.unldate"  placeholder="入库时间" >
	</div>
	</div>
	<div class="form-group">
			<label  class="col-sm-2 control-label">转存的药房</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="unld.unlstate"  placeholder="转存的药房" >
	</div>
	</div>
	<div class="form-group">
			<label  class="col-sm-2 control-label">转存的数量</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="unld.unlNumber"  placeholder="转存的数量" >
	</div>
	</div>
	<div class="form-group">
			<label  class="col-sm-2 control-label">操作人</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="unld.unlname"  placeholder="操作人" >
	</div>
	</div>
		<div class="form-group">
			<label  class="col-sm-2 control-label">药品的数量</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="dateil.detnumb"  placeholder="药品的数量" >
	</div>
	</div>
	<div class="form-group">
			<label  class="col-sm-2 control-label">审批状态</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="unld.state"  placeholder="审批状态" >
	</div>
	</div>
	<div class="form-group">
			<label  class="col-sm-2 control-label">审批人</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="unld.domename"  placeholder="审批人" >
	</div>
	</div>
	<div class="form-group">
			<label  class="col-sm-2 control-label">库存共多少箱</label>			
	<div class="col-sm-4">
			<input type="text" class="form-control"  name="drugst.dsrSumNumber"  placeholder="库存共多少箱" >
	</div>
	</div>
	</form>
			<div class="modal-footer">
				<button type="submit"  data-toggle='modal' data-target='#myModal' class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
			</div>
			</div>
  </body>
</html>
