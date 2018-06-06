<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DetailfindAll.jsp' starting page</title>
    
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
		//console.log(curPage);
		//请求的页面地址
		var url="${pageContext.request.contextPath}/findAll.action"
		var key=$("#keyRoleName").val();//获取要查询的参数的 值
		var postData={"pager.curPage":curPage};//默认情况下只传递当前页码值
		if($.trim(key).length>0){//如果查询的关键字不为空
			postData["detail.drug.drugName"]=key;//给对象属性赋值
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
		        		tr+="<td>"+obj.detId+"</td>";
		        		tr+="<td>"+obj.drugName+"</td>";
		        		tr+="<td>"+obj.unldate+"</td>";
		        		tr+="<td>"+obj.detnumb+"</td>";
		        		tr+="<td><input data-toggle='modal' data-target='#myModal' type='button' value='审核' id="+obj.detId+" class='update btn btn-default' />"		        	
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
			findAll(1);
			$("#save").click(function(){
				 $.ajax({
				        url:"${pageContext.request.contextPath}/updateByDetail.action",
				        data:{
				            "detail.detId":$("#detId").val(),
				        	"detail.drug.drugName":$("#drugName").val(),
				        	"detail.unloading.unldate":$("#unldate").val(),
				        	"detail.detnumb":$("#detnumb").val()
				        },
				        dataType:"json",
				        type:"post",
				        success:function(data){
				        	 console.log(data);
				        	if(data.state>0){
				        		findAll(1);
				        		//清空数据
				        		$("#detId").val("");
				        		$("#drugName").val("");
				        		$("#unldate").val("");
				        		$("#detnumb").val("");
				        	}
				        }
			      });
			});
		}); 
		$(function(){
			//动态绑定单击事件
			$("#tbody").on("click",".update",function(){
				var detId=this.id;				
				$.ajax({
			        url:"${pageContext.request.contextPath}/findById.action",
			        data:{
			        	"detail.detId":detId,			        	
			        },			      
			        dataType:"json",
			        type:"post",
			        success:function(data){			        
			             $("#detId").val(data.detId);			             			
			        	$("#drugName").val(data.drugName);
 			        	 alert(data.drugName); 
						$("#unldate").val(data.unldate);
						$("#detnumb").val(data.detnumb);
						findAll($("#curPage").html());//加载数据
			        }
		      });
			});
		});
		//根据角色关键字进行查询操作
		$(function(){
			$("#btnQuery").click(function(){
				findAll(1);
			});
		});
		</script>
  </head>
  
  <body>
    <div class="container">
    
    <!-- 模态框弹出录入内容 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="modalTitle1" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times; <!-- 关闭按钮 -->
				</button>
				<h4 class="modal-title" id="modalTitle1">
					审批详情
				</h4>
			</div>
			<div class="modal-body">
<form class="form-horizontal"  role="form" id="roleForm">
	<div class="form-group">
	<label for="detId" class="col-sm-2 control-label">mingxi编号</label>
		<div class="col-sm-4">
			 <input type="text" class="form-control" id="detId"   placeholder="mingxi编号" > 
		</div>
	</div>
	<div class="form-group">
		<label for="drugName" class="col-sm-2 control-label">药品名字</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="drugName"   placeholder="药品名字" >
		</div>
	</div>
	<div class="form-group">
		<label for="detnumb" class="col-sm-2 control-label">转存数量</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="detnumb"   placeholder="转存数量 ">
		</div>
	</div>
	<div class="form-group">
		<label for="unldate" class="col-sm-2 control-label">转存时间</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="unldate"   placeholder="转存时间 ">
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
    
   <form class="form-horizontal"  role="form" id="keyRoleForm">
	<div class="form-group">
		<label for="roleName" class="col-sm-2 control-label">角色名字</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="keyRoleName"   placeholder="请输入角色名字" >
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
      <th>编号</th>
      <th>yaopin名称</th>
      <th>转存时间</th>
      <th>转存数量</th>
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
