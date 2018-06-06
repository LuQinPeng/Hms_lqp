<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
  <style type="text/css">
  #up{
  	display: none;
  }
  body {
	margin: 0px;
	padding: 0px;
}

#zzc {
	width: 100%;
	height: 100%;
	position: fixed;
	z-index: 5;
	background-color: #000;
	opacity: 0.3 !important;
	margin-top: -210px;
	display: none;
}
#up {
	position: absolute;
	display: none;
	z-index: 10;
}
  </style>
  </head>
  
  
  <body>
  <a href="PersonQueryServlet" id="cha">查</a>
  <div id="divv"></div>
   <table border="1px solid color red">
   		<tr>
   			<td>人员编号</td>
   			<td>人员姓名</td>
   			<td>户口所在地</td>
   			<td>人员年龄</td>
   			<td>家庭地址</td>
   			<td>操作</td>
   			
   		</tr>
   		
   		<c:forEach items="${list }" var="d" varStatus="dd">
   			<tr>
   			<c:forEach items="${d }" var="a" varStatus="aa">
   					<td id="a${aa.index }">
   						${a }
   					</td>
   				</c:forEach>
   					<td>
   					<a id="bianji${dd.index }" onclick ="bj()">编辑</a>
   					</td>
   			</tr>
   		</c:forEach>
   		</table>
   		<div id="zzc"></div>
   		<div id="up">
   			<form id="form">
   				人员编号:<input type="text" name="person_id" /><br/>
   				人员名称:<input type="text" name="person_name" /><br/>
   				户口所在地ID:<input type="text" name="person_area_id" /><br/>
   				人员年龄:<input type="text" name="person_age" /><br/>
   				家庭地址:<input type="text" name="person_address" /><br/>
   				地区编号:<input type="text" name="area_id" /><br/>
   				地区名称:<input type="text" name="area_name" /><br/>
   				<input type="button" id="button" value="提交" />
   			</form>
   		</div>
  </body>
  <script type="text/javascript">
  	function bj(){
  		$("#up").css("display","block");
  		$("#zzc").css("display","block");
  	}
  	$("#button").click(function(){
  		$("#up").css("display","none");
  		$("#zzc").css("display","none");
  	});
  	$("#button").click(function(){
  		$.ajax({
  			url:"PersonUpServlet",
  			type:"post",
  			data:$("#form").serialize(),
  			dataType:"json",
  			success:function(data){
				  alert("提交成功");
  			}
  		});
  	});
  </script>
</html>
