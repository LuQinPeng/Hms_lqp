<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
  <head>
    <base href="<%=basePath%>">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap-theme.min.css">
	

	<script src="${pageContext.request.contextPath}/resource/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resource/bootstrap/js/bootstrap.min.js"></script>
	
	<script>
	function test(){
		$(".total").each(function(){
						
		});
		
	}
	
	//查询所有并分页
	function findAll(curPage){
		//请求的页面地址
		var url="${pageContext.request.contextPath}/find.action"
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
		        		tr+="<td>"+obj.drugId+"</td>";
		        		tr+="<td>"+obj.drugName+"</td>";
		        		tr+="<td>"+obj.drugSpell+"</td>";
		        		tr+="<td>"+obj.drugSpec+"</td>";
		        		tr+="<td>"+obj.drugPrice+"</td>";
		        		tr+="<td>"+obj.state+"</td>";
		        		tr+="<td>"+obj.drugdate+"</td>";
		        		 tr+="<td><input data-toggle='modal' data-target='#myModal' type='button' value='修改' id="+obj.drugId+" class='update btn btn-default' />"
		        		/*tr+="<input type='button' value='删除' id="+obj.drugId+" class='delete btn btn-default'/>"; */

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
				        url:"${pageContext.request.contextPath}/saveOrUpdate.action",
				        data:{
				        	"drugSD.drugId":$("#drugId").val(),
				        	"drugSD.drugName":$("#drugName").val(),
				        	"drugSD.drugSpell":$("#drugSpell").val(),
				        	"drugSD.drugSpec":$("#drugSpec").val(),
				        	"drugSD.drugPrice":$("#drugPrice").val(),
				        	"drugSD.state":$("#state").val(),
				        	"drugSD.drugdate":$("#drugdate").val(),
				        
				        },
				        dataType:"text",
				        type:"post",
				        success:function(data){
				        	console.log(data);
				        	if(data.state>0){
				        		findAll(1);
				        		//清空数据
				        		$("#drugId").val("");
				        		$("#drugName").val("");
				        		$("#drugSpell").val("");
				        		$("#drugSpec").val("");
				        		$("#drugPrice").val("");
				        		$("#state").val("");
				        		$("#drugdate").val("");
			
				        	}
				        }
			      });
			});
		});  
		
		$(function(){
			//动态绑定单击事件
			$("#tbody").on("click",".update",function(){
				var drugId=this.id;
				$.ajax({
			        url:"${pageContext.request.contextPath}/findById.action",
			        data:{
			        	"drugSD.drugId":drugId,
			        },
			        dataType:"json",
			        type:"post",
			        success:function(data){
			        	$("#drugId").val(data.drugId);
						$("#drugName").val(data.drugName);
						$("#drugSpell").val(data.drugSpell);
						$("#drugSpec").val(data.drugSpec);
						$("#drugPrice").val(data.drugPrice);
						$("#state").val(data.state);
						$("#drugdate").val(data.drugdate);
						findAll($("#curPage").html());//加载数据
			        }
		      });
			});
		});
	</script>
  </head>
  
  <body>
  <div class="container">  
	<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
	录入操作
	</button>
	<!-- 模态框弹出录入内容 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="modalTitle1" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times; <!-- 关闭按钮 -->
				</button>
				<h4 class="modal-title" id="modalTitle1">
					录入角色
				</h4>
			</div>
			<div class="modal-body">
<form class="form-horizontal"  role="form" id="roleForm">
	<div class="form-group">
		<label for="roleName" class="col-sm-2 control-label">药品名字</label>
		<div class="col-sm-4">
			<input type="hidden" class="form-control" id="drugId" name="drug.drugId"  placeholder="请输入角色编号" >
				<input type="text" class="form-control" id="drugName"  name="drug.drugName"  placeholder="请输入药品名字" >
		</div>
	</div>
	<div class="form-group">
		<label for="roleName" class="col-sm-2 control-label">药品拼音码</label>
	<div class="col-sm-4">
			<input type="text" class="form-control" id="drugSpell" name="drug.drugSpell"  placeholder="药品拼音码" >
	</div>
	</div>
	<div class="form-group">
				<label for="roleName" class="col-sm-2 control-label">规格单位</label>
	<div class="col-sm-4">
			<input type="text" class="form-control" id="drugSpec"  name="drug.drugSpec"  placeholder="规格单位" >
	</div>
	</div>
	<div class="form-group">
		<label for="roleName" class="col-sm-2 control-label">药品单价</label>
	<div class="col-sm-4">
			<input type="text" class="form-control" id="drugPrice" name="drug.drugPrice"  placeholder="药品单价" >
	</div>
	</div>
	<div class="form-group">
		<label for="roleName" class="col-sm-2 control-label">审批了吗</label>
	<div class="col-sm-4">
			<input type="text" class="form-control" id="state" name="drug.state"  placeholder="审批了吗" >
	</div>
	</div>
	<div class="form-group">
			<label for="roleName" class="col-sm-2 control-label">请输入时间</label>			
	<div class="col-sm-4">
			<input type="date" class="form-control" id="drugdate" name="drug.drugdate"  placeholder="请输入时间" >
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
  <caption>药品明细查询列表</caption>
  <thead>
    <tr>
      <th>编号</th>
      <th>药品名称</th>
      <th>药品拼音码</th>
       <th>规格单位</th>
      <th>药品单价</th>
      <th>审批状态</th>
       <th>日期</th>    
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