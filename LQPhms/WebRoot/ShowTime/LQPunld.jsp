<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LQPunld.jsp' starting page</title>
    
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
  <script>

	
	//查询所有并分页
	function findAll(curPage){
		//console.log(curPage);
		//请求的页面地址
		var url="${pageContext.request.contextPath}/findunld.action"
		var min=$("#min").val();//获取要查询的参数的 值
		var max=$("#max").val();//获取要查询的参数的 值
		var postData={"pager.curPage":curPage};//默认情况下只传递当前页码值
		if($.trim(min).length>0){//如果查询的关键字不为空
			postData["unld.unldate"]=min;//给对象属性赋值					
		   postData["unld.unldate"]=max;
		}
		//alert(JSON.stringify(postData));
		 $.ajax({
		        url:url,
		        data:postData,//绑定要给后台提交的数据
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
		        		tr+="<td>"+obj.dsrId+"</td>";
		        		tr+="<td>"+obj.unlId+"</td>";
		        		tr+="<td>"+obj.unldate+"</td>";
		        		tr+="<td>"+obj.unlstate+"</td>";
		        		tr+="<td>"+obj.unlname+"</td>";
		        		tr+="<td>"+obj.dsrSumNumber+"</td>";
		        		tr+="<td><input data-toggle='modal' data-target='#myModal' type='button' value='修改' id="+obj.unlId+" class='update btn btn-default' />"
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
		
		//根据角色关键字进行查询操作
		$(function(){
			$("#btnQuery").click(function(){
				findAll(1);
			});
		});
		
		$(function(){
			//动态绑定单击事件
			$("#tbody").on("click",".update",function(){
				var drugId=this.id;
				$.ajax({
			        url:"${pageContext.request.contextPath}/find.action",
			        data:{
                             null,		       	
			        },
			        dataType:"json",
			        type:"post",
			        success:function(data){			        	
						$("#drugdate").val(data.drugdate);
						findAll($("#curPage").html());//加载数据
			        }
		      });
			});
		});
	</script>
  <body>
    <div class="container">
    <!-- 查询表单 -->
<form class="form-horizontal"  role="form" id="keyRoleForm">
	<div class="form-group">
		<label for="unldate" class="col-sm-2 control-label">入房时间</label>
		<div class="col-sm-4">
			<input type="date" class="form-control" id="min" name="min"  placeholder="请输入时间" >
		</div>
	</div>
	<div class="form-group">
		<label for="unldate" class="col-sm-2 control-label">入房时间</label>
		<div class="col-sm-4">
			<input type="date" class="form-control" id="max" name="max"   placeholder="请输入时间" >
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-4">
			<input type="button" class="form-control" value="查询"  id="btnQuery">
		</div>
	</div>
	</form>
<!-- 数据显示表格 -->
<table class="table">
  <caption>角色列表</caption>
  <thead>
    <tr>
         <th>药房编号</th>
		  <th>转存流水号</th>
			<th>时间</th>
			<th>状态</th>
			<th>操作人</th>
			<th>kucun</th>
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
  </div>
  </body>
</html>
