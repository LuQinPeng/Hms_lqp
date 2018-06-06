<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AddDuotiao.jsp' starting page</title>
    
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
  
<button class="ins">添加一个</button>
  	<form action="saveBydrug.action" method="post">
   		<p class="names">
   		    <input type="text" name="detail[0].detnumb" />   
   		 </p>
   		<input type="submit" value="提交"/>
   	</form>
  </body>
  <!-- 追加多条添加 -->
  <script type="text/javascript">
  	/* 追加事件 */
  	var i = 1;
  	function fnins(){
  		var p = "<p id='"+i+"'>"
  			p+="<input type='text' name='detail["+i+"].detnumb' />";
  			p+="<a href='Javascript:void(0)' class='des' onclick='fndes("+i+")'>删除</a>";
  			p+="</p>";
  		$(".names").after(p);//追加一行
  		i++;
  	}
  	/* 移除追加事件 */
  	function fndes(pid){
  		$("#"+pid).remove();
  	}
  	/* 追加控制 */
  	$(".ins").click(function(){
  		fnins();
  	});
  </script>
</html>

