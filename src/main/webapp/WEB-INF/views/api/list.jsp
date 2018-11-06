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
<title>API</title>
</head>
<body>
<blockquote class="layui-elem-quote layui-text" style="margin: 15px 0 15px 15px;"> API管理</blockquote>
<div style="margin-left:15px">
	    <div id="content">
	    <fieldset class="layui-elem-field" style="margin-top: 2%">
		   	<legend>搜索查询</legend>
		   	  <div class="layui-form-item" style="float:left;margin:16px;">
				    <label class="layui-form-label">API名称</label>
			    	<div class="layui-input-inline">
				        <input type="text" name=inputName id="inputName" required="required" autocomplete="off" class="layui-input" placeholder="请输入要查询的API名称">
				    </div>
				    
				    <button class="layui-btn" id="account" data-type="reload" lay-submit lay-filter="selectList">
				 		<i class="layui-icon">&#xe615;</i>查询   
				   </button>
				    <button class="layui-btn" id="account" data-type="reload" lay-submit lay-filter="cateAdd">
				    	<i class="layui-icon">&#xe61f;</i>添加
				    </button>
			  </div>
		
		</fieldset>
		</div>
		<div id="publicParList">
			<!-- 数据表格 -->
			<table class="layui-hide" id="apiList" lay-filter="apiList"></table> 
		</div>
</div>
</body>
<script type="text/javascript">
layui.use(['form','table','util','layer'], function(){
	var table = layui.table,
	$ = layui.jquery,
	util= layui.util,
	layer = layui.layer,
	form = layui.form;
	table.render({
		elem:'#apiList',
		url:'/api/byPage/list.html',
		method:'post',
		limit:30,
	    limits:[30,60,90,],
	    even:true,
	    cols: [[
			{type:'checkbox'},
	 	    {field:'id', title: '编号', width:90,sort: false},
	 	    {field:'name', title: 'API名称',width:820},
	 	    {field:'method', title: '请求命令方法',width:820},
	 	    {fixed: 'right', title:'工具栏',align:'center',toolbar: '#categoryToolBar'},
		]],
		id:"apiList",
		page:{
			layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'], //自定义分页布局
			groups: 1,
			first: false,//不显示首页
			last: false,//不显示尾页
		}
	});
	
});
</script>
</html>