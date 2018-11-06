<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/layui/css/layui.css">
<script type="text/javascript" src="${ctx}/layui/layui.all.js"></script>
<title>添加公共参数</title>
</head>
<body>
<blockquote class="layui-elem-quote layui-text" style="margin: 15px 0 15px 15px;">添加公共参数 </blockquote>
<div style="margin-left:15px">
<fieldset class="layui-elem-field" style="margin-top: 2%">
	<legend>添加公共参数</legend>
	<div class="layui-field-box">
		<form class="layui-form layui-form-pane" action="">
			<div class="layui-form-item">
				<label class="layui-form-label"><span style="color:red;">*</span>测试地址</label>
					<div class="layui-input-block">
						<input type="text" name="testurl" id="testurl" lay-verify="required" placeholder="请输入测试地址 " autocomplete="off" class="layui-input" style="width:400px">
					</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label"><span style="color:red;">*</span>APPID</label>
					<div class="layui-input-block">
						<input type="text" name="appid" id="appid" lay-verify="required" placeholder="请输入APPID " autocomplete="off" class="layui-input" style="width:400px">
					</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label"><span style="color:red;">*</span>version</label>
					<div class="layui-input-block">
						<input type="text" name="version" id="version" lay-verify="required" placeholder="请输入版本号 " autocomplete="off" class="layui-input" style="width:400px">
					</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label"><span style="color:red;">*</span>secret</label>
					<div class="layui-input-block">
						<input type="text" name="staticsecret" id="staticsecret" lay-verify="required" placeholder="请输入私钥 " autocomplete="off" class="layui-input" style="width:400px">
					</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="checkmainbox">立即提交</button>
				</div>
			</div>					
		</form>
			
	</div>  	
</fieldset>
</div>
</body>
<script type="text/javascript">
layui.use(['layedit','form'],function(){
	var form = layui.form,
	layedit = layui.layedit;
	$ = layui.jquery;
	form.on('submit(checkmainbox)',function(data){
		var addData=data.field;
		$.post("add.html",addData,function(data){
			  console.log(data);
			  if(data.status == 1){
		  			layer.open({
		  				  content: '添加成功',
		  			}); 
		  		}else{
		  			layer.msg(data.msg, {icon: 2});
		  		}
		},"json")
		return false;
	});
});
</script>
</html>