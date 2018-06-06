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
$(function(){
       $("body").on("click",".chaxun",function(){
        var drugName= $(this).parent().next().children();
        var drugSpell= $(this).parent().next().next().children();
        var drugSpec= $(this).parent().next().next().next().children();
        var drugPrice= $(this).parent().next().next().next().next().children();
       /*  var drugPrice= $(this).parent().next().next().next().next().next().children(); */
      	var drugNames =$(this).parent().prev().children().val();
  	alert(drugNames); 	
  		var url="${pageContext.request.contextPath}/finddrug1.action"
  	$.ajax({ 
  		url : url,
 		type : "post",
		data : {
  			'drug.drugName' : drugNames
		},
		dataType : 'json',
		success : function(data) {
			/* 获取数据 */
			/* 填充患者信息 */	
			var a=data.findBydrug;			
			drugName.val(a[0].drugName);
			drugSpell.val(a[0].drugSpell);
			drugSpec.val(a[0].drugSpec);
			drugPrice.val(a[0].drugPrice);
			}
			});
  });
})

	</script>
	
	<body>
	<div>
	
		<div class="row clearfix">
		<center><h2>药库转药房</h2></center>
			<div class="col-md-12 column">
			
               <ul class="nav nav-pills">
						<button class="ins">添加一个</button>
						
					<li>
					<form action="savedetail.action">
					<input type='submit' value='提交'/>
					         <table class="table table-condensed">
							      <tr>	
							      <td>操作</td>
								<td>查询</td>							
								<td>姓名</td>
								<td>拼音码</td>
								<td>单位</td>
								<td>价格</td>
								<td>操作时间</td>
								<td>状态</td>
								<td>操作人</td>
								<td>转存数量 </td>
								<td>操作</td>
							</tr>						
		<tr class="names">
   		     <td><input type="text" class="drugName1"  placeholder="药品名称" /></td>
				<td><input type="button" class="chaxun"  value="chax" /></td>
			  <td><input type="text" class="drugName" readonly="readonly " name="details[0].drug.drugName" size="5"> </td>
			 <td><input type="text" class="drugSpell" readonly="readonly" name="details[0].drug.drugSpell" size="5"></td> 
			  <td><input type="text" class="drugSpec" readonly="readonly" name="details[0].drug.drugSpec" size="5"></td> 
			  <td><input type="text" class="drugPrice" readonly="readonly" name="details[0].drug.drugPrice" size="5"></td>
			 <td>  <input type="date" name="details[0].unloading.unldate" />  </td> 
			  <td> <input type="text" name="details[0].unloading.unlstate" />  </td> 
			  <td> <input type="text" name="details[0].unloading.unlname" />   </td>
			  <td> <input type="text" name="details[0].detnumb" />  </td> 
			   <td></td>  
   		  </tr>   		
         </table>  
		</form> </li></ul>
		 </div></div></div>
</body>
 <script type="text/javascript">
  	/* 追加事件 */
  	var i = 1;
  	function fnins(){
  		var tr = "<tr id='"+i+"'>"
  			tr+="<td><input type='text' class='drugName1' placeholder='药品名称' /></td>";
  			tr+=" <td><input type='button' class='chaxun'  value='chax' /></td>";
  			tr+="<td><input type='text' class='drugName' readonly='readonly' name='details["+i+"].drug.drugName' size='5'></td>";
  			tr+="<td><input type='text' class='drugSpell' readonly='readonly' name='details["+i+"].drug.drugSpell' size='5'></td>";
  			tr+="<td><input type='text' class='drugSpec' readonly='readonly' name='details["+i+"].drug.drugSpec' size='5'></td>";
  			tr+="<td><input type='text' class='drugPrice' readonly='readonly' name='details["+i+"].drug.drugPrice' size='5'></td>";
  			tr+="<td><input type='date' name='details["+i+"].unloading.unldate' /> </td>";
  			tr+="<td><input type='text' name='details["+i+"].unloading.unlstate' /></td>";
  			tr+="<td><input type='text' name='details["+i+"].unloading.unlname' /></td>";
  			tr+="<td><input type='text' name='details["+i+"].detnumb' /></td>";		
  			tr+="<td><a href='Javascript:void(0)' class='des' onclick='fndes("+i+")'>删除</a></td>";
  		    tr+="<td></th>";	  			
  			tr+="</tr>";
  		$(".names").after(tr);//追加一行
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
