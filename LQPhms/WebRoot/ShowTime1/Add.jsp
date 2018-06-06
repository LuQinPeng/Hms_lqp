<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Add.jsp' starting page</title>
    
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
  <form class="form-horizontal"  action="saveBydrug.action" method="post" role="form" id="stockForm">
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
<div><select class='easyui-combogrid'  style="width:100px" name='list["+i+"].drugId' id='drug'></select></div>
  </body>
</html>
<script>
	var i=0;
	$("#btnAdd").click(function(){
		
		var tr="<tr><td><select class='easyui-combogrid' style='width:220px'  name='list["+i+"].drugId' id='drug"+i+"'></select></td>"
		+"<td><input type='text' name='list["+i+"].drugNum'/></td>"
		+"<td><input type='text' name='list["+i+"].inPrice'/></td>"
		$("#tbody").append(tr);
				
		//绑定组合下拉框
		$("#drug"+i).combogrid({
			panelWidth: 500,
			idField: 'drugId',
			textField: 'drugName',
			url: '${pageContext.request.contextPath}/find.action?pager.curPage=1',
			method: 'get',
			columns: [[
				{field:'drugId',title:'药品编号',width:80},
				{field:'drugName',title:'药品名称',width:120},
				{field:'drugSpell',title:'拼音码',width:80,align:'right'},
				{field:'drugSpec',title:'规格',width:80,align:'right'},
			]],
			fitColumns: true,
			label: 'Select Item:',
			labelPosition: 'left'
		});
		
		i++;//行号增加
	});
		
	$("#btnSave").click(function(){
		//$("#stockForm").submit();//同步提交表单
		$.ajax({
			url:"${pageContext.request.contextPath}/saveBydrug.action",
			data:$("#stockForm").serialize(),
			dataType:"json",
			type:"post",
			success:function(data){
				alert(data);
			}			
		});
	});
</script>
