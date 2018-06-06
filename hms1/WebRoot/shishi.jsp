<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shishi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="container">
  
  
	<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
	录入操作
	</button>
	<!-- 模态框弹出录入内容 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times; <!-- 关闭按钮 -->
				</button>
				<h4 class="modal-title" id="myModalLabel">
					录入角色
				</h4>
			</div>
			<div class="modal-body">
<form class="form-horizontal"  role="form" id="roleForm">
	<div class="form-group">
		<label for="roleName" class="col-sm-2 control-label">角色名字</label>
		<div class="col-sm-4">
			<input type="hidden" class="form-control" id="roleId"   placeholder="请输入角色编号" >
			<input type="text" class="form-control" id="roleName"   placeholder="请输入角色名字" >
		</div>
	</div>
	<div class="form-group">
		<label for="description" class="col-sm-2 control-label">角色描述</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="description"   placeholder="请输入角色描述 ">
		</div>
	</div>
	</form>

			</div>
			<div class="modal-footer">
				<button type="button" id="save" data-toggle='modal' data-target='#myModal' class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
	</div>
    
	<hr/>
	<table class="table">
  <caption>角色列表</caption>
  <thead>
    <tr>
      <th>编号</th>
      <th>名称</th>
      <th>描述</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody id="tbody">

  </tbody>
</table>

 <ul class="pager form-group" >
 	<li>
 	当前页:<span id="curPage"></span>总页数:<span id="totalPages"></span>
 	<a  id="first" onclick="changePage(this)">首页</a>
 	<a  id="prev" onclick="changePage(this)">上一页</a>
 	<a  id="next" onclick="changePage(this)">下一页</a>
 	<a  id="last"  onclick="changePage(this)">尾页</a>
 	<input type="text"  id="txtCurPage" ></input><input type="button" value="go" onclick="changePage(this)"/>
 	</li>
  </ul>
  
  <!-- 模态框 --> 
	<div class="modal fade" id="perModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
				  <h4 class="modal-title" id="myModalLabel">权限分配</h4>
				</div>
				<div class="modal-body" id="roleList">          									
				    <ul id="tree" class="ztree"></ul>
				</div>
				<div class="modal-footer">
					<button class="btn btn-default" data-dismiss="modal">关闭</button>
					<button class="btn btn-primary" id="subPre">保存</button>
				</div>
			</div>
		</div>
	</div> 
</div>
  </body>
</html>
