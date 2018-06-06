<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DrugrepertoryUpdate.jsp' starting page</title>
    
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

    <%-- <select value="${param['housetypeid']}"  name="hf.housetype.id">
    			<option value="1">桔梗</option>
    			<option value="2">犬夜叉</option>
    			<option value="3">柯南</option>
    		</select><br/> --%>
   <div>
   <form action="updateByunld.action" method="post">
    <input type="text" value="${param['unldate']}" name="unld.unldate" /><br/>
   <input type="text" value="${param['unlstate']}" name="unld.unlstate" /><br/>
   <input type="text" value="${param['unlname']}" name="unld.unlname" /><br/>
    <input type="submit" value="修改"/> 
   </form>
   </div>
  </body>
</html>
