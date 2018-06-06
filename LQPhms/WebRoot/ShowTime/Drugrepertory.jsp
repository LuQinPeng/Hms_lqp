<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Drugrepertory.jsp' starting page</title>
    
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
 <table class="table table-striped">
	<caption>转让明细</caption>
	<thead>
		<tr>
		<th>药房编号</th>
		<th>转存流水号</th>
			<th>时间</th>
			<th>状态</th>
			<th>操作人</th>
		</tr>
	</thead>
	<tbody>
          <c:forEach items="${datelist }" var="s">
          <tr>
         <td> ${s.dsrId }</td>
          <td> ${s.unlId }</td>
         <td> ${s.unldate }</td>
         <td> ${s.unlstate }</td>
         <td> ${s.unlname }</td>       
         <td> <a href="${pageContext.request.contextPath}/ShowTime/DrugrepertoryUpdate.jsp?unldate=${s.unldate }&unlstate= ${s.unlstate }&unlname= ${s.unlname }">修改</a></td>
       </tr>
          </c:forEach>            
  </tbody> 
  </table>
</body>
</html>