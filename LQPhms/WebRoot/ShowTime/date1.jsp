<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'date1.jsp' starting page</title>
    
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
	<script>
	//查询所有并分页
	function findAll(curPage){
		//请求的页面地址
		var url="${pageContext.request.contextPath}/findFY1.action"
		 $.ajax({
		        url:url,
		        data:{"pager.curPage":curPage},
		        dataType:"json",
		        type:"post",
		        ansy:false,
		        success:function(data){
		        	$("#tbody").html("");//清空内容数据
		        	var ary=data.list;
		        	//$.each(ary,function(i,n){
		        	//});
		        	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象	        		
		        		var tr="<tr>";
		        		tr+="<td>"+obj.unldate+"</td>";
		        		tr+="<td>"+obj.unlstate+"</td>";
		        		tr+="<td>"+obj.unlname+"</td>";
		        		/* tr+="<td><input data-toggle='modal' data-target='#myModal' type='button' value='修改' id="+obj.drugId+" class='update btn btn-default' />"
		        		tr+="<input type='button' value='删除' id="+obj.drugId+" class='delete btn btn-default'/>"; */
		        		tr+="</tr>";
		        		$("#tbody").append(tr);//追加行
		        	}
		        	//重新初始化分页链接
		        	$("#curPage").html(data.curPage);
		        	$("#totalPages").html(data.totalPages);
		        	$("#first").attr("data",data.first);
		        	$("#prev").attr("data",data.prev);
		        	$("#next").attr("data",data.next);
		        	$("#last").attr("data",data.last);
		        	$("#txtCurPage").val(data.curPage).attr("max",data.last);
		        }
	      });
	}
	
	//改变页面
	function changePage(obj){
		var page=$(obj).attr("data");//取出data属性值
		findAll(page);
	}
	
	//跳转到指定页面
	function gotoPage(page){
		var page=$("#txtCurPage").val();
		findAll(page);
	}
		//页面加载触发
	$(function(){
			findAll(1);}
			);
	</script>
  </head>
  
  <body>
 <%--    <table>

   <c:forEach items="${a }" var="s">
   <tr>
  		<td>${s[0] }</td>
  		<td>${s[1] }</td>
  		<td>${s[2] }</td>
  		<td>${s[3] }</td>
  		<td>${s[4] }</td>
  		<td>${s[5] }</td>
  		<td>${s[6] }</td>
  		  	</tr>
  	</c:forEach>

  	  </table>  --%>
  -----------------------------------------------
  <table class="table">
  <caption>药品明细查询列表</caption>
  <thead>
    <tr>
      <th>转存时间</th>
      <th>操作状态</th>
      <th>操作人</th>  
    </tr>
  </thead>
  <tbody id="tbody">
  </tbody>
</table>
 <ul class="pager" >
 	<li>
 	当前页:<span id="curPage"></span>总页数:<span id="totalPages"></span>
 	</li>
 	<li><a  id="first" onclick="changePage(this)">首页</a></li>
 	<li><a  id="prev" onclick="changePage(this)">上一页</a></li>
 	<li><a  id="next" onclick="changePage(this)">下一页</a></li>
 	<li><a  id="last"  onclick="changePage(this)">尾页</a></li>
 	<li><input type="number"  id="txtCurPage"  min="1" max="10"></input><input type="button" value="go" onclick="gotoPage()"/></li>
  </ul> 	   	  	  
  </body>
</html>
