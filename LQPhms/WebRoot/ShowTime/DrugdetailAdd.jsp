<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DrugdetailAdd.jsp' starting page</title>
    
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
    	<div class="container">
    		<div class="row clearfix">

    			<h2  class="text-center">药fang录入</h2>
    			<form role="form" class="form-horizontal" id="drugForm" action="saveBydrug.action" method="post">
    			<div class="form-group">
						<label for="drugId" class="col-sm-2 control-label">药fang编号</label>
						<div class="col-sm-4">
							<input type="text" class="form-control"  name="detail.detId"   placeholder="药品编号"  readonly="readonly">
						</div>
					</div>
    			<div class="form-group">
						<label for="drugName" class="col-sm-2 control-label">药品转存时间</label>
						<div class="col-sm-4">
							<input type="date" class="form-control"  name="detail.unloading.unldate"   placeholder="请输入药品名字" >
						</div>
						<label for="drugName" class="col-sm-2 control-label">药品数量</label>
						<div class="col-sm-4">
							<input type="text" class="form-control"  name="detail.detnumb"   placeholder="请输入药品名字" >
						</div>
				</div>
				<div class="form-group">
						
						<label for="drugSpell" class="col-sm-2 control-label">药品的转存状态</label>
						<div class="col-sm-4">
							<select class="form-control"  name="detail.unloading.unlstate">
								<option>待审批</option>								
							</select>
						</div>
				</div>	
				<div class="form-group">
						
						<label for="drugSpell" class="col-sm-2 control-label">操作人</label>
						<div class="col-sm-4">
							<select class="form-control"  name="detail.unloading.unlname">
								<option>小毛</option>
								<option>小路</option>
								<option>大路</option>
							</select>
						</div>
				</div>		
    			<div class="form-group">
						
						<div class="col-sm-offset-4  col-sm-2">
							<input type="submit" class="btn btn-primary " id="btnSave"    value="提交" >
							
						</div>
						<div class="col-sm-2">
							<input type="button" class="btn btn-primary"  id="btnCancel"   value="取消" >
							
						</div>
					
				</div>
    			</form>
    		</div>
    	</div>
  </body>
</html>
