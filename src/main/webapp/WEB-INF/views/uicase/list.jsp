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
<title>用例</title>
</head>
<body>
<blockquote class="layui-elem-quote layui-text" style="margin: 15px 0 15px 15px;"> 用例管理</blockquote>
<div style="margin-left:15px">
	    <div id="content">
	    <fieldset class="layui-elem-field" style="margin-top: 2%">
		   	<legend>搜索查询</legend>
		   	  <div class="layui-form-item" style="float:left;margin:16px;">
				    <label class="layui-form-label">用例名称</label>
			    	<div class="layui-input-inline">
				        <input type="text" name=inputName id="inputName" required="required" autocomplete="off" class="layui-input" placeholder="请输入要查询的API名称">
				    </div>
				    <div class="layui-btn-group demoTable">
					    <button class="layui-btn" id="account" data-type="reload" lay-submit lay-filter="selectList">
					 		<i class="layui-icon">&#xe615;</i>查询   
					   </button>
					    <button class="layui-btn" id="account" data-type="reload" lay-submit lay-filter="cateAdd">
					    	<i class="layui-icon">&#xe61f;</i>添加
					    </button>
					     <button class="layui-btn" id="account" data-type="getCheckData" lay-submit lay-filter="cateAdd">
					    	<i class="layui-icon">&#xe623;</i>批量执行选中
					    </button>
					</div>
			  </div>
		
		</fieldset>
		</div>
		<div id="publicParList">
			<!-- 数据表格 -->
			<table class="layui-hide" id="caseList" lay-filter="caseList"></table> 
		</div>
		<!-- ToolBar -->            
		<script type="text/html" id=caseListToolBar>
  			<a class="layui-btn layui-btn-xs" lay-event="execute">执行</a>
		</script>  
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
		elem:'#caseList',
		url:'list.html',
		method:'post',
		limit:30,
	    limits:[30,60,90,],
	    even:true,
	    cols: [[
			{type:'checkbox'},
	 	    {field:'id', title: '编号', width:90,sort: false},
	 	    {field:'name', title: '接口名称',width:240},
	 	    {field:'casename',title:'用例名称',width:350},
	 	    {field:'parameters', title: '请求参数',width:350},
	 	    {field:'method', title: '命令方法',width:350},
	 	    {field:'ctime', title: '创建时间',width:170,templet: '<div>{{layui.util.toDateString(d.ctime)}}</div>'},
	 	    {field:'utime', title: '修改时间',width:170,templet: '<div>{{layui.util.toDateString(d.utime)}}</div>'},
	 	    {fixed: 'right', title:'工具栏',align:'center',toolbar: '#caseListToolBar'},
		]],
		id:"caseList",
		page:{
			layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'], //自定义分页布局
			groups: 1,
			first: false,//不显示首页
			last: false,//不显示尾页
		}
	});
	
	//监听工具栏
	table.on('tool(caseList)',function(obj){
		layer.load(3);
		var data = obj.data;
		delete data.ctime;
		delete data.utime;
		$.post("/start.html",data,function(data){
			if(data.status==1){
				layer.closeAll("loading");
				layer.msg(data.msg);	
			}else{
				layer.msg('后台异常！');
			}
		},"json")
	});
	var active = {
		    getCheckData: function(){ //获取选中数据
		      layer.load(3);
		      var checkStatus = table.checkStatus('caseList');
		      var str="";
		      data = checkStatus.data;
		      for(var i = 0;i<data.length;i++){
		    	  str += data[i].id+",";
		      }
		      var ids = str.substring(0,str.length-1);
		      var params = {"ids":ids};
		      $.post("/batchStart.html",params,function(data){
					if(data.status==1){
						layer.closeAll("loading");
						layer.msg(data.msg);	
					}else{
						layer.msg('后台异常！');
					}
				},"json")
		    }
		  };
		  
		  $('.demoTable .layui-btn').on('click', function(){
		    var type = $(this).data('type');
		    active[type] ? active[type].call(this) : '';
		  });
});
</script>
</html>