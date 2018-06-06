<%@  page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
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
	<!-- bootstrap3.0 -->
	<link rel="stylesheet" href="text/bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/css/bootstrap.min.css">  
	<script src="text/bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/jquery-2.0.0.min.js"></script>
	<script src="text/bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
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
    opacity:0.3;
    filter: alpha(opacity=30);
    display:none;
}

#log_window {
    width:500px;
    height:500px;
    background-color:white;    
    margin: auto;
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    display:none;
}
#submit1{
float: right;
}
/* 按钮动画 */
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
.lu{
  z-index: 9999999;
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
     <button class="button" style="vertical-align:middle"><span><a href="javascript:shield()">打开遮罩</a> </span></button>
    <button class="button" style="vertical-align:middle"><span><a href="javascript:shield()">打开遮罩</a> </span></button>
     <button class="button" style="vertical-align:middle"><span><a href="javascript:shield()">打开遮罩</a> </span></button>
     <button class="button" style="vertical-align:middle"><span><a href="javascript:shield()">打开遮罩</a> </span></button><br>
     <button class="button" style="vertical-align:middle"><span><a href="javascript:shield()">打开遮罩</a> </span></button>
		   
		<div id="test"></div>
		<div id="log_window" class="table-responsive" action="select.action">
		 
		 <a href="javascript:cancel_shield()"> <input type="submit" id="submit1" value="关闭" /></a>
		       
							<!-- 按钮触发模态框 -->
							<br/><button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
								<h6>添加</h6>
							</button>
							<!-- 模态框（Modal） -->
							<div class="modal fade"  id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" 
													aria-hidden="true">×
											</button>
											<h4 class="modal-title" id="myModalLabel">
												模态框（Modal）标题
											</h4> 
										</div>
										<div class="modal-body">
											按下 ESC 按钮退出。
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default" 
													data-dismiss="modal">关闭
											</button>
											<button type="button" class="btn btn-primary">
												提交更改
											</button>
										</div>
									</div>
								</div>
							</div>  
		<table class="table">
		<caption><center><h1>药品Unloading表</h1></center></caption>
			<tr>
				<th>unlId</th>
				<!-- <th>dsrId</th> -->
				<th>unldate</th>
				<th>unlstate</th>
				<th>unlNumber</th>
				<th>unlname</th>
				<th>操作</th>
				<th>操作</th>
			</tr>
</table>
		
  </body>
</html>
