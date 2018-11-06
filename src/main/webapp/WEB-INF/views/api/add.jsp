<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${ctx}/layui/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/layui/layui.all.js"></script>
<!-- <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<link rel="stylesheet" href="${ctx}/layui/css/layui.css">
<title>添加API</title>
</head>
<body>
<blockquote class="layui-elem-quote layui-text" style="margin: 15px 0 15px 15px;">添加API</blockquote>
<div style="margin-left:15px">
<fieldset class="layui-elem-field" style="margin-top: 2%">
	<legend>添加API</legend>
	<div class="layui-field-box">
		<form class="layui-form layui-form-pane" action="">
			<div class="layui-form" style="width:700px">
				<label class="layui-form-label"><span style="color:red;">*</span>API名称</label>
				<div class="layui-input-block" style="width:500px">
					<input type="text" name="name" id="name" lay-verify="required|name" placeholder="请输入API名称 " autocomplete="off" class="layui-input" style="width:350px">
				</div>
			</div>
			<br>
			<div class="layui-form" style="width:700px">
				<label class="layui-form-label"><span style="color:red;">*</span>命令方法</label>
				<div class="layui-input-block" style="width:500px">
					<input type="text" name="method" id="method" lay-verify="required|method" placeholder="请输入命令方法 " autocomplete="off" class="layui-input" style="width:350px">
				</div>
			</div>
			<br>
        	<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="checkmainbox">立即提交</button>
					<a href="/ym/admin/category/list.htm" class="layui-btn" id="return">返回列表</a>
				</div>
			</div>	
		</form>
			
	</div>  	
</fieldset>
</body>
<script type="text/javascript">
layui.use('form', function(){
	var form = layui.form;
	//监听提交
	form.on('submit(checkmainbox)', function(data){
		var addData=data.field;
		console.log(addData);
		$.post("add.html",addData,function(data){
			  if(data.status == 1){
		  			layer.open({
		  				  content: '添加API成功',
		  				 
		  			}); 
		  			 //清空表单
		  			 $("#name").val('');
					 $("#method").val('');
					 //添加完跳转至列表
					// window.location.href="/ym/admin/category/list.htm";
		  		}else{
		  			layer.msg(data.msg, {icon: 2});
		  		}
		},"json")
		return false;
	});
});
</script>
</html>