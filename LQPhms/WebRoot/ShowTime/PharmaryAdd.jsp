<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Pharmary.jsp' starting page</title>
    
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
	<script src="${pageContext.request.contextPath}/resource/jquery-1.11.3.min.js" type="text/javascript"></script>	
	<script src="${pageContext.request.contextPath}/resource/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

<script type="text/javascript">
/* 获取数据 */
function getdata() {

  	var drugName = $(".drugName1").val();
  	var url="${pageContext.request.contextPath}/finddrug.action"
  	$.ajax({ 
  		url : url,
 		type : "post",
		data : {
  			'drug.drugName' : drugName
		},
		dataType : 'json',
		success : function(data) {
			/* 清空追加数据 */
			$(".drugName").val("");
			$(".drugSpell").val("");
			$(".drugUnit").val("");
			$(".drugSpec").val("");
			$(".drugPrice").val("");
			/* 获取数据 */
			var a=data.findBydrug;			
			/* 填充患者信息 */
			 $(".drugName").val(a[0].drugName);
			$(".drugSpell").val(a[0].drugSpell);
			$(".drugUnit").val(a[0].drugUnit);
			$(".drugSpec").val(a[0].drugSpec);
			$(".drugPrice").val(a[0].drugPrice);
			}
			});
			}
	</script>
	
	<body>
	<div>
		<div class="row clearfix">
		<center><h2>药库转药房</h2></center>
			<div class="col-md-12 column">
               <ul class="nav nav-pills">
					<li class="active"><input type="text" class="drugName1"
						placeholder="请输入药品名称" />
						<button class="buttic btn btn-default" onclick="getdata()">查询</button></li>
						
					<li><form action="savepharmary.action"><table class="table table-condensed">
							<tr>
								
								<th>姓名</th>
								<th>拼音码</th>
								<th>单位</th>
								<th>价格</th>
								<th>状态</th>
								<th>操作人</th>
								<th>操作时间</th>
								<th>转存数量</th>
								<th>转存cangku </th>
								<th>操作</th>
							</tr>
							<tr class="show_input">
								<td><input type="text" class="drugName" readonly="readonly" size="5"></td>
								<td><input type="text" class="drugSpell" readonly="readonly" size="5"></td>
								<td><input type="text" class="drugSpec" readonly="readonly" size="5"></td>
								<td><input type="text" class="drugPrice" readonly="readonly" size="5"></td>
								<td><select name="unld.unlstate">
							   			<option value="已审批">已审批</option>
							   			<option value="未审批">未审批</option>							   			
							   		</select></td>
							   		<td><select name="unld.unlname">
							   			<option value="小赵">小赵</option>
							   			<option value="小毛">小毛</option>							   			
							   		</select></td>
								<td><input type="date" name="unld.unldate" size="5"></td>								
								<td><input type="text" name="unld.unlnumber" size="5"></td>
								<td><select name="unld.drugstoragerep.dsrId">
							   			<option value="1">1号药房</option>
							   			<option value="2">2号药房</option>
							   			<option value="3">3号药房</option>
							   			<option value="4">4号药房</option>
							   			<option value="5">5号药房</option>
							   			<option value="6">6号药房</option>
							   			<option value="7">7号药房</option>
							   			<option value="8">8号药房</option>							   			
							   		</select></td>
								<td><input type="submit" value="提交"></td>
							</tr>
						</table></form></li>
				</ul>
				</div></div></div>
</body>
</html>
