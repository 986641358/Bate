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
<title>测试结果记录</title>
</head>
<body>
<blockquote class="layui-elem-quote layui-text" style="margin: 15px 0 15px 15px;"> 测试结果记录</blockquote>
<div style="margin-left:15px">
	    <div id="content">
	    <fieldset class="layui-elem-field" style="margin-top: 2%">
		   	<legend>搜索查询</legend>
		   	  <div class="layui-form-item" style="float:left;margin:16px;">
				    <label class="layui-form-label">记录ID</label>
			    	<div class="layui-input-inline">
				        <input type="text" name=inputName id="inputName" required="required" autocomplete="off" class="layui-input" placeholder="请输入要查询的记录ID">
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
			<table class="layui-hide" id="caseResults" lay-filter="caseResults"></table> 
		</div>
</div>
<!-- 是否请求成功 --> 
<script type="text/html" id="issuccess">
	 {{#  if( d.issuccess == 0){ 	}}  
            	失败 
     {{#  }else{ 				 	}}
				成功
	 {{#  }							}}  
</script>
<!-- 是否请求成功 --> 
<script type="text/html" id="isadopt">
	 {{#  if( d.isadopt == 0){ 	}}  
            	不通过 
     {{#  }else{ 				 	}}
				通过 
	 {{#  }							}}  
</script>
</body>
<script type="text/javascript">
layui.use(['form','table','util','layer'], function(){
	var table = layui.table,
	$ = layui.jquery,
	util= layui.util,
	layer = layui.layer,
	form = layui.form;
	table.render({
		elem:'#caseResults',
		url:'list.html',
		method:'post',
		limit:10,
	    limits:[10,20,30,],
	    even:true,
	    cols: [[
			{type:'checkbox'},
	 	    {field:'id', title: '编号', width:90,sort: false},
	 	    {field:'cid', title: '用例ID',width:110},
	 	    {field:'issuccess', title: '请求成功',width:110,templet:'#issuccess'},
	 	    {field:'actualresults', title: '实际结果',width:540},
	 	    {field:'expectedresults',title:'预期结果',width:540},
	 	    {field:'isadopt', title: '是否执行通过',width:110,templet:'#isadopt'},
	 	    {field:'starttime', title: '执行时间',width:210,sort: true,templet: '<div>{{layui.util.toDateString(d.starttime)}}</div>'}, //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
	 	    {fixed: 'right', title:'工具栏',align:'center',width:90,toolbar: '#categoryToolBar'},
		]],
		id:"caseResults",
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