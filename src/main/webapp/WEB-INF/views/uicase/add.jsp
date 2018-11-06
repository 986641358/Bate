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
<title>添加测试用例</title>
</head>
<body>
<blockquote class="layui-elem-quote layui-text" style="margin: 15px 0 15px 15px;">添加测试用例 </blockquote>
<fieldset class="layui-elem-field" style="margin-top: 2%">
	<legend>添加测试用例</legend>
	<div class="layui-field-box">
		<form class="layui-form layui-form-pane" action="">
			<div class="layui-form-item" style="width:700px">
				<label class="layui-form-label"><span style="color:red;">*</span>API名称</label>
				<div class="layui-input-block" style="width:350px">
					<select id="apiid" name="apiid" lay-search="" style="width:350px">
  						<!-- 以上动态加载 -->
					</select>
				</div>
			</div>
			<div class="layui-form-item" style="width:700px">
				<label class="layui-form-label"><span style="color:red;">*</span>用例名称</label>
				<div class="layui-input-block" style="width:350px">
					<input type="text" name="casename" id=""casename"" lay-verify="required|method" placeholder="请输入用例名称 " autocomplete="off" class="layui-input" style="width:350px">
				</div>
			</div>
			<div class="layui-form-item" pane style="width:457px"> 
				<label class="layui-form-label">默认状态</label>
				<div class="layui-input-block" style="width:350px">
					<input type="checkbox" name="status" lay-skin="switch" lay-text="启用|禁用" value="1" checked lay-verify="required" style="width:350px">
				</div>
			</div>
			<br>
			<div class="layui-form-item-s" style="width:700px">
				<!-- 此处动态添加参数 -->
			</div>
			<a class="layui-btn" onclick="addInput()">添加</a>
        	<a class="layui-btn" onclick="getKeyValue()">获取key-value</a>
        	<button class="layui-btn" lay-submit lay-filter="checkmainbox">立即提交</button>	
		</form>	
	</div>  	
</fieldset>
<script>
	var text = 1;
	function addInput(){
		var input = $("<div class='layui-inline'><div class='layui-input-inline'><input type='text'name='key"+text+"' id='key"+text+"' placeholder='请输入KEY' lay-verify='required' autocomplete='off' class='layui-input'></div><div class='layui-input-inline'><input type='text' name='key"+text+"' id='key"+text+"' placeholder='请输入VALUE' lay-verify='required' autocomplete='off' class='layui-input'></div><div class='layui-input-inline'><a class='layui-btn removeclass' type='button' >删除</a></div><br><br></div>");
    	// append 表示添加在标签内， appendTo 表示添加在元素外尾
    	text++;
    	$(".layui-form-item-s").append(input);
    }
	function getKeyValue(){
		var str = "";
		$(".layui-form-item-s input[type='text']").each(function(){
			var value = $(this).val();  //这里的value就是每一个input的value值~
			str +=value+":"  
		});
		console.log(str.slice(0,str.length-1));
		return str.slice(0,str.length-1);
	}
     $("body").on("click",".removeclass", function(e){  
    	// remove text box  
        $(this).parent('div').parent('div').remove(); 
        return false;  
    })    
</script>
</body>
<script type="text/javascript">
layui.use('form', function(){
	var form = layui.form,
	$ = layui.jquery;
	form.render();
	//动态加载所有接口
	$.ajax({
		type:"POST",
		url:"/api/list.html",
		success:function(data){
			//将字符串转换成对象
		    var objectData=eval("("+data+")");
		    for(var i in objectData){             
		    	$("#apiid").append( "<option value="+objectData[i].id+">"+objectData[i].name+"</option>");
		        form.render();
		    }
		}
	});
	//监听提交
	form.on('submit(checkmainbox)', function(data){
		var addData=data.field;
		addData.parameters = getKeyValue();
		//var str = getKeyValue();
		console.log(addData.status);
		$.post("add.html",addData,function(data){
			  if(data.status == 1){
		  			layer.open({
		  				  content: '添加用例成功',	 
		  			}); 
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