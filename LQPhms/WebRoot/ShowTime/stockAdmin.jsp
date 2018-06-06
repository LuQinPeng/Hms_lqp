<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>库存管理页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<script src="${pageContext.request.contextPath}/resource/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resource/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap-theme.min.css">

  </head>
  <body>
  <div class="container">
  <form class="form-horizontal"  action="stock_test1.action" method="post" role="form" id="stockForm">
	<div class="form-group">
		<label for="roleName" class="col-sm-2 control-label">仓库编号</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" name="st.store.storeId"   placeholder="请输入仓库" >
		</div>
	</div>
	<div class="form-group">
		<label for="description" class="col-sm-2 control-label">操作员</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" name="st.operator"   placeholder="请输入操作员 ">
		</div>
	</div>
	<div class="form-group">
		<input type="button" value="添加行" id="btnAdd"/><input type="button" value="保存" id="btnSave"/>
	</div>
	<table class="table">
  <caption>角色列表</caption>
  <thead>
    <tr>
      <th>药品编号</th>
      <th>数量</th>
      <th>单价</th>
    </tr>
  </thead>
  <tbody id="tbody">

  </tbody>
</table>

	</form>
  
	


 
  
</div>

  </body>
</html>
<script>
	var i=0;
	$("#btnAdd").click(function(){
		var tr="<tr><td><input type='text' name='list["+i+"].drug.drugId'/></td>"
		+"<td><input type='text' name='list["+i+"].drugNum'/></td>"
		+"<td><input type='text' name='list["+i+"].inPrice'/></td>"
		$("#tbody").append(tr);
		i++;//行号增加
	});
	
	$("#btnSave").click(function(){
		//$("#stockForm").submit();//同步提交表单
		$.ajax({
			url:"${pageContext.request.contextPath}/stock_test1.action",
			data:$("#stockForm").serialize(),
			dataType:"json",
			type:"post",
			success:function(data){
				alert(data);
			}			
		});
	});
</script>

